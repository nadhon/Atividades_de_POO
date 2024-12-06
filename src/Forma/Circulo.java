package Forma;

public class Circulo extends Figura{
    private double raio;
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    double area(){
        return 1.14 * raio*raio;
    }

    public Circulo() {
    }
    public Circulo(String cor, double raio){
        super();
        this.raio=raio;
    }
    public Circulo(String cor,double raio, String marca){
        super();
        this.raio=raio;
        this.marca=marca;
    }
    public double area(double raio){
        return 3.14 * raio*raio;
    }
}
