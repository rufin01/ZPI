# Zespołowy Projekt Inżynierski

## Instrukcja odpalenia

### Biblioteki

##### JavaFX:

https://gluonhq.com/products/javafx/

##### RichTextFX:

https://github.com/FXMisc/RichTextFX/releases/download/v0.10.5/richtextfx-fat-0.10.5.jar

##### Pierdolnik do kształtów 3D:

https://repo1.maven.org/maven2/org/fxyz3d/fxyz3d/0.5.2/fxyz3d-0.5.2.jar

##### Wszystkie biblioteki należy wrzucić do folderu libs

##

#### Konfiguracja wstępna

* File -> Reload All from Disk && Invalidate Caches / Restart...
* File -> Project Structure
    * Project (SDK, Project compiler output - ustaw na folder out)
    * Modules ("RichTextFX" oraz "Pierdolnik do kształtów 3D")
    * Libraries (Punkt "Add the JavaFX library﻿" - https://www.jetbrains.com/help/idea/javafx.html?fbclid=IwAR0bH4XfeMjbF5JQRrvYriKi284PiOGw3hVEyBQmKbwEEm1ciS2eE3GIaIs#vm-options)
* Folder src -> Mark Directory as -> Sources Root
* Run Main
* Run -> Edit Configurations...
   * Punkt "Add VM options" (https://www.jetbrains.com/help/idea/javafx.html?fbclid=IwAR0bH4XfeMjbF5JQRrvYriKi284PiOGw3hVEyBQmKbwEEm1ciS2eE3GIaIs#vm-options)
* No i powinno być git (u mnie działa)