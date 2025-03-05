/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisJuego_Ejercicio7;

import java.util.ArrayList;

public class KnifeEnemy implements Enemy{

    @Override
    public void doAction() {
        System.out.println("Ataca con Cuchillo");
    }

    @Override
    public void init(ArrayList<Enemy> enemigos) {
        enemigos.add(this);
    }
    
    
}
