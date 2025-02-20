/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

//22

import java.util.Scanner;

public class BinarioDecimal {
    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("----");
        System.out.println("Número invertido");
        System.out.println("----");
        System.out.println("Ingrese el número binario");
        String binario = scaner.nextLine();
        
        int decimal= 0;
        int potencia=1;
        
        for (int i = binario.length()- 1; i >= 0; i++) {
            char digito= binario.charAt(i);
            
            
        }
        System.out.println("Binario: " + binario + " Decimal "+ decimal);
    }
}
