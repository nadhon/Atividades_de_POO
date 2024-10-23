package Atividades;

public class Poupanca extends Conta {
    private double juros;
    public Poupanca(String n, double s, double j, Cliente c){
        super(n,s,c);
        this.juros =j;
    }
    public void creditar(double valor){
        saldo = saldo + valor;
    }
    public void rederJuros(){
        double saldo = this.getSaldo();
        this.creditar(saldo*juros);
    }
}
