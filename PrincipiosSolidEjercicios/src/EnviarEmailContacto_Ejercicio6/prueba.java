
package EnviarEmailContacto_Ejercicio6;

import java.util.Scanner;

// Código incorrecto
/*
public class Contacto {
    public string Nombre;
    public string CuentaBancaria;
    public string Email;
}

public interface IMailSender {
    void Enviar(Contacto contacto, string cuerpoMensaje);
}

TAMBIEN SE HIZO EL CÓDIGO FUNCIONAL 

 SOLUCION
-- PRINCIPIO SOLID NO IMPLEMENTADO -> Principio de responsabilidad única
-- ¿ Por qué? -> en la clase contacto se estaban asumiendo dos responsabilidades, 1. contacto y la 2. Datos financieros
-- solucion -> Se separo las responsabilidades creando una clase para contacto y otra calse de cuenta bancaria quien hereda los atributos de la clase padre "Contacto".
*/

public class prueba {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        try{
            // crear objeto de contacto
            Contacto contacto= new Contacto("Fabio", "fabio@gmail.com");
            
            //Ingresar el mensaje
            System.out.println("Mensaje a enviar: ");
            String cuerpoMensaje= scan.nextLine();
            
            // crear un objeto "mensaje" con el mensaje ya ingresado;
            Mensaje m= new Mensaje(cuerpoMensaje);
            
            // Imprimir mensaje al contacto
            m.Enviar(contacto, cuerpoMensaje);
        } finally{
            scan.close();
        }
    }
}
