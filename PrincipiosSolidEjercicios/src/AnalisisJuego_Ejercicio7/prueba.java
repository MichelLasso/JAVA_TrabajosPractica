/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisJuego_Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class prueba {
    public static void main(String[] args) {
        ArrayList<Enemy> lista = new ArrayList<>();
        
        lista.add(new KnifeEnemy());
        lista.add(new GunEnemy());
        
        Game game= new Game(lista);
        game.run();
    }
}
