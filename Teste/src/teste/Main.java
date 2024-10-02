package teste;

public class Main {
    public static void main(String[] args){
        Conta  c=new Conta("123",25);
        System.out.println(c.saldoConta());

        c.Creditar(500);
        System.out.println(c.saldoConta());
    }
}
