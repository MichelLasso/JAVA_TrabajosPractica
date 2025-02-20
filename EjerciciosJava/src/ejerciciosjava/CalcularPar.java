/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 17

import java.util.Scanner;

public class CalcularPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int n= scanner.nextInt();
        
        for (int i = 2; i <= n/2; i++) {
            if (n%i ==0 ) {
                System.out.println("No primo");
                break;
            } else {
                System.out.println("primo");
                break;
            }
        }
    }
}
