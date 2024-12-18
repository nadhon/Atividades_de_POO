package execepition;

public class TesteExcepition {
    public static void main(String[] args){

        System.out.println("Inico do main");
        metodo1();
        System.out.println("fim do main");
    }
    static void metodo1(){
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }
    static void metodo2(){
        System.out.println("inicio do metodo2");
        int[] array = new int[15];
        try{
             for(int i=0; i <= 15;i++) {
                 array[1] = 1;
                 System.out.println(i);
             }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("fim do metodo2");
    }
}
