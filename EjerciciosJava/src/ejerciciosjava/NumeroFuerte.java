/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;



import java.util.Scanner;

public class NumeroFuerte {
    
    public static void main(String[] args) {
        //39
        Scanner scan = new Scanner(System.in);
        System.out.println("---");
        System.out.println("Numero fuerte n");
        System.out.println("---");
        System.out.println("Número: ");
        int n = scan.nextInt();
        long fac= 1;
        for (int i = 1; i <= n; i++) {
            fac*=i;
        }
        long nFuerte= fac + 1;
        System.out.println("El número fuerte es: " + nFuerte);
        //40
        int num=10000;
        /*long fac2= 1;
        System.out.println("----");
        System.out.println("Numero fuerte de 1-10000");
        System.out.println("----");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                
                fac2 *=j;
            }
            if (fac2 <= num) {
                System.out.println("El número fuerte es: " + (fac2+1));

            }
        }*/
        //41
        System.out.println("----");
        System.out.println("Numero Perfecto 1-10000");
        System.out.println("----");
        for (int i = 1; i <= num; i++) {
            int suma=0;
            for (int j = 1; j < i; j++) {
                if (i%j ==0) {
                    suma +=j;
                }
            }
            if (suma ==i) {
                System.out.println("Número: " + i);
            }
        }
        // 42
        System.out.println("----");
        System.out.println("Número Perfecto");
        System.out.println("----");
        System.out.println("Ingrese un número: ");
        int nPerfecto= scan.nextInt();
        for (int i = 1; i <= nPerfecto; i++) {
            int suma2=0;
            for (int j = 1; j < i; j++) {
                if (i%j ==0) {
                    suma2 +=j;
                }
            }
            if (suma2 !=i) {
                System.out.println(false);
                break;
            }
            
        }
    }
}
