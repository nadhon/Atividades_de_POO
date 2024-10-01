package Pack2;

import Pack1.ImprimirDados;

public class Main {
    public static void main(String[] args){
        ImprimirDados pessoa1 = new ImprimirDados();
        pessoa1.setNome("Ricson Santana");
        pessoa1.setDataNascimento(1982);
        pessoa1.setAltura(1.77);
        System.out.println("Essa pessoa tem"+pessoa1);
    }
}
