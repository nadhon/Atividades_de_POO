package execepition;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        System.out.println("Informe o primeiro valor: ");
        int x=teclado.nextInt();
        System.out.print("informe o segundo valor: ");
        int y = teclado.nextInt();
        try{
            double r = (x / y);
        System.out.println("O resultado da soma é "+r);
        }catch(ArithmeticException e){
            System.out.println("Resultado errado");
        }
    }
}
