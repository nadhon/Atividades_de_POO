package Atividades;

import java.util.Scanner;

public class SituacaodoAluno {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("---primeiro bimestre---");
        System.out.println("Digite sua primeira nota: ");
        double nota1 = in.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = in.nextDouble();
        double soma1= nota1+nota2;
        double primeira_unidade= soma1/2;
        System.out.println("---Segunda unidade---");
        System.out.println("Digite sua primeira nota: ");
        double primeiranota= in.nextDouble();
        System.out.println("Digite sua segonda nota: ");
        double segundanota= in.nextDouble();
        double soma2=primeiranota+segundanota;

        double segunda_unidade=soma2/2;

        double media=((primeira_unidade*4)+(segundanota*6))/10;
        if(media>=7){
            System.out.println("Sua média ponderada é "+media+" Aprovado");
        }
        if(media<=4){
            System.out.println("Sua média ponderada é "+media+"Prova Final");
        }
        else{
            System.out.println("Sua média ponderada é "+media+" Reprovado");
        }
    }
}
