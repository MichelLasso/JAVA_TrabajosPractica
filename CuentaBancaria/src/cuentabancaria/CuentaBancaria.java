package cuentabancaria;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String nombrePersona;

    public CuentaBancaria(String numeroCuenta, double saldo, String nombrePersona) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombrePersona = nombrePersona;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
}
