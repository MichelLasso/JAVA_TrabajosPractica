/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

// 18
public class MCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("numero 1");
            int num1= scanner.nextInt();
            System.out.println("numero 2");
            int num2= scanner.nextInt();
            
            if (num1%num2==0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        } finally {
            scanner.close();
        }
    }
}
