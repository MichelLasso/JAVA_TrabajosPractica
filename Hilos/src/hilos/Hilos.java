
package hilos;

// 1. extendiendo la clase thread
public class Hilos extends Thread{

    @Override
    public void run() {
        System.out.println("Hola, soy un hilo");
    }
    
    public static void main(String[] args) {
        Hilos hilo= new Hilos();
        hilo.run();
    }
    // 2. interfaz Runnable
    //la interfaz runnable solo tiene el método run, 
    // que es lo que ejecutará el hilo
    static class hiloRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Hola, soy un hilo hecho con Runnable");
        }
        
        public static void main(String[] args) {
            // crear una instancia de la clase y luego pasarla a un objeto thread
            hiloRunnable hiloR= new hiloRunnable();
            Thread thread= new Thread(hiloR);
            
            // metodo start inicia la ejecución del hilo.
            thread.start();
        }
    }
    // 3. Utilizando la clase thread con un objeto runnable
    static class main{
        public static void main(String[] args) {
            Runnable runnable = new Runnable() {
                public void run() {
                    System.out.println("Hola soy un hilo :)");
                }
            };
            Thread t= new Thread(runnable);
            t.start();
        }
    }
}
