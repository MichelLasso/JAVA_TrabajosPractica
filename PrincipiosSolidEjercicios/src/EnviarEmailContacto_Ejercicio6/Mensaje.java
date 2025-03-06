
package EnviarEmailContacto_Ejercicio6;

public class Mensaje implements IMailSender{
    public String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void Enviar(Contacto contacto, String cuerpoMensaje) {
        System.out.println("¡Hola! " + contacto.Nombre + " " + cuerpoMensaje );
    }
    
}
