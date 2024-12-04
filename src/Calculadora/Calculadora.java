package Calculadora;

public class Calculadora {
    private String modelo;
    private String marca;
    private String uso;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public  Calculadora(){
    }
    public  Calculadora(String marca, String modelo){
        this.marca =marca;
         this.modelo= modelo;
    }
    public  Calculadora(String marca, String modelo, String uso){
        this.marca=marca;
        this.modelo=modelo;
        this.uso=uso;
    }
    public int calcula(int a, int b){
        return a+b;
    }
    public double calcula(double a, double b){
        return a+b;
    }
    public String calcula(String a, String b){
        return a+b;
    }
}
