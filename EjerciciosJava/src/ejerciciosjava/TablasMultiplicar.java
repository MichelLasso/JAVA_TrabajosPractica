package ejerciciosjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//3. Escribe un programa para imprimir tablas de multiplicar.
// 4. Escribe un programa para imprimir tablas de multiplicar en orden inverso.
public class TablasMultiplicar {
    public static void main(String[] args) {
        System.out.println("----");
        System.out.println("Tabla del 5");
        System.out.println("----");
        for (int i = 1; i <=10; i++) {
            int numero=i;
            int resultado= numero*5;
            System.out.println(i + "x" + "5= " + resultado);
        }
        
        System.out.println("----");
        System.out.println("Tabla del 5 Inversa");
        System.out.println("----");
        for (int i = 10; i >= 1; i--) {
            int numero= i;
            int resultado= numero*5;
            System.out.println(i + "x" + "5= " + resultado);
            
        }
    }
}
