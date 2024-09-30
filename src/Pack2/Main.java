package Pack2;

import Pack1.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ricson Santana");
        pessoa.setDataNascimento(1982);
        pessoa.setAltura(1.77);
        System.out.println("Essa pessoa tem"+pessoa);
    }
}
