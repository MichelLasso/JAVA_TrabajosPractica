
package notificaciónCliente_Ejercicio4;

public class ProcesadorDeOrdenes {
    // metodo con atributos tipo objeto Orden
    public void procesar(Orden orden) {
        if (orden.Isvalid() && new Repositorio().grabar(orden)) {
            NotificarPorEmail.getInstance().enviarMensajeDeConfirmacion(orden);
        }
    }
}
