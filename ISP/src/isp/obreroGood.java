/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp;

interface Programador{
    public void programar();
}

interface  obrero{
    public void construit();
}
public class obreroGood implements obrero{

    @Override
    public void construit() {
        System.out.println("Construyendo.....");
    }
    
    
}
