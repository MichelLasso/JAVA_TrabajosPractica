
package cuentabancaria;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scan= new  Scanner (System.in);
        CuentaAhorro [] cuentas= new CuentaAhorro[1];
        cuentas[0]= new CuentaAhorro(0, "123B", 100000, "  Alexa");
        
        try {
            System.out.println("----");
            System.out.println("Cuenta Ahorro");
            System.out.println("----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Aplicar Interes");
            int opcion= scan.nextInt();
            if (opcion==1) {
                System.out.println("----");
                System.out.println("Depositar");
                System.out.println("----");
                System.out.println("Ingrese la cantidad a depositar");
                double depositar= scan.nextDouble();
                for (int i = 0; i < cuentas.length; i++) {
                    if (cuentas[i].getNumeroCuenta().equals("123B")) {
                        cuentas[i].depositarCuenta(depositar);
                    }
                }
                
            } else if(opcion==2){
                System.out.println("----");
                System.out.println("Retirar");
                System.out.println("----");
                System.out.println("Ingrese la cantidad a retirar");
                double retirar= scan.nextDouble();
                for (int i = 0; i < cuentas.length; i++) {
                    if (cuentas[i].getNumeroCuenta().equals("123B")) {
                        cuentas[i].retirarCuenta(retirar);
                    }
                }
            } else if (opcion==3) {
                System.out.println("----");
                System.out.println("Aplicar Interes");
                System.out.println("----");
                System.out.println("Ingrese el interes que desea aplicar");
                double tasaInteresE= scan.nextDouble();
                for (int i = 0; i < cuentas.length; i++) {
                    if (cuentas[i].getNumeroCuenta().equals("123B")) {
                        cuentas[i].aplicarInteres(tasaInteresE);
                        System.out.println("-----");
                        System.out.println("|Estado final de la cuenta ->");
                        System.out.println("|Nombre del usuario -> " + cuentas[i].getNombrePersona());
                        System.out.println("|Número de la cuenta -> "+ cuentas[i].getNumeroCuenta());
                        System.out.println("|Tasa de interes -> " + cuentas[i].getTasaInteres());
                        System.out.println("|Saldo -> "+cuentas[i].getSaldo());
                        System.out.println("-----");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally {
            scan.close();
        }
                
    }
}
