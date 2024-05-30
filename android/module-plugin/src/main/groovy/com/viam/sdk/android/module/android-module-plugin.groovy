//file:noinspection ConfigurationAvoidance
package com.viam.sdk.android.module

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

interface AndroidModulePluginExtension {
    Property<String> getMainEntryClass()

    Property<Boolean> getForce32Bit()

    Property<Boolean> getExecuteInProcess()
}

abstract class CopyModuleTask extends DefaultTask {
    @Input
    @Option(option = 'into', description = 'the directory to copy into')
    abstract Property<String> getInto()

    @Internal
    abstract Property<String> getFrom()

    @TaskAction
    def copy() {
        project.copy {
            from from.get()
            into into.get()
        }
    }
}

class AndroidModulePlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create('module', AndroidModulePluginExtension)

        // Note(erd): based on research, going the route of an android library makes it *very*
        // difficult to maintain the logic of how to create a "fat AAR" such that we have all
        // dependencies (including transitive) in one package. Using application naturally gets
        // us this but it may be confusing to the average consumer which is probably thinking
        // that a module is akin to a library, which it is, just not internally! This has the best
        // shot of surviving AGP upgrades and being "Google approved".
        project.getPluginManager().apply('com.android.application')

        project.afterEvaluate {
            if (!extension.mainEntryClass.isPresent()) {
                throw new Exception("Must set module.mainEntryClass")
            }
            def executeInProcess = extension.executeInProcess.getOrElse(false)

            project.android.applicationVariants.all { variant ->
                def outputFile = variant.outputs.first().outputFile
                def assembleTask = project.tasks.named("assemble${variant.name.capitalize()}")
                def outputDir = "${project.layout.buildDirectory.get()}/outputs/module/${variant.name}"

                def tmpModDir = "${project.layout.buildDirectory.get()}/tmp/module"
                project.file(tmpModDir).mkdirs()
                def modScript = executeInProcess ?
                        getClass().getResourceAsStream("/mod-in-process.sh").getText() :
                        getClass().getResourceAsStream("/mod.sh").getText()

                assembleTask.configure {
                    doLast {
                        project.copy {
                            from outputFile
                            into outputDir
                            rename {
                                'module.jar'
                            }
                        }

                        new File(tmpModDir, "mod.sh").text = modScript
                        project.exec {
                            commandLine "chmod", "+x", "${tmpModDir}/mod.sh"
                        }

                        project.copy {
                            from project.file("${tmpModDir}/mod.sh")
                            into outputDir
                            filter { line ->
                                line.
                                        replaceAll('__MAIN_ENTRY_CLASS__', extension.mainEntryClass.get()).
                                        replaceAll('__FORCE_32__', extension.force32Bit.getOrElse(false).toString())
                            }
                        }
                    }
                }

                def copyMetaTask = project.task("copyMeta${variant.name.capitalize()}") {
                    doLast {
                        new File(outputDir, "meta.json").text = getClass().getResourceAsStream("/meta.json").getText()
                    }
                }

                def tarModuleTask = project.task("tarModule${variant.name.capitalize()}", type: Exec) {
                    dependsOn assembleTask
                    commandLine "tar", "czf", "${outputDir}/module.tar.gz", "-C", outputDir, "mod.sh", "module.jar"
                }

                project.task("pushModuleAdb${variant.name.capitalize()}", type: Exec) {
                    dependsOn(copyMetaTask, tarModuleTask)
                    def destDir = "/sdcard/Download/${project.rootProject.projectDir.name}"
                    commandLine "bash", "-c", "adb shell mkdir -p ${destDir} && adb push ${outputDir}/module.tar.gz ${outputDir}/meta.json ${destDir}"
                }
            }
        }
    }
}
