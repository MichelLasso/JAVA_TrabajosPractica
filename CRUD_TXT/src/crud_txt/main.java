/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_txt;
import static crud_txt.CRUD_TXT.*;
public class main {
    public static void main(String[] args) {
        cargarDatos();
        listarPersonas();
        listarProductos();
        
        //crear personas
        int id= 0;
        String nombre= "Laura";
        int edad= 23;
        creatPersona(id, nombre, edad);
        
        int id2=1;
        String nombre2= "Lucas";
        int edad2= 25;
        creatPersona(id2, nombre2, edad2);
        
        // crear producto
        creatProducto(0, "Jabón", 23.0);
        creatProducto(1, "Hipinto", 15.0);
        
        //eliminar personas por ID1
        deletePersona(0);
        deleteProducto(0);
        
        //actualizar nombre persona
        personaActualizar(1, "Jhon");
        ProductoActualizar(1, "Coca-Cola");
    }
}
