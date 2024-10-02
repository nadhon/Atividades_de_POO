public class Conta {
    String numero;

    Double saldo;

    double consultarSaldo(){
        return saldo;
    }
    void creditar(double v){
        saldo = saldo +v;
    }
    void abrir(String n, double v){
        numero= n;

    }
}
