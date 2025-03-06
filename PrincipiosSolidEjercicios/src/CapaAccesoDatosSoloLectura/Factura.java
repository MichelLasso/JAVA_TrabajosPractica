
package CapaAccesoDatosSoloLectura;

public class Factura implements InterfazObtenerFactura{

    @Override
    public Object[] GetAll() {
        System.out.println("Obtener todas las facturas...");
        return null;
    }

    @Override
    public Object GetById(Object id) {
        System.out.println("Otener facturas por id...");
        return null;
    }
    
}
