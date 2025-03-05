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
public interface Enemy {
    
    void doAction();
    
    void init(ArrayList<Enemy> enemigos);
}
