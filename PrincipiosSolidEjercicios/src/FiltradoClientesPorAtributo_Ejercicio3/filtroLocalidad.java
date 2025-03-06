
package FiltradoClientesPorAtributo_Ejercicio3;


public class filtroLocalidad implements Filtro{
    public Localidad localidad;

    public filtroLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public boolean aplicar(Cliente cliente) {
        return cliente.localidad== localidad;
    }
    
}
