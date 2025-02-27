
package liga_baloncesto;

import java.util.Scanner;

public class Liga_Baloncesto {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       // crear un arreglo de partidos
        Partidos [] partidos = new Partidos[3];
        
        // agregar 2 datos de diferentes objetos al mismo arreglo de partidos
        partidos[0] = new Partidos_Liga("Liga", "1", "2", 1, 3, "juguando", "2024", 3 , "2");
        partidos[1] = new Partidos_PlayOffs("Octavos", "1", "2", 0, 1, "proceso", "2025", 1, "2");
        
        try {
            System.out.println("--------");
            System.out.println("| Liga de Baloncesto |");
            System.out.println("--------");
            
            System.out.println("| 1. Insertar partido");
            System.out.println("| 2. Ver los partidos");
            System.out.println("| 3. Cambiar el estado a un partido");
            System.out.println("| 4. Mostrar los ganadores de un partido especifico");
            int opcion= scan.nextInt();
            
            if (opcion==1) {
                System.out.println("--------");
                System.out.println("| Insertar un partido |");
                System.out.println("--------");
                System.out.println("1. Partido de liga");
                System.out.println("2. Partido PlayOffs");
                int opcionPartido= scan.nextInt();
                
                if (opcionPartido==1) {
                    System.out.println("----------");
                    System.out.println("Partido de Liga");
                    System.out.println("----------");
                    //insertar datos
                    System.out.println("Ingrese los datos ->");
                    scan.nextLine();
                    System.out.println("Tipo de partido ->");
                    String tipoP= scan.nextLine();
                    System.out.println("Equipo local ->");
                    String equipoL= scan.nextLine();
                    System.out.println("Equipo visitante ->");
                    String equipoV= scan.nextLine();
                    System.out.println("Cestas equipo local ->");
                    int cestasEL= scan.nextInt();
                    System.out.println("Cestas equipo visitante ->");
                    int cestasEV= scan.nextInt();
                    scan.nextLine(); // espacio
                    System.out.println("Fecha de partido ->");
                    String fechaP= scan.nextLine();
                    
                    
                    // agregar los datos ingresado a la variable partidos
                    partidos[2] = new Partidos_Liga(tipoP, equipoL, equipoV, cestasEL, cestasEV, "Jugando",  fechaP, 0, "");
                    
                    // Usar el método resultadopartido para ver quien es el ganador
                    partidos[2].resultadoPartido(equipoV, cestasEV, cestasEL, equipoL);
                    
                    // mostrar los datos del partido ingresado
                    partidos[2].mostrarDatos();
                    
                    System.out.println("El partido de liga ha sido guardado con éxito :)");
                    
                } else if(opcionPartido==2){
                    System.out.println("----------");
                    System.out.println("Partido PlayOffs");
                    System.out.println("----------");
                    
                    //insertar datos
                    System.out.println("Ingrese los datos ->");
                    scan.nextLine();
                    System.out.println("Tipo de ronda ->");
                    String tipoR= scan.nextLine();
                    System.out.println("Equipo local ->");
                    String equipoL= scan.nextLine();
                    System.out.println("Equipo visitante ->");
                    String equipoV= scan.nextLine();
                    System.out.println("Cestas equipo local ->");
                    int cestasEL= scan.nextInt();
                    System.out.println("Cestas equipo visitante ->");
                    int cestasEV= scan.nextInt();
                    scan.nextLine(); // espacio
                    System.out.println("Fecha de partido ->");
                    String fechaP= scan.nextLine();
                    
                    // agregar los datos ingresado a la variable partidos
                    partidos[2] = new Partidos_PlayOffs(tipoR, equipoL, equipoV, cestasEL, cestasEV, "Jugando", fechaP, 0, "");
                    
                    // Usar el método resultadopartido para ver quien es el ganador
                    partidos[2].resultadoPartido(equipoV, cestasEV, cestasEL, equipoL);
                    
                    // mostrar los datos del partido ingresado
                    partidos[2].mostrarDatos();
                }
                
            } else if(opcion==2){
                System.out.println("--------");
                System.out.println("| Ver los partidos |");
                System.out.println("--------");
                
                // Mostrar los datos aplicando un método
                for (int i = 0; i < partidos.length; i++) {
                    partidos[i].mostrarDatos();
                }
            } else if(opcion==3){
                System.out.println("--------");
                System.out.println("| Cambiar el estado de un partido |");
                System.out.println("--------");
                
                // mostrar los datos
                for (int i = 0; i < 2; i++) {
                    System.out.println("ID -> "+ i);
                    partidos[i].mostrarDatos();
                }
               
                System.out.println("Ingrese el id del partido que desea cambiar");
                int id= scan.nextInt();
                scan.nextLine();
                
                // bucle para buscar el partido ingresado
                for (int i = 0; i < partidos.length; i++) {
                    // comparar la posicion del partido con el número ingresado
                    if (i==id) {
                        System.out.println("---------");
                        System.out.println("Ingrese el nuevo estado -> ");
                        String newEstado=scan.nextLine();
                        
                        //cambiar el estado del partido
                        partidos[i].estado= newEstado;
                        
                        // mostrar los datos del partido actualizado
                        partidos[i].mostrarDatos();
                    }
                }
            } else if(opcion==4){
                System.out.println("--------");
                System.out.println("| Ver el ganadores |");
                System.out.println("--------");
                // recorrer los datos
                for (int i = 0; i < 2; i++) {
                    System.out.println("ID -> "+ i);
                    partidos[i].mostrarDatos();
                }
                
                System.out.println("Ingrese el id del partido ->");
                int idE= scan.nextInt();
                
                for (int i = 0; i < partidos.length; i++) {
                    // comparar la posicion del partido con el número ingresado
                    if (i==idE) {
                        System.out.println("---------");
                        System.out.println("Ganador -> " + partidos[i].ganador);
                        System.out.println("Puntaje -> " + partidos[i].resultado);
                        System.out.println("---------");
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally{
            scan.close();
        }
    }
    
}
