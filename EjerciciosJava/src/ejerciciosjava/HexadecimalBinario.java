/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 26
public class HexadecimalBinario {
    public static void main(String[] args) {
        String h= "A2C";
        String b= Integer.toBinaryString(Integer.parseInt(h,16));
        System.out.println("Hexadecimal: "+h);
        System.out.println( "Binario: "+b);
    }
    
}
