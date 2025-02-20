/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

//19

import java.util.Scanner;

public class MasGrandePequeñoN {
    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        int nGrande= Integer.MIN_VALUE;
        int nPequeño= Integer.MAX_VALUE;
        boolean continuar=true;
        System.out.println("----");
        System.out.println("Numero mas grande y pequeño");
        System.out.println("----");
        while(continuar){
            
            System.out.println("Ingrese el número, o si deseas terminar de ingresar números (s)");
            String n = scaner.nextLine();
            
            if (n.equalsIgnoreCase("s")) {
                continuar=false;
            } else {
                int num= Integer.parseInt(n);
                
                if (num > nGrande) {
                    nGrande= num;
                }
                if (num < nPequeño) {
                    nPequeño= num;
                }
            }
        }
        System.out.println("Número grande: " + nGrande);
        System.out.println("Número pequeño: " + nPequeño);

    }
}
