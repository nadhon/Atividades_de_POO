package Forma;

public class TesteString {
    private static void aumentarLetras() throws NullPointerException{
        String frase= null;
        String novaFrase = null;
        System.out.println("frase antiga:"+frase);
        System.out.println("frase nova: "+novaFrase);
    }
    public static void main(String[] args){
        try{
            aumentarLetras();
        }catch(NullPointerException e){
            System.out.println("ocorreu um NullponterException "+" ao executar o aumentarLetra()"+e);
        }
    }
}
