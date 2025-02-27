
package liga_baloncesto;

public class Partidos_Liga extends  Partidos{
    public String TipoPartido;
    
    public Partidos_Liga() {}

    public Partidos_Liga(String TipoPartido, String equipo_local, String equipo_visitante, int cestas_equipo_local, int cestas_equipo_visitante, String estado, String fecha_partido, int resultado, String ganador) {
        super(equipo_local, equipo_visitante, cestas_equipo_local, cestas_equipo_visitante, estado, fecha_partido, resultado, ganador);
        this.TipoPartido = TipoPartido;
    }

    
    @Override
    public void mostrarDatos() {
        System.out.println("| -------------------------- |");
        System.out.println("| Equipo local -> " + equipo_local + " |");
        System.out.println("| Equipo visitante -> " + equipo_visitante + " |");
        System.out.println("| Cestas del equipo visitante -> "+ cestas_equipo_visitante + " |");
        System.out.println("| Cestas del equipo local -> " + cestas_equipo_local + " |");
        System.out.println("| Estado -> " + estado + " |");
        System.out.println("| Fecha del partido -> " + fecha_partido + " |");
        System.out.println("| Tipo de partido -> " + TipoPartido + " |");
        System.out.println("| Ganador -> " + ganador + " |");
        System.out.println("| Resultado del juego -> " + resultado + " |");
        System.out.println("| -------------------------- |");
    }

    @Override
    public void resultadoPartido(String equipoV, int cestasEV, int cestasEL, String equipoL) {
        super.resultadoPartido(equipoV, cestasEV, cestasEL, equipoL); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
}
