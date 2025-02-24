
package poo_java;


public class equipo {
    int id;
    int idLider;
    String tipo;

    public equipo(int id, int idLider, String tipo) {
        this.id = id;
        this.idLider = idLider;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "equipo{" + "id=" + id + ", idLider=" + idLider + ", tipo=" + tipo + '}';
    }
    
}
