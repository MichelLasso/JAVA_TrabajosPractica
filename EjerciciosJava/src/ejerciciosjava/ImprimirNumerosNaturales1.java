/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

// 1. Escribe un programa para imprimir todos los números naturales del 1 al n.
// 2. Escribe un programa para imprimir todos los números naturales en orden inverso.
// 9. Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n.
public class ImprimirNumerosNaturales1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("----");
            System.out.println("Imprimir números naturales del 1 al n");
            System.out.println("----");
            
            System.out.println("1. Normal");
            System.out.println("2. Inverso");
            
            int opcion= scanner.nextInt();
            if (opcion==1) {
                System.out.println("Ingrese el número");
                int n= scanner.nextInt();
                
                System.out.println("");
                for (int i = 1; i <= n; i++) {
                    System.out.println( i);
                }
                System.out.println("Suma de los números naturales: ");
                
                int suma=0;
                for (int i = 1; i <= n; i++) {
                    suma= suma+i;
                }
                System.out.println(suma);
                
            } else if(opcion==2){
                System.out.println("Ingrese el números");
                int n= scanner.nextInt();
                System.out.println("");
                for (int i = n; i >= 1; i--) {
                    System.out.println(i);
                }
            }
            
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally{
            scanner.close();
        }
    }
    
}
