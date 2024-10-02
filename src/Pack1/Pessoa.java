package Pack1;

import static java.time.LocalDate.parse;

public class Pessoa {
    private String nome;
    private  int dataNascimento;
    private double altura;
    private String cpf;

    public Pessoa (){
        this.nome = "Nome Desconhecido";
        this.dataNascimento = 0;
        this.altura = 1.70;
        this.cpf= "000.000.000-00";
    }

    public Pessoa(String nome, int dataNascimento, double altura, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }
    
    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDataNascimento(int i) {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void imprimirdados(Pessoa pessoa){
        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Data de Nascimento: "+ pessoa.getDataNascimento());
        System.out.println("Altura: "+pessoa.getAltura()+ " metros");
        System.out.println("CPF"+pessoa.getCpf());
        System.out.println("_________");
    }
}
