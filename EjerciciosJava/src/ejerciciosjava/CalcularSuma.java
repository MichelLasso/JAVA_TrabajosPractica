/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
//16

import java.util.Scanner;

public class CalcularSuma {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el número");
        int num= scanner.nextInt();
        String numString= String.valueOf(num);
        int suma= 0;
        for (int i = 0; i < numString.length(); i++) {
            char digito= numString.charAt(i);
            suma += Character.getNumericValue(digito);
        }
        System.out.println(suma);
        
    }
}
