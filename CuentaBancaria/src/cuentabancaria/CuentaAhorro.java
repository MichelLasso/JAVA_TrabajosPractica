package cuentabancaria;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, String numeroCuenta, double saldo, String nombrePersona) {
        super(numeroCuenta, saldo, nombrePersona);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void aplicarInteres(double tasaInteresE){
        double saldoE = getSaldo() + (getSaldo() * tasaInteresE / 100);
        tasaInteres= tasaInteres + tasaInteresE;
        setSaldo(saldoE);
        System.out.println("Nuevo saldo: " + getSaldo());
    }
    public void depositarCuenta(double depositar){
        if (depositar>0) {
            System.out.println("-----");
            System.out.println("Saldo-> " + getSaldo());
            setSaldo(getSaldo()+ depositar);
            System.out.println("Saldo actualizado->" + getSaldo());
            System.out.println("-----");
        }else {
            System.out.println("La cantidad ingresada no es válida");
        }
    }
    
    public void retirarCuenta(double retirar){
        if (retirar>0) {
            System.out.println("-----");
            System.out.println("Saldo-> " + getSaldo());
            double saldoRetirar= getSaldo() - retirar;
            if (saldoRetirar<0) {
                System.out.println("No se puede retirar, fondos insuficientes");
            }else {
                setSaldo(getSaldo()- retirar);
                System.out.println("Saldo actualizado->" + getSaldo());
                System.out.println("-----");
            }
        }else {
            System.out.println("La cantidad ingresada no es válida");
        }
    }
            
}
