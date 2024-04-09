# Android Module In-Process Example (Experimental)

This *experimental* version of a module allows you to run it in the same process as the Viam
Android App (as a thread calling `main`). Right now this is beneficial for getting access to its
ApplicationContext, something
the normal module cannot yet fully construct itself due to it running as a library
inside `app_process`. Use this at your own risk.

How to use:

* It's exactly the same as a normal module except in the `module` gradle configuration block, you
  use `executeInProcess = true`. This allows access to `Module.getParentContext()`.

What's not tested:

* Multiple modules running in-process
* Logging

See [examples/module](../module/README.md) for more info.
