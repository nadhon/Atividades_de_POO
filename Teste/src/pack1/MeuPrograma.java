package pack1;

public class MeuPrograma {
    public static void main(String[] args){
        //public void testar(){
            Conta conta = new Conta();
            conta.debitar();
           // conta.creditar();
            double s1 = conta.consultarSaldo();
            //double s2 = conta.saldo();
            String nome = conta.titular;
            String numeroConta = conta.numero;

        }
    }

