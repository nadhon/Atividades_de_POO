package Calculadora;

public class Main_Calc {
    public static void main(String[] args){
        Calculadora calc = new Calculadora("Optpex","N110","Empresarial");
        Calculadora cald= new Calculadora("Casio","C001");
        System.out.println(calc.calcula(900,1000));
        System.out.println(calc.calcula(99.0,100.1));
        System.out.println(calc.calcula("sobrecarga de  ","Construtores"));
        System.out.println("calculadora"+calc.getMarca()+"modelo"+calc.getModelo()+"uso: "+calc.getUso());
        System.out.println("calculadora 2 marca: "+cald.getMarca()+"modelo"+cald.getModelo()+"uso: "+cald.getUso());

    }
}
