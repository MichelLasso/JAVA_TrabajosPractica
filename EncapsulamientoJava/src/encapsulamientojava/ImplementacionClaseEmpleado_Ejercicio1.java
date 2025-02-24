
package encapsulamientojava;

import java.util.Scanner;

public class ImplementacionClaseEmpleado_Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Empleado empleado1= new Empleado(1, "Mario", 0);
        try {
            System.out.println("----");
            System.out.println("Empleado");
            System.out.println("----");
            System.out.println("1. Ver datos del empleado"); //Falta
            System.out.println("2. Actualizar el salario del empleado");
            
            int opcion = scan.nextInt();
            
            if (opcion==1) {
                System.out.println("----");
                System.out.println("Datos del empleado ->");
                System.out.println("----");
            } else if(opcion==2){
                System.out.println("----");
                System.out.println("Actalizar salario");
                System.out.println("----");
                System.out.println("Ingrese el salario del empleado");
                double salarioA= scan.nextInt();
                empleado1.verificarSalario(salarioA);
                System.out.println("El salario es -> "+ empleado1.getSalario());
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally{
            scan.close();
        }
    }
}
