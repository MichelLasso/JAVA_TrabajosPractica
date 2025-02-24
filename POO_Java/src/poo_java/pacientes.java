
package poo_java;

public class pacientes {
    int id;
    int idPersonas;
    int edad;

    public pacientes(int id, int idPersonas, int edad) {
        this.id = id;
        this.idPersonas = idPersonas;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "pacientes{" + "id=" + id + ", idPersonas=" + idPersonas + ", edad=" + edad + '}';
    }
    
    
}
