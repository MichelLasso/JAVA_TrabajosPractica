package herencia_polimosfismo;

public class Herencia_Polimosfismo {
    /*
    EJERCICIO 1: Jerarquía de Clases en el Dominio de Vehículos 
    
    ARCHIVOS-> Vehiculos (clase padre), Motocicletas (clase hija), Coches (clase hija), Jerarquia_Clases_Dominio_Vehiculos (ejecuta el código).
    
    -Crear una jerarquía de clases que represente diferentes tipos de vehículos.
    -Atributos privados: marca (String) y modelo (String).
    -Constructor para inicializar los atributos.
    -Método mostrarDetalles() que imprima la información del vehículo.
    -Cada una debe heredar de Vehiculo.
    -Cada subclase debe tener un atributo adicional (por ejemplo, numeroPuertas para Coche y tipoManubrio para Motocicleta).
    -Sobrescribir el método mostrarDetalles() para incluir la información adicional.
    -Instanciar objetos de Coche y Motocicleta.
    -Invocar el método mostrarDetalles() en cada objeto para demostrar el polimorfismo.
    -Usa el modificador @Override al sobrescribir métodos.
    -Asegúrate de invocar el constructor de la superclase con super(marca, modelo).
    
    EJERCICIO 2: Sistema de Gestión de Empleados

    ARCHIVOS -> Empleado (clase padre), EmpleadoFijo (clase hija), EmpleadosPorHora (clase hija), Sistema_Gestion_Empleados (ejecuta el codigo).
    
    -Desarrollar una aplicación que gestione diferentes tipos de empleados utilizando herencia y polimorfismo.
    -Atributos privados: nombre (String) y salario (double).
    -Constructor para inicializar los atributos.
    -Método calcularBonificacion() que devuelva un valor base (por ejemplo, 10% del salario).
    -Su bonificación podría ser mayor, por ejemplo, 20% del salario.
    -Añade un atributo horasTrabajadas (int) y modifica el cálculo de bonificación en función de las horas.
    -Sobrescribir el método calcularBonificacion() en cada subclase según la lógica específica.
    -Crear un arreglo o lista de objetos de tipo Empleado (mezclando empleados fijos y por horas).
    -Recorrer la lista e invocar calcularBonificacion() para cada empleado, demostrando el comportamiento polimórfico.
    -Utiliza el polimorfismo para tratar a todos los empleados como instancias de la clase Empleado y, al iterar, cada 
    uno ejecutará su versión específica del método.
    */
}
