
package encapsulamientojava;

import java.util.Scanner;


public class InventarioTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Producto[] productos = new Producto[5];
        productos [0]= new Producto("A1", "Acondicionador", 5, 25000);
        productos [1]= new Producto("B2", "Jabón", 20, 5000);
        productos [2]= new Producto("C3", "Crema corporal hidratante", 10, 20000);
        productos [3]= new Producto("D4", "Exfoliante de manos", 20, 10000);
        productos [4]= new Producto("E5", "Exfoliante corporal de fresa", 50, 20000);
        
    
        try {
            System.out.println("----");
            System.out.println("Inventario");
            System.out.println("----");
            System.out.println("1. Actualizar stock");
            System.out.println("2. Actualizar precio de los productos");
            int num= scan.nextInt();
            
            if (num==1) {
                System.out.println("----");
                System.out.println("Actualizar Stock del producto A1");
                System.out.println("----");
                String codigoE= "A1"; //producto
                
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i].getCodigo().equals(codigoE)) {
                        System.out.println("Ingrese la cantidad que desea agregar (Si desea Eliminar ingrese el número en negativo)");
                        int cantidadE= scan.nextInt();
                        //metodo
                        productos[i].actualizarStock(cantidadE);
                        
                        break;
                    } else{
                        System.out.println("El producto con el codigo ingresado no existe");
                    }
                }
                
                productos[0].mostrarProductos(productos);
                
            } else if(num==2){
                System.out.println("----");
                System.out.println("Actualizar el precio del producto B2 JABON");
                System.out.println("----");
                //codigo del producto
                String actualizarPr= "B2";
                System.out.println("Ingrese el nuevo precio: ");
                double precio= scan.nextDouble();
                
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i].getCodigo().equals(actualizarPr)) {
                        productos[i].verificarPrecio(precio);
                    }
                }
                productos[0].mostrarProductos(productos);
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally{
            scan.close();
        }
    }
}
