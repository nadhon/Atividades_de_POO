package Pack2;

import Pack1.ImprimirDados;
import Pack1.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ricson Santana");
        pessoa1.setDataNascimento(1982);
        pessoa1.setAltura(1.77);
        System.out.println("Essa pessoa tem"+ ImprimirDados);
    }
}
