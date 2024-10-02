package teste;

import java.util.Scanner;

public class calculodemedia {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double primeiranota= in.nextDouble();
        System.out.println("Digite sua segunda nota");
        double segundanota= in.nextDouble();
        double soma= primeiranota+segundanota;
        double firth_Unity=soma/2;

        if(firth_Unity>=7){
            System.out.println("Aprovado");
        } else if(firth_Unity<4){
            System.out.println("Reprovado");
        }else if(firth_Unity >=4){
            System.out.println("Prova final");
        }
    }
}
