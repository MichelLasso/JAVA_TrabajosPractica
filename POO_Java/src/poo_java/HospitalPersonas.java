
package poo_java;


public class HospitalPersonas {
    int id;
    int idHospital;
    int idPersonad;

    public HospitalPersonas(int id, int idHospital, int idPersonad) {
        this.id = id;
        this.idHospital = idHospital;
        this.idPersonad = idPersonad;
    }

    @Override
    public String toString() {
        return "HospitalPersonas{" + "id=" + id + ", idHospital=" + idHospital + ", idPersonad=" + idPersonad + '}';
    }
    
}
