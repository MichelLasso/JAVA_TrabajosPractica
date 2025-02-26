
package herencia_polimosfismo;

public class Motocicleta extends Vehiculos{
    private String tipoManubrio;

    public Motocicleta() {
    }

    public Motocicleta(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca ->" + getMarca() + " Modelo ->" + getModelo() + " Tipo de manubrio ->" + getTipoManubrio());
    }
    
    
}
