/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_polimosfismo;

public class Sistema_Gestion_Empleados {
    public static void main(String[] args) {
        //Arreglo que mezcla los empleados fijos y los empleados por hora.
        Empleado [] empleado = new Empleado[2];
        
        //Agregar datos al arreglo del objeto empleados fijos
        empleado[0] = new EmpleadosFijos(5, "Juan", 800000);
        
        //Agregar datos al arreglo del objeto empleados por hora
        empleado[1] = new EmpleadosPorHora(10, "Carlos", 0);
        
        //uso del metodo calcular la bonificacion de los empleados fijos
        //empleado[0].calcularBonificacion();
        
        //uso del metodo calcular la bonificacion de los empleados por hora
        //empleado[1].calcularBonificacion();
        
        //for para recorrer el arreglo empleado (Se encuentran los trabajadores fijos y por hora)
        for (int i = 0; i < empleado.length; i++) {
            System.out.println("------");
            System.out.println( empleado[i].getNombre() + " " +  empleado[i].getSalario());
            empleado[i].calcularBonificacion();
            System.out.println("------");
        }
    }
}
