package teste;

public class Conta {
  String numero;
  double saldo;

  public Conta(String num, double valor){
      numero=num;
      saldo=valor;
  }
  public void Creditar(double valor){
      saldo=valor;
  }
  public double saldoConta(){
      return saldo;
  }
}
