package Forma;

import java.awt.geom.Area;
import java.util.Scanner;

public class MainCriar_objeto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Quadrado----");
        System.out.println("lados: ");
        double num1= scanner.nextDouble();
        Quadrado q =new Quadrado();
        q.setLado(num1);
        System.out.println(q.area()+" area do quadrado");
        System.out.println("    ");
        System.out.println("Area do circulo: ");
        double circulo=scanner.nextDouble();
        Circulo c=new Circulo();
        c.setRaio(circulo);
        System.out.println("O resultado da area é "+c.area());

    }
}
