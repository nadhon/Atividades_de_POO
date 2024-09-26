package Atividades;

import java.util.Scanner;

public class CalculodQuatroMedias {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int i=0;
        int soma=0;
        while (i<4){
            System.out.println("Digite sua nota: ");
            Double nota = in.nextDouble();
            soma += nota;
            i++;
        }
        double media = soma/2;
        System.out.println("Sua média é "+media);
    }
}
