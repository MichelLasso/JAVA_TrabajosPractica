
package CapaAccesoDatosSoloLectura;

public class DatosReadOnly implements metodosEscritura{

    @Override
    public void Insert(Object entity) {
        System.out.println("Insertando...");
    }

    @Override
    public void Update(Object id, Object entity) {
        System.out.println("Actualizando...");
    }

    @Override
    public void Delete(Object id) {
        System.out.println("Eliminando...");
    }
    
}
