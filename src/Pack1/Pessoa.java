package Pack1;

import static java.time.LocalDate.parse;

public class Pessoa {
    private String nome;
    private final int dataNascimento;
    private double altura;

    public Pessoa (){
        this.nome = "Nome Desconhecido";
        this.dataNascimento = 0;
        this.altura = 1.70;
    }
    public Pessoa(String nome, String dataNascimento){
        this.nome =  nome;
        this.dataNascimento = Integer.parseInt(dataNascimento);
        this.altura = altura;
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
}
