package Atividades;

public class Conta { 
    public int numero;
    public double saldo;
    Cliente cliente;

    public Conta(String n, double s, Cliente c) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    protected void creditar(double v) {
    }
}
