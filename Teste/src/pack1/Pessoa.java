package pack1;

public class Pessoa {
    private String nome;
    private int ano;
    private String Data_de_Nascimento;

    public Pessoa(String nome, int ano, String data_de_Nascimento, double altura) {
        this.nome = nome;
        this.ano = ano;
        Data_de_Nascimento = data_de_Nascimento;
        Altura = altura;
    }

    private double Altura;

    public Pessoa() {
        
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getData_de_Nascimento() {
        return Data_de_Nascimento;
    }

    public double getAltura() {
        return Altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setData_de_Nascimento(String data_de_Nascimento) {
        Data_de_Nascimento = data_de_Nascimento;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }
}
