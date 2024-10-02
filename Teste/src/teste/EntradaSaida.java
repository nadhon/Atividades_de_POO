package teste;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        String nome= in.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = in.nextInt();
        System.out.println("Digite seu salario: ");
        double salario=in.nextDouble();
        System.out.println("Nome:"+nome+" Idade: "+idade);
        System.out.println("Salario: "+salario);
    }
}
