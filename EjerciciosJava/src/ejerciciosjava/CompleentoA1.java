/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;


public class CompleentoA1 {
    public static void main(String[] args) {
        //36
        System.out.println("----");
        System.out.println("Complemento A1 y A2");
        System.out.println("----");
        int n=15; //numero
        int A1= ~n;
        System.out.println("Complemento A1 del numero " + n + " es: " + A1);
        //37 reutilizamos los datos de arriba
        int A2= A1 + 1;
        System.out.println("Complemento A2 del numero " + n + " es: " + A2);
    }
}
