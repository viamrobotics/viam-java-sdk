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

            project.android.applicationVariants.all { variant ->
                def outputFile = variant.outputs.first().outputFile
                def assembleTask = project.tasks.named("assemble${variant.name.capitalize()}")
                def outputDir = "${project.layout.buildDirectory.get()}/outputs/module/${variant.name}"

                def tmpModDir = "${project.layout.buildDirectory.get()}/tmp/module"
                project.file(tmpModDir).mkdirs()
                def modScript = getClass().getResourceAsStream("/mod.sh").getText()

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

                        project.copy {
                            from project.file("${tmpModDir}/mod.sh")
                            into outputDir
                            filter { line ->
                                line.
                                        replaceAll('__MODULE_JAR_PATH__', './module.jar').
                                        replaceAll('__MAIN_ENTRY_CLASS__', extension.mainEntryClass.get()).
                                        replaceAll('__FORCE_32__', extension.force32Bit.getOrElse(false).toString())
                            }
                        }
                    }
                }

                project.task("copyModule${variant.name.capitalize()}", type: CopyModuleTask) {
                    dependsOn assembleTask

                    from.set(outputDir)
                }

                project.task("pushModuleAdb${variant.name.capitalize()}", type: Exec) {
                    dependsOn assembleTask

                    def outputDirPush = "${project.layout.buildDirectory.get()}/outputs/module_adb/${variant.name}"
                    doFirst {
                        project.copy {
                            from project.file("${tmpModDir}/mod.sh")
                            into outputDirPush
                            filter { line ->
                                line.
                                        replaceAll('__MODULE_JAR_PATH__', '/sdcard/Download/module.jar').
                                        replaceAll('__MAIN_ENTRY_CLASS__', extension.mainEntryClass.get()).
                                        replaceAll('__FORCE_32__', extension.force32Bit.getOrElse(false).toString())
                            }
                        }
                        project.copy {
                            from project.file("${outputDir}/module.jar")
                            into outputDirPush
                        }
                    }
                    commandLine "adb", "push", "${outputDirPush}/module.jar", "${outputDirPush}/mod.sh", "/sdcard/Download"
                }
            }
        }
    }
}
