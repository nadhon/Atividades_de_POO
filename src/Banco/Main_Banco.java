package Banco;

import java.util.Scanner;

public class Main_Banco {
    public static void main(String[] args){
        Contas conta=new Contas();
        Scanner in = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("\nMenu do Banco");
            System.out.println("1 -Criar cliente");
            System.out.println("2- Criar conta");
            System.out.println("3-Transferir");
            System.out.println("4- consultar contas");
            System.out.println("5- Sair");
               op= in.nextInt();
               switch (op){
                   case 1:
                       System.out.println("Informe o nome do cliente: ");
                       String nome=in.next();
                       System.out.println("Informe o Cpf: ");
                       String Cpf=in.next();

               }
        }while (op!=6);
    }
}
