
package liga_baloncesto;

public class Partidos {
    //Atributos
    public String equipo_local;
    public String equipo_visitante;
    public int cestas_equipo_local;
    public int cestas_equipo_visitante;
    public String estado;
    public String fecha_partido;
    public int resultado;
    public String ganador;
    
    //constructor vacio
    public Partidos() {}
    
    //constructor compuesto

    public Partidos(String equipo_local, String equipo_visitante, int cestas_equipo_local, int cestas_equipo_visitante, String estado, String fecha_partido, int resultado, String ganador) {
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.cestas_equipo_local = cestas_equipo_local;
        this.cestas_equipo_visitante = cestas_equipo_visitante;
        this.estado = estado;
        this.fecha_partido = fecha_partido;
        this.resultado = resultado;
        this.ganador = ganador;
    }
    
    
    public void mostrarDatos(){
        System.out.println("| -------------------------- |");
        System.out.println("| Equipo local -> " + equipo_local + " |");
        System.out.println("| Equipo visitante -> " + equipo_visitante + " |");
        System.out.println("| Cestas del equipo visitante -> "+ cestas_equipo_visitante + " |");
        System.out.println("| Cestas del equipo local -> " + cestas_equipo_local + " |");
        System.out.println("| Estado -> " + estado + " |");
        System.out.println("| Fecha del partido -> " + fecha_partido + " |");
        System.out.println("| Ganador -> " + ganador + " |");
        System.out.println("| Resultado del juego -> " + resultado + " |");
        System.out.println("| -------------------------- |");
    }
    
    public void resultadoPartido(String equipoV, int cestasEV, int cestasEL, String equipoL){
        
        if (cestasEL>cestasEV) {
            resultado = cestasEL;
            ganador = equipoL;
            estado= "Finalizado";
        } else if(cestasEL==cestasEV) {
            resultado= 0;
            ganador= "Empate";
            estado= "Finalizado";
        }
        else {
            resultado = cestasEV;
            ganador = equipoV;
            estado= "Finalizado";
        }
    }
    
}
