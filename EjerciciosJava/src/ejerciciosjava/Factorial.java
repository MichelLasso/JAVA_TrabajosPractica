/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 13. Escribe un programa para encontrar el factorial de cualquier número.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("FACTORIAL");
            System.out.println("Ingrese el número: ");
            int n= scanner.nextInt();
            int m=1;
            for (int i = 1; i <= n; i++) {
                m= m*i;
            }
            System.out.println(m);
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally {
            scanner.close();
        }
        
    }
}
