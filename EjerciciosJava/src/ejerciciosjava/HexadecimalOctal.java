/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

//  25
public class HexadecimalOctal {
    public static void main(String[] args) {
        String h="A2C";
        int d= Integer.parseInt(h, 16);
        String o= Integer.toOctalString(d);
        System.out.println(o);
    }
}
