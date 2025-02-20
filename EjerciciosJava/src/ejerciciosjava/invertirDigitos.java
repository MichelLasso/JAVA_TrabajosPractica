/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

//15

import java.util.Scanner;

public class invertirDigitos {
    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("----");
        System.out.println("Número invertido");
        System.out.println("----");
        System.out.println("Ingrese el número ");
        int n = scaner.nextInt();
        int invertido= 0;
        
        while(n>0){
            int digito= n %10;
            invertido= invertido * 10 +digito;
            n/=10;
        }
        System.out.println("El número invertido es: " + invertido);
    }
}
