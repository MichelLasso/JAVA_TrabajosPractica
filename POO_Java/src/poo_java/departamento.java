
package poo_java;

public class departamento {
    int id;
    String nombre;
    String ubicacion;

    public departamento(int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "departamento{" + "id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
