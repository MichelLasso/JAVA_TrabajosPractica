
package poo_java;

public class hospitales {
    int id;
    String nombre;
    String ubicacion;

    public hospitales(int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "hospitales{" + "id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
