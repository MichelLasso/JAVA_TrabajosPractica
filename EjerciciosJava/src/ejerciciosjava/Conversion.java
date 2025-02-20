/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;


public class Conversion {
    public static void main(String[] args) {
        // 29
        int decimal = 123;
        String binario= Integer.toBinaryString(decimal);
        System.out.println("Decimal: " + decimal + " Binario: " + binario);
    
        //30
        String octal= Integer.toOctalString(decimal);
        System.out.println("Binario: " + binario + " Octal: "+ octal);
        
        //31
        System.out.println("Binario: " + binario + " Decimal: " + Integer.parseInt(binario, 2));
        
        //32
        int b= 110111111;
        System.out.println("Binario: " + b + " Hexadecimal: " + Integer.toHexString(b));
        //33
        int octal2=12;
        String binario2= Integer.toBinaryString(Integer.parseInt(String.valueOf(octal2), 8));
        System.out.println("Octal : " + octal2 + " Binario: " + binario2);
        
        //34
        String octal3= "12";
        int decimal2= Integer.parseInt(octal3,8);
        System.out.println("Octal: " + octal3 + " Decimal: " + decimal2);
        
        //35
        String octal4= "52";
        int decimal3= Integer.parseInt(octal4,8);
        String hexadecimal= Integer.toHexString(decimal3);
        System.out.println("Octal: " + octal3 + " Hexadecimal: " + hexadecimal);
    }
}
