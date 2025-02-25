
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
    
    // Ver productos
    public void mostrarProductos(Producto [] productos){
        for (int i = 0; i< productos.length; i++) {
            System.out.println("--CODIGO--> "+ productos[i].getCodigo());
            System.out.println("Nombre-> " + productos[i].getNombre());
            System.out.println("Precio ->" + productos[i].getPrecio());
            System.out.println("Cantidad ->" + productos[i].getCantidad());
            System.out.println("-------");
        }
    }
    // precio no puede ser negativa
    public void verificarPrecio(double precio){
        if (precio>0) {
            this.precio= precio;
            System.out.println("Precio agregado con éxito :)");
        } else {
            System.out.println("Ingrese el valor positivo");
        }
    }

    //acctualizar stock y verificar que cantidad no quede en negativo
    public void actualizarStock(int cantidadE){
        if (cantidadE>0) {
            cantidad= cantidad + cantidadE;
            System.out.println("Se actualizó el stock con éxito");
        } else if(cantidadE<0){
            int resta = cantidad + cantidadE;
                if (resta<0) {
                    System.out.println("La cantidad ingresada suepera al numero actual en el Stock");
                } else if(resta ==0 || resta>0){
                    cantidad= cantidad - cantidadE;
                    System.out.println("La cantidad fue actualizada con éxito");
                }
        }
        
    }
    
}
