
package poo_java;

public class actividades {
    int id;
    String nombre;
    String fecha;
    String ubicacion;

    public actividades(int id, String nombre, String fecha, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "actividades{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
