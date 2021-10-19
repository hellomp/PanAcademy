package Array;

/*1. Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        A. Retorno o valor total da soma de todos os elementos com foreach
        B. Retorne a média de todos os elementos
        C. Retorne o maior valor e o menor elemento*/

public class Exercicio1 {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        int maior = 0;
        int menor = array[0];
        double media;

        for (int numero: array) {
            total += numero;
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        media = (double)total / array.length;
        System.out.println("Total: " + total);
        System.out.println("Média: " + media);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
