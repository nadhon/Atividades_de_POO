package Pack2;

import Pack1.ImprimirDados;
import Pack1.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("nadhon",1992,1.69,"000.000.000-00");
        Pessoa pessoa2 = new Pessoa("Manoel",1980,1.90,"111.111.111-11");
        Pessoa pessoa3 = new Pessoa("Pedro",1997,1.50,"222.222.222-22");
        Pessoa [] pessoaLista = {pessoa1,pessoa2,pessoa3};
        for(Pessoa p: pessoaLista){
            System.out.println(p.getNome());
        }
    }
}
