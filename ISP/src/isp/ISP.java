/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isp;

/**
 *
 * @author HP
 */
public class ISP {

    /**
     * Incorrecto
     * Una interfaz obliga a clases a 
     * implementar métodos que no necesitan
     * 
     * Correcto
     * Interfaces pequeñas y específicas para cada 
     * tipo de funcionalidad.
     */
    public static void main(String[] args) {
        // incorrecto
        System.out.println("Incorrecto------------");
        Programador obrero= new obreroBad();
        obrero ingeniero= new IngenieroBad();
        
        ingeniero.construit();
        obrero.programar();
        
        // correcto
        System.out.println("Correcto------------");
        Programador progra= new ingenieroGood();
        obrero obrero2= new obreroGood();
        
        progra.programar();
        obrero2.construit();
    }
    
}
