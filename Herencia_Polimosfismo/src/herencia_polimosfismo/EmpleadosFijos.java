
package herencia_polimosfismo;

public class EmpleadosFijos extends Empleado{
    public int horasExtras;

    public EmpleadosFijos() {
    }

    public EmpleadosFijos(int horasExtras, String nombre, double salario) {
        super(nombre, salario); // herencia
        this.horasExtras = horasExtras;
    }

    @Override
    public void calcularBonificacion() {
        double valorBase= getSalario() + (getSalario() * 0.20);
        // verificar si tiene horas extras
        if (horasExtras!=0) {
            for (int i = 0; i < horasExtras; i++) {
                // cada hora vale 20000
                valorBase= valorBase + 20000;
            }
            //imprimir el resultado
            System.out.println(valorBase + " Trabajó " + horasExtras + " horas extras :)");
        } else {
            System.out.println("No trabajó horas extras");
            System.out.println(valorBase);
        }
    }
    
    
}
