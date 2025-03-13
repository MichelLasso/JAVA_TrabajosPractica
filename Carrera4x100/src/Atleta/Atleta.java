
package Atleta;

public class Atleta extends Thread{
    // atributo independiente, por lo tanto cada atleta tendrá un número distinto y el tiempo de carrera
    private int numeroAtleta;
    private long tiempoAtleta;
    
    // es un atributo estatico, por lo tanto debe ser compartido con los demás atletas
    private static final Object Testigo= new Object();
    private static boolean tDisponible= true; // testigo disponible
    public Atleta(int numeroAtleta) {
        this.numeroAtleta = numeroAtleta;
    }

    @Override
    public void run() {
        try{
            // bloque de sincronización, su función es no dejar entrar todos los atletas a la vez y esto se hace
            // mediante la verificación de si el atributo compartido está en uso.
            synchronized (Testigo) {
                // si el testigo es falso (ocupado) espera.
                while(!tDisponible){ 
                    Testigo.wait();
                }
                // testigo disponible
                tDisponible= false;
                System.out.println("El atleta número " + numeroAtleta + " quiere empezar a correr");
                System.out.println("-----------");
               
                System.out.println("Testigo está ocupado con el atleta ->" + numeroAtleta);
                System.out.println( " Atletas esperando..");
                
                System.out.println("El atleta número " + numeroAtleta + " empezó...");
               
                tiempoAtleta= System.currentTimeMillis(); // timepo de inicio
                
                Thread.sleep((long) (Math.random() * 2000) + 2000); // simulador de carrera haciendo que el hilo duerma un tiempito
                
                tiempoAtleta= System.currentTimeMillis() - tiempoAtleta; // calcular tiempo
                
                System.out.println("El atleta número " + numeroAtleta + " terminó con éxito su carrera :) en un tiempo de " + tiempoAtleta);
                
               // suelta al testigo
                tDisponible= true;
                Testigo.notifyAll(); 
                System.out.println("terminé (aviso)");
                System.out.println("----------------");
                
            }
        } catch (InterruptedException i){
            Thread.currentThread().interrupt(); // los hilos deben esperar a que el testigo este disponible
        }
    }
    
    static class Carrera{
        public static void main(String[] args) {
            Atleta a= new Atleta(1);
            Atleta b= new Atleta(2);
            Atleta c= new Atleta(3);
            Atleta d= new Atleta(4);
            
            a.start();
            b.start();
            c.start();
            d.start();
            
            // inicia la carrera con el primer atleta
            synchronized (Testigo) {
                Testigo.notify();
            }
        }
    }
}
