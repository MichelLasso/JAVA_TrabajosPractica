/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author HP
 */
public class ImprimirASCIl {
    public static void main(String[] args) {
        System.out.println("ASCII");
        for (int i = 'a'; i <='z'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                if ((int)j==i) {
                    System.out.println("Letra: " + j + " Número: " + i);
                }
               
            }
        }
    }
}
