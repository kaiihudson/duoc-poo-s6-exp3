# Evaluación Formativa - Semana 8 - Desarrollo Orientado a Objetos I

## Autor del proyecto
- Autor: Sebastian Rodriguez R.
- Sección: 003A
- Carrera: Analista Programador Computacional
- Sede: Online
---
## Descripción general del sistema.
> Este proyecto corresponde a la semana 8 de clases, en este proyecto se revisa la capacidad de Java de extender clases, generando un proyecto, en el cual se trabaja esta capacidad para mostrar información referente a Unidades Operativas.
> Se agrega también la capacidad de seguir una estructura única a través de una interfaz que permita crear una estructura común para un set de data.
---
## Estructura de Carpetas
```
├──src
|   └───main
|       └───java
|           └───org
|               └───salmonttapp
|                   ├───common // includes data validations
|                   ├───data // includes data handlers
|                   ├───model // includes models
|                   |     ├───colaborador // includes data refencing the Colaborador class
|                   |     ├───common // includes Interfaces
|                   |     └───unidadOperativa // includes data referencing the unidadOperativa class                    
|                   └───ui // includes main invocation and ui
|                        └─── forms // includes ui forms
```
---
## Clases Principales
### Modelos
1. Unidad Operativa:
> Clase abstracta desde la cual se extiende Planta Proceso y Centro Cultivo
2. Planta Proceso:
> Clase que representa una planta de proceso, agrega los valores referentes a la capacidad de la planta.
3. Centro Cultivo:
> Clase que representa un centro de cultivo, agrega los valores referentes a la producción del centro.
4. Colaborador
> Clase abstracta desde la cual se extiende Externo, Interno, Proveedor
5. Externo
> Clase que representa un externo trabajando para una empresa, agrega los valores del número de contrato del trabajador.
6. Interno
> Clase que representa un interno trabajando para una empresa, agrega los valores de la fecha del contrato, sueldo, y número de equipo.
7. Proveedor
> Clase que representa un proveedor trabajando para una empresa, agrega los valores de tipo y número de contrato.
### Interfaces
1. Registrable
> Contrato que representa las funciones mínimas esperables para una clase.
### Controladores
1. Gestor Entidades
> Clase que se encarga de la generación de los objetos y la modificación de estos para ser mostrados (Alcance de proyecto).
---
## HOW TO COMPILE / RUN

1. Clonar este repositorio.
2. Abrir este proyecto en un IDE java (JAVA 25)
3. Ejecutar el archivo `Main.java` desde el paquete `ui`
---
Fecha de entrega: 13/12/2025