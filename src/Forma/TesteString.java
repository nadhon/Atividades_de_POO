package Forma;

public class TesteString {
    private static void aumentarLetras() throws NullPointerException{
        //Scanner scanner= new Scanner(System.in);
        //System.out.println("Digite uma frase");
        //System.out.println("Frase:  ");
        //String text = scanner.next();
        String frase= "minha vida é levada ou limite e colocada no problema ";
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("frase antiga:"+frase);
        System.out.println("frase nova: "+ novaFrase);
    }
    public static void main(String[] args){
        try{
            aumentarLetras();
        }catch(NullPointerException e){
            System.out.println("ocorreu um NullponterException "+" ao executar o aumentarLetra()"+e);
        }
    }
}
