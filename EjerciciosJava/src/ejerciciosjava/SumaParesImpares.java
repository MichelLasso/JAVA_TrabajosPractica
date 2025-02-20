/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

//10. Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
// 11. Escribe un programa para encontrar la suma de todos los números impares entre 1 y n.

import java.util.Scanner;

public class SumaParesImpares {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        try {
            System.out.println("--");
            System.out.println("Suma de números pares");
            System.out.println("Ingrese el número");
            int n= scanner.nextInt();
            int suma= 0;
            for (int i = 1; i <= n; i++) {
                if (i%2==0) {
                    suma=suma+i;
                } 
            }
            System.out.println("Suma de n par ->" + suma); //suma n par
            
            int sumaImpar=0;
            for (int i = 1; i <=n; i++) {
                if (i%2 !=0) {
                    sumaImpar=sumaImpar+i;
                }
            }
            System.out.println("Suma de n Impar ->" + sumaImpar);
        } catch (Exception e) {
            System.out.println("ERROR");
        } finally {
            scanner.close();
        }
        
    }
}
