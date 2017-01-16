

## custom language support

![](.openapi_notes_images/language_api.png)

## Intentions vs. Inspections

* Inspections: Error warning + fix
    * Error/warning indicators in code and at the right side
* Local refactorings (like expression conversion)
    * More hidden: just show up when using Alt-Enter

## External jars

https://confluence.jetbrains.com/display/IDEADEV/Getting+Started+with+Plugin+Development

This creates a .jar or .zip archive file to be used to install and publish your plugin. If the plugin module does not depend on libraries, the .jar archive will be created. Otherwise, a .zip archive will be created that will include all the plugin libraries specified in the project settings.


## plugin loading

http://stackoverflow.com/questions/11492301/how-does-intellij-idea-manage-plugin-dependencies

IDEA uses custom classloader, if it doesn't find the required class in the plugin distribution, it's searched in all the jars located in IDEA_HOME/lib directory.

References
----------

https://confluence.jetbrains.com/display/IDEADEV/Developing+Custom+Language+Plugins+for+IntelliJ+IDEA


## Skeletons

skeltons are saved under  (see module deps --> libaries)
/Users/brandl/Library/Caches/IntelliJIdea2016.1/plugins-sandbox/system/r_skeletons/-1481726564
