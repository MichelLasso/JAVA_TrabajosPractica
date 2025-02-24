
package poo_java;

public class CitasMedicas {
    int id;
    int idPacientes;
    int idPabellones;
    String fecha;
    int idMedico;

    public CitasMedicas(int id, int idPacientes, int idPabellones, String fecha, int idMedico) {
        this.id = id;
        this.idPacientes = idPacientes;
        this.idPabellones = idPabellones;
        this.fecha = fecha;
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "CitasMedicas{" + "id=" + id + ", idPacientes=" + idPacientes + ", idPabellones=" + idPabellones + ", fecha=" + fecha + ", idMedico=" + idMedico + '}';
    }
    
    
}
