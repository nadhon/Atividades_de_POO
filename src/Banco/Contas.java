package Banco;

import java.util.ArrayList;

public class Contas {
    ArrayList<Conta> contas = new ArrayList<>();
    Conta c;

    public boolean addConta(Cliente cl, Conta c) {
        cl = new Cliente(cl.nome, cl.cpf);
        contas.add(c);
        return true;
    }

    public void consultarConta(int numero) {
        boolean contaEncontrada = false;
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                System.out.println("Conta encontrada");
                System.out.println("Nome " + c.getCliente() + " Saldo" + c.getSaldo() + " Numero" + c.getNumero());
                contaEncontrada = true;
            } else {
                System.out.println("Conta não encontrada");
            }
        }
    }

    public void alterarConta(int numero, int novoNumero,Cliente novoCliente,double novoSaldo) {
        boolean contaEncontrada = false;
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                System.out.println("Conta encontrada");
                c.setCliente(novoCliente);
                c.setNumero(novoNumero);
                c.setSaldo(novoSaldo);
                System.out.println("Conta alterada" + c.getNumero() + " " + c.getSaldo() + " " + c.getCliente());
                contaEncontrada = true;
            } else {
                System.out.println("Conta não encontrada");
            }
        }
    }

    public void excluirConta(int numero) {
        boolean contaEncontrada = false;
        if (contas.size() != 0) {
            for (int i = 0; i < contas.size(); i++) {
                if (contas.get(i).getNumero() == numero) {
                    System.out.println("Conta" + contas.get(i).getNumero() + "Foi deletada");
                    contas.remove(i);
                    contaEncontrada = true;
                } else {
                    System.out.println("Vazio");
                }
            }
        }
    }
    public void imprimirContas(){
        if(contas.size()!=0){
            for(Conta c: contas){
                System.out.println("Cliente"+c.getCliente()+" Numero da conta"+c.getNumero()+" Saldo da conta"+c.getSaldo());

            }
        }else{System.out.println("Sem conta");}
    }
}