/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FactoresPrimos {
    public static void main(String[] args) {
        //45
        Scanner scaner= new Scanner(System.in);
        System.out.println("----");
        System.out.println("Factores Primos");
        System.out.println("----");
        System.out.println("Ingrese el número ");
        int n = scaner.nextInt();
        
        for (int i = 2; i <= n; i++) {
            boolean primo=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0) {
                    primo=false;
                    break;
                }
                
            }
            if (primo && n %1== 0) {
                System.out.println(i);
            }
        }
    }
}
