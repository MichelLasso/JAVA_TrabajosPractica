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
        
        //33
        String o= "123";
        System.out.println("Octal: " + o + " Binario: " + Integer.toBinaryString(o));
        //34
        
        //35
        
    }
}
