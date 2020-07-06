# Zespołowy Projekt Inżynierski

## Instrukcja konfiguracji środowiska

### Biblioteki

##### JavaFX:

https://gluonhq.com/products/javafx/

##### RichTextFX:

https://github.com/FXMisc/RichTextFX/releases/download/v0.10.5/richtextfx-fat-0.10.5.jar

##### Do serializacji hashmap:

https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/

##### ANTLR

https://www.antlr.org/download.html


##
#### Potrzebne pliki
* Project Structure (File -> Project Structure):
    * Libraries (lib files):
        * JavaFX SDK 11.0.2
        * Antlr Intellij plugin v4
    * Modules (.jar files):
        * gson 2.6.2
        * Richtextfx-fat-0.10.15
##
#### Konfiguracja wstępna
* File -> Reload All from Disk && Invalidate Caches / Restart...
* File -> Project Structure
    * Project (SDK, Project compiler output - ustaw na folder out)
    * Modules (RichTextFX, GSon)
    * Libraries 
        * Punkt "Add the JavaFX library﻿" - https://www.jetbrains.com/help/idea/javafx.html?fbclid=IwAR0bH4XfeMjbF5JQRrvYriKi284PiOGw3hVEyBQmKbwEEm1ciS2eE3GIaIs#add-javafx-lib
        * ANTLR jar file
* Folder src -> Mark Directory as -> Sources Root
* Run Main
* Run -> Edit Configurations...
   * Punkt "Add VM options" (https://www.jetbrains.com/help/idea/javafx.html?fbclid=IwAR0bH4XfeMjbF5JQRrvYriKi284PiOGw3hVEyBQmKbwEEm1ciS2eE3GIaIs#vm-options)
