#
# Principios Solid

Los SOLID son una serie de principios y buenas prácticas que nos ayudarán a que el código sea mas limpio, más mantenible, mas escalable a futuro y menos propenso a errores.
#
## Principio de responsabilidad única (S)
En este primer principio solid (S) nos dice que la clase debe tener una única razón para cambiar. Por lo tanto la clase solo puede cambiar según la funcionalidad antes definida, esto con el fin de tener un código más legible y entendible.

### Caracteristicas
* Define una responsabilidad concreta para cada clase.
* Evita que el código cambie constantemente.
* Previene el acoplamiento de métodos para una clase.
* Promueve la cohesión.
* Dividir las responsabilidades en diferentes clases ayudan a tener un código mas limpio y entendible.

#
## Principio de Abierto/Cerrado (O)
En este segundo principio (O) nos dice que el código debe estar abierto para su extensión pero cerrado para su modificación. 

### Caracteristicas

* Permite extender el comportamiento de una clase sin modificar su código.
* Evita que los objetos existentes cambien con frecuencia.
* Hace que las cadenas de dependencia sean menos frágiles.
* Mejora la estabilidad de la aplicación.
* Facilita la incorporación de nuevas funcionalidades sin rescribir grandes partes del código.

#
## Principio de sustitución de Liskov
En este tercer principio (L) nos dice que si la clase padre tiene comportamientos y propiedades estos pueden ser capaces de ser utilizados en la clase hija, quien hereda todo de su clase padre.

### Caracteristicas
* Permite que los objetos sean reemplazados por instancias de sus subtipos(clase hija).
* Garantiza que las clases hijas puedan heredar y utilizar los comportamientos y propiedades de la clase padre.
* Evita que se introduzcan errores o comportamientos inesperados.
* Permite que las clases hijas puedan ser utilizadas de manera coherente en lugar de sus tipos base.

#
## Principio de segregación de interfaces (I)
En este cuarto principio (I) nos dice que la clase nunca debe extender de interfaces con métodos que no usa. Se busca que las interfaces sean lo más específicas posibles en donde cada clase solo implemente lso métodos que necesita.

### Caracteristicas
* Se busca que las interfaces sean específicas y pequeñas.
* Se evita que las clases implementen métodos innecesarios.
* Se promueve la modularidad y la flexibidad.
* Se facilita la adaptación del software a diferentes contextos.
* Se evita obligar a los clientes a implmentar interfaces que no se usan.

#
## Principio de inversión de la tendencia (D)
En este último principio (D) nos dice que los módulos de alto nivel no deberían de depender de los módulos d bajo nivel.  

### Caracteristicas
* Facilita la interoperabilidad entre componentes o módulos del sistema.
* Simplifica la gestión de cambios.
* Facilita las pruebas de integración.
* Es fundamental para la implementación de muchos patrones de diseño.