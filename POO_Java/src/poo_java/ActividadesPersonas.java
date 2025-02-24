
package poo_java;

public class ActividadesPersonas {
    int id;
    int idActividad;
    int idPersona;

    public ActividadesPersonas(int id, int idActividad, int idPersona) {
        this.id = id;
        this.idActividad = idActividad;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "ActividadesPersonas{" + "id=" + id + ", idActividad=" + idActividad + ", idPersona=" + idPersona + '}';
    }
    
}
