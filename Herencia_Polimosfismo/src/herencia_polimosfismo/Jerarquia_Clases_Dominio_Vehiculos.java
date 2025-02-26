
package herencia_polimosfismo;

public class Jerarquia_Clases_Dominio_Vehiculos {
    public static void main(String[] args) {
        //polimorfismo: La clase padre vehiculo almacena los datos de la clase hija coche
        Vehiculos vehiculo= new Coche(5, "L", "2K");
        vehiculo.mostrarDetalles();
        
        // La clase padre vehiculo almacena los datos de la clase hija motocicleta
        Vehiculos vehiculo1 = new Motocicleta("2K", "G", "3-14G8");
        vehiculo1.mostrarDetalles();
    }
}
