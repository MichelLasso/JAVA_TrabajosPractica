/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificaciónCliente_Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class NotificarPorEmail {
    
    private static NotificarPorEmail instance;

    private NotificarPorEmail() {} 

    public static NotificarPorEmail getInstance() {
        // si esta vacio lo inicializa
        if (instance == null) {
            instance = new NotificarPorEmail();
        }
        return instance;
    }
    // se crea la lista tipo objeto orden / guardar el dato, llevar un registro
    public List<Orden> ordenes = new ArrayList<Orden>();

    public void enviarMensajeDeConfirmacion(Orden orden) {
        // si orden es verdadero se envia el mensaje de cnfirmacción
        ordenes.add(orden);
    }
}
