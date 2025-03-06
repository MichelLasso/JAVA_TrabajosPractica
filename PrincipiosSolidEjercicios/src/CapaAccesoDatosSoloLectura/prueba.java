
package CapaAccesoDatosSoloLectura;
/*
public interface IOad {
    void Insert(object entity);
    void Update(object id, object entity);
    void Delete(object id);
    object[] GetAll();
    object GetById(object id);
}

public class FacturaOadDatosReadOnly : IOad {
    public void Insert(object entity) {
        throw new ObjAccDatosReadOnlyException();
    }
    public void Update(object id, object entity) {
        throw new ObjAccDatosReadOnlyException();
    }
    public void Delete(object id) {
        throw new ObjAccDatosReadOnlyException();
    }
    public object[] GetAll() {
        // Obtener todas las facturas
    }
    public object GetById(object id) {
        // Obtener factura por ID
    }
}

SOLUCION

-Principio solid no implementado -> principio de responsabilidad unica
-¿ Por qué? -> En el código podemos ver que la clase asumia dos responsabilidades, 1. obtener facturas, 2. Métodos de esccritura (leer, actualizar, eliminar)
y la interfaz asumia  dos roles, asiq al implementarse en la clase se manejaba con throw new (manejo de errores "excepciones")
- SOLUCION-> Se dividió las interfaz en dos, una encargada de las facturas y la otra encargada de los metodos de escritura.
*/
public class prueba {
    public static void main(String[] args) {
        metodosEscritura datos = new DatosReadOnly();
        datos.Insert("simulador..");
        datos.Update(1, datos);
        datos.Delete(1);
        
        InterfazObtenerFactura obtener= new Factura();
        obtener.GetAll();
        obtener.GetById(1);
    }
}
