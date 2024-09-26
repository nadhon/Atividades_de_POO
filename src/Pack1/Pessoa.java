package Pack1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa (){
        this.nome = "Nome Desconhecido";
        this.dataNascimento = LocalDate.now();
        this.altura = 1.70;
    }
    public Pessoa(String nome, String dataNascimento){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        this.nome =  nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }
    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
