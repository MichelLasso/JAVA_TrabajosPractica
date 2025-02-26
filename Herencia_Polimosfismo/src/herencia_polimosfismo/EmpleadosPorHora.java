
package herencia_polimosfismo;

public class EmpleadosPorHora extends Empleado{
    public int horasTrabajadas;

    public EmpleadosPorHora() {
    }

    public EmpleadosPorHora(int horasTrabajadas, String nombre, double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calcularBonificacion() {
        double valorBase= 0;
        // saber si trabajo
        if (horasTrabajadas!=0) {
            //recorrer el numero de horas que trabajó para sumarle las horas de trabajo
            for (int i = 0; i < horasTrabajadas; i++) {
                // cada hora vale 20000
                valorBase= valorBase + 20000; //agregar el resultado
            }
            //Imprimirlo
            System.out.println(valorBase + " Trabajó " + horasTrabajadas + " horas :)");
        } else {
            System.out.println("No trabajó");
            System.out.println(valorBase);
        }
    }
    
    
}
