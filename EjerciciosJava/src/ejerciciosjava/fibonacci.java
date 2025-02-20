/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        //32
        Scanner scaner= new Scanner(System.in);
        System.out.println("----");
        System.out.println("Fibonacci");
        System.out.println("----");
        int n= scaner.nextInt();
        int [] fibonacci= new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println("FIBONACCI ->");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
        }
        
    }
}
