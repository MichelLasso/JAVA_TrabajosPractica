// se crea una lista para almacenar a todos los enemigos
    // y no depender de diferentes variables q almacenan a diferentes enemigos, sino que
    // tener una variable que los almacene a todos en una lista, por si se desea agregar mas 
    // ataques de enemigos.
    // La clase padre ya no depende de las clases hijas (Principio de inversión de dependencia).
    // La clase padre ahora puede estar abierto para su extensión pero cerrado para su modificación,
    // se logró esto gracias a la interfaz ya que al agregarle un método que es el como ataca el enemigo solo 
    // se hereda a los hijos y se pueden crear diferentes tipos de enemigos con ataques, sin tener que 
    
    // Codigo incorrecto
    /* public class Game {
    private KnifeEnemy enemy1;
    private GunEnemy enemy2;

    public void init() {
        enemy1 = new KnifeEnemy();
        enemy2 = new GunEnemy();
    }

    void run() {
        while (!endGame) {
            enemy1.doActionStab();
            enemy2.doActionShoot();
        }
    }
}

public class GunEnemy {
    public void doActionShoot() { }
}

public class KnifeEnemy {
    public void doActionStab() { }
}*/
   
// ERRORES ENCONTRADOS DE LOS PRINCIPIOS SOLID

// 1. La clase padre depende de las clases hijas --> principio solid mal implementado (PRINCIPIO DE INVERSION DE LA DEPENDENCIA)
// ¿por qué? -> La clase padre tenía una dependecia directa de las clases hijas al crear los atributos privados de tipo objeto.
// Solucion -> se creó una interfaz Enemy, asi la clase Game ya no depende directamente de las clases del tipo de ataque las cuales
// tambien violaban otro principio solid.

// 2. El código no estaba abierto para su expansión, habia que modificarlo si esto se quería hacer --> principio solid mal implementado (PRINCIPIO DE ABIERTO Y CERRADO)
// ¿por qué -> La clase Game al depender directamente de las clase del tipo de ataque del enemigo, solo inicializaba esas dos ya creadas,
// si llegado al caso se deseen añadir mas objetos del tipo de enemigo habria que modificar el código Game.
// Solución -> Se creo en la interfaz un método abstracto vacío (inicializa los objetos), el cual se hereda a los objetos que implementen la interfaz.

package AnalisisJuego_Ejercicio7;

import java.util.ArrayList;

public class Game {
    // Lista que alamcena a todos los enemigos sin importar su tipo de ataque.
    private ArrayList<Enemy> enemigo= new ArrayList<>();
    private boolean endGame= false;
    
    public Game(ArrayList<Enemy> enemigo){
        this.enemigo=enemigo;
    }
    
   public void run(){
       while(!endGame){
           for(Enemy e: enemigo){
               e.doAction();
           }
           break;
       }
       
   }
}
