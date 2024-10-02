package pack2;

import pack1.Conta;

public class MeuPrograma {
    public void testar(){
        Conta conta = new Conta();
        conta.debitar();
        // conta.creditar();
       // double s1 = conta.consultarSaldo();
        //double s2 = conta.saldo();
        String nome = conta.titular;
        //String numeroConta = conta.numero;

    }
}
