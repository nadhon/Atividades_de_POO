package Banco;

public class Conta {
    private int numero;
    Cliente cliente;
    public double saldo;

    public Conta(String c,double s,Cliente cl){
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void creditar(double valor){
        saldo = saldo + valor;
    }
}
