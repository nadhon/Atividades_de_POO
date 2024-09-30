package Pack1;

import java.time.format.DateTimeFormatter;

public class ImprimirDados extends Pessoa{
    public void imprimirdados(Pessoa pessoa){
        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Data de Nascimento: "+ pessoa.getDataNascimento());
        System.out.println("Altura: "+pessoa.getAltura()+ " metros");
    }

}
