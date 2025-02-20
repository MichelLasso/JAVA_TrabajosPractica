/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

//43

public class Armstrong {
    public static void main(String[] args) {
        int n= 1634;
        int suma=0;
        int temp= n;
        int digitos= String.valueOf(n).length(); // cada digito del numero
        
        while(temp !=0){
            int digito = temp%10; //ultimo digito
            suma += (int) Math.pow(digito, digitos);
            temp /=10; //eliminar ultimo digito
        }
        if (suma == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
