
package encapsulamientojava;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {}
    
    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Cantidad no puede ser negativa
    public void verificarPrecio(double precio){
        if (precio>0) {
            this.precio= precio;
            System.out.println("Precio agregado con éxito :)");
        } else {
            System.out.println("Ingrese el valor positivo");
        }
    }

    
    
    
}
