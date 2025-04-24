package teste;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MainLambda {
    public static void main(String[] args){
        System.out.println(resultado);

		int numero= 5;
        int numero2=7;
        System.out.println(numero+"!= "+fatorial(numero));
        System.out.println(numero2+"!= "+fatorial(numero2));

		System.out.println(isPrimo(13));
		System.out.println(isPrimo(14));

		System.out.println(isInteiroValido("157"));
		System.out.println(isInteiroValido("15a7"));

    double[] array1 = { 1, 10, 6.5, 189.5 };
		System.out.println(calcularMedia(array1));

    double[] array2 = { 10, 58.9, 6.5, 18 };
		System.out.println(calcularMedia(array2));

    imprimirMaiorNumero(array1);
    imprimirMaiorNumero(array2);
}
    public static boolean isPrimo(int numero) {
        if(numero <=1)return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(numero))
                .noneMatch(i ->numero%i ==0);
    }
//        int divisiveis = 0;
//
//        for (int i = 1; i <= numero; i++) {
//            if (numero % i == 0) {
//                divisiveis++;
//            }
//        }
//
//        return divisiveis == 2;
//    }
    public static boolean isInteiroValido(String texto) {
        return texto.matches("-?\\d+");
    }

    public static double calcularMedia(double[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("vetor.length == 0");
        }

        double soma = 0;

        for (double valor : vetor) {
            soma += valor;
        }

        return soma / vetor.length;
    }
    @FunctionalInterface
    public interface FunctionInter{
        int calcular(int n1, int n2);
    }
    static FunctionInter somar = (n1, n2)-> n1+n2;
    static int resultado = somar.calcular(15,10);
//public static int somar(int n1, int n2) {
//    return n1 + n2;
//}

public static long fatorial(int numero) {
    return LongStream.rangeClosed(1,numero)
            .reduce(1,(a,b)->a*b);
}
//    if (numero < 0) {
//        throw new IllegalArgumentException("numero < 0");
//    }
//
//    int resultado = 1;
//
//    for (int i = 1; i <= numero; i++) {
//        resultado *= i;
//    }
//
//    return resultado;
//}
    public static void imprimirMaiorNumero(double[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("vetor.length == 0");
        }

        OptionalDouble maiorNumero = Arrays.stream(vetor).max();

//        for (int i = 1; i < vetor.length; i++) {
//            if (vetor[i] > maiorNumero) {
//                maiorNumero = vetor[i];
//            }
//        }

        System.out.println("Maior número = " + maiorNumero);
    }
}
