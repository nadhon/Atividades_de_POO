package Forma;

public class Circulo extends Figura{
    private double raio;

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
}
