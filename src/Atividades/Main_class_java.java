package Atividades;

import java.util.Scanner;

public class Main_class_java {
    public static void main(String[] args){
       // Scanner scanner= new Scanner(System.in);
        //System.out.println("Digite uma frase");
        //System.out.println("Frase:  ");
        //String text = scanner.next();
        String nome = null;
        try{
            nome= nome.toUpperCase();
        }catch (NullPointerException n){
            System.out.println("frase menor"+nome.toLowerCase());
        }
    }
}
