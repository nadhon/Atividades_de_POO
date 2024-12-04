package Forma;

public class Quadrado extends Figura{
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    @Override
    double area(){
      return lado *lado;
    }

    public Quadrado() {
    }
    public Quadrado(String cor, int lado){
        super();
        this.lado=lado;
    }
    public Quadrado(String cor, int lado,boolean d){
        super();
        this.lado=lado;

    }
}
