
package poo_java;

public class pabellon {
    int id;
    String nombre;
    String sala;
    int idDepartamento;

    public pabellon(int id, String nombre, String sala, int idDepartamento) {
        this.id = id;
        this.nombre = nombre;
        this.sala = sala;
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "pabellon{" + "id=" + id + ", nombre=" + nombre + ", sala=" + sala + ", idDepartamento=" + idDepartamento + '}';
    }
    
}
