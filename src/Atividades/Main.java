package Atividades;

public class Main {
    public static void main(String[] args){
        RepositorioContas repositorio =new RepoistorioConta();
        Cliente cliente = new Cliente("maria","045.139.552-83");
        Conta c =  new Conta("27.192-3",580.73,cliente);
        Poupanca p = new Poupanca("21.342-7",400.50,0.01,cliente);
    }
}
