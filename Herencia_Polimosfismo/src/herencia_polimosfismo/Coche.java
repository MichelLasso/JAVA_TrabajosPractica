
package herencia_polimosfismo;

public class Coche extends Vehiculos{
    private int numPuertas;

    public Coche() {
    }

    public Coche(int numPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca ->" + getMarca() + " Modelo ->" + getModelo() + " Número de puertas ->" + getNumPuertas());
    }
    
}
