
package poo_java;

public class DepartamentoPersonas {
    int id;
    int idDepartamento;
    int idPersonas;
    String fechaVinculacion;
    double salario;

    public DepartamentoPersonas(int id, int idDepartamento, int idPersonas, String fechaVinculacion, double salario) {
        this.id = id;
        this.idDepartamento = idDepartamento;
        this.idPersonas = idPersonas;
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "DepartamentoPersonas{" + "id=" + id + ", idDepartamento=" + idDepartamento + ", idPersonas=" + idPersonas + ", fechaVinculacion=" + fechaVinculacion + ", salario=" + salario + '}';
    }
    
    
}
