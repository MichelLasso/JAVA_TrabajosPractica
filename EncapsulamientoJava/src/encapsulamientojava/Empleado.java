
package encapsulamientojava;

public class Empleado {
    //Atributos
    private int id;
    private String nombre;
    private double salario;
    
    // Constructor vacio
    public Empleado() {}
    
    //constructor compuesto
    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    //Se obtiene el nombre
    public String getNombre() {
        return nombre;
    }
    //Se obtiene el salario
    public double getSalario() {
        return salario;
    }
    //Se cambia el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //método para verificar si el salario ingresado es positivo
    public void verificarSalario(double cantidad) {
        if (cantidad>0) {
            salario= cantidad;
            System.out.println("Salario actualizado con éxito :)");
        } else {
            System.out.println("ERROR: Ingrese un valor positivo :)");
        }
    }
    
    
}
