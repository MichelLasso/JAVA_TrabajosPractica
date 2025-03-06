/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuditTransfMonet_Ejercicio1;

/**
 *
 * @author HP
 */
public class AuditTransfMonet {

    // SOLID no cumplido-> Principio de responsabilidad única
    // antes esta clase se encargaba de dos cosas
    private NotificacionTransferencia notificador;

    public AuditTransfMonet(NotificacionTransferencia notificador) {
        this.notificador = notificador;
    }

    public void transferenciaRealizada(Transferencia transferencia) {
        if (esTransferenciaImportante(transferencia)) {
            notificador.enviarNotificacion(transferencia);
        }
    }

    private boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }

}
