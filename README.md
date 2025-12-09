# Evaluación Formativa - Semana 6 - Desarrollo Orientado a Objetos I

## Autor del proyecto
- Autor: Sebastian Rodriguez R.
- Sección: 003A
- Carrera: Analista Programador Computacional
- Sede: Online
---
## Descripción general del sistema.
> Este proyecto corresponde a la semana 7 de clases, en este proyecto se revisa la capacidad de Java de extender clases, generando un proyecto, en el cual se trabaja esta capacidad para mostrar información referente a Unidades Operativas
---
## Estructura de Carpetas
```
├──src
   └───main
       └───java
           └───org
               └───salmonttapp
                   ├───data // includes data handlers
                   ├───model // includes models
                   └───ui // includes main invocation
```
---
## Clases Principales
### Modelos
1. Unidad Operativa:
> Clase desde la cual se extiende al resto de la aplicacion, entrega metodos base para generar subclases
2. Planta Proceso:
> Clase que representa una planta de proceso, extiende desde Unidad Operativa, agrega los valores referentes a la capacidad de la planta.
3. Centro Cultivo:
> Clase que representa un centro de cultivo, extiende desde Unidad Operativa, agrega los valores referentes a la producción del centro.
### Controladores
1. Gestor Unidades
> Clase que se encarga de la generacion de los objetos y la modificacion de estos para ser mostrados (Alcance de proyecto).
---
## HOW TO COMPILE / RUN

1. Clonar este repositorio.
2. Abrir este proyecto en un IDE java (JAVA 25)
3. Ejecutar el archivo `Main.java` desde el paquete `ui`
---
Fecha de entrega: 25/11/2025