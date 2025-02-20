/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

// 14 Escribe un programa para calcular el valor de un número elevado a l apotencia de otro
public class NumeroElevadoPontecia {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int n=scanner.nextInt();
        System.out.println("Ingrese el número de potencia: ");
        int p= scanner.nextInt();
        int potencia= 1;
        for (int i = 0; i < p; i++) {
            potencia= potencia*n;
        }
        System.out.println(potencia);
    }
}
