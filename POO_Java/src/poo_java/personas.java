
package poo_java;

public class personas {
    int id;
    String nombre1;
    String apellido1;
    String nombre2;
    String apellido2;
    String titulo;
    String direccion;
    String fechaNacimiento;
    String fechaIngreso;

    public personas(int id, String nombre1, String apellido1, String nombre2, String apellido2, String titulo, String direccion, String fechaNacimiento, String fechaIngreso) {
        this.id = id;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.titulo = titulo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "personas{" + "id=" + id + ", nombre1=" + nombre1 + ", apellido1=" + apellido1 + ", nombre2=" + nombre2 + ", apellido2=" + apellido2 + ", titulo=" + titulo + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
