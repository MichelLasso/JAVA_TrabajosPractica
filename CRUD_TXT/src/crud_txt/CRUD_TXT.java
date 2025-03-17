
package crud_txt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CRUD_TXT {

    //archivo que se va a leer
    private static String archivo= "archivo.txt";
    private static List<persona> personas= new ArrayList<>(); // convertir en una lista la clase personas
    private static List<Producto> productos= new ArrayList<>();
    
    // Cargar los datos persistentes
    public static void cargarDatos(){
        personas.clear(); // vaciar todo lo que contiene
        productos.clear();
        // buffer lee lo que hay en un archivo.
        try (BufferedReader reader= new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea=reader.readLine())!= null){
                if (linea.startsWith("P")) {
                    personas.add(persona.fromString(linea));
                } else if(linea.startsWith("PR")){
                    productos.add(Producto.fromString(linea));
                }
            }
            
        } catch(Exception e){
         System.out.println("No se puede cargar el archivo. Se procede a crear uno nuevo");
        }
    }
    public static void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No se puede listar las personas porq no hay");
        } else{
            for (persona p: personas) {
                System.out.println(p);
            }
        }
    }
    public static void listarProductos() {
        if (personas.isEmpty()) {
            System.out.println("No se puede listar los productos porq no hay");
        } else{
            for (Producto pro: productos) {
                System.out.println(pro);
            }
        }
    }
    // funciones crud
    //guardar los cambios que se hagan en el archivo
    private static void guardarEnArchivo(){
        try (BufferedWriter w= new BufferedWriter(new FileWriter(archivo))){
            for (persona p: personas) {
                w.write(p.toString() + " | ");
            }
            for (Producto pro: productos) {
                w.write(pro.toString() + " | ");
            }
        } catch (Exception e) {
            System.out.println("Error al guardar los cambios en el archivo ");
        }
    }
    //actualizar nombre por id persona
    public static void personaActualizar(int id, String NewName){
        for (persona per: personas) {
            if (per.getId()==id) {
                per.setNombre(NewName);
                guardarEnArchivo();
                return;
            }else {
                System.out.println("La Persona ingresada no éxiste");
            }
        }
    }
    // actualizar nombre por id producto
    public static void ProductoActualizar(int id, String Newname){
        for(Producto pro: productos){
            if (pro.getId()==id) {
                pro.setId(id);
                guardarEnArchivo();
                return;
            } else{
                System.out.println("El id ingresado del producto no existe");
            }
        }
    }
    // eliminar persona por id
    public static void deletePersona(int id){
        personas.removeIf(p -> p.getId() == id);
        System.out.println("Persona eliminada :)");
        guardarEnArchivo();
    }
    //eliminar producto por id
    public static void deleteProducto(int id){
        personas.removeIf(p -> p.getId()==id);
        System.out.println("Producto eliminado :)");
    }
    // crear persona
    public static void creatPersona(int id, String nombre, int edad){
        persona crarPersona= new persona(id, nombre, edad);
        guardarEnArchivo();
    }
    //crear producto
    public static void creatProducto(int id, String nombre, double precio){
        Producto crearProducto= new Producto(id, nombre, precio);
        guardarEnArchivo();
    }
}
