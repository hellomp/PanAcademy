package Array;

/* 2. Dado o seguinte array:  int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
  A. Retorne somente com números pares
  B. Retorne somente com os números ímpares * 2.*/

public class Exercicio2 {
    public static void main(String[] args) {
        int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};

        System.out.println("PARES");
        for (int numero: array2) {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        }
        System.out.println("IMPARES * 2");
        for (int numero: array2) {
            if(numero % 2 != 0){
                System.out.println(numero * 2);
            }
        }
    }
}
