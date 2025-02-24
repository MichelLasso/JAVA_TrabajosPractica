
package poo_java;

public class EquipoPersonal {
    int id;
    int idEquipo;
    int idPersona;

    public EquipoPersonal(int id, int idEquipo, int idPersona) {
        this.id = id;
        this.idEquipo = idEquipo;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "EquipoPersonal{" + "id=" + id + ", idEquipo=" + idEquipo + ", idPersona=" + idPersona + '}';
    }
    
}
