/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 21
public class Suma100Y200 {
    public static void main(String[] args) {
        int suma= 0;
        System.out.println("Números enteros divisibles por 9 entre 100 y 200");
        for (int i = 100; i <= 200; i++) {
            
            if (i%9==0) {
                suma= suma+i;
                System.out.println(i);
            } 
        }
        System.out.println("Suma: " +suma);
    }
}
