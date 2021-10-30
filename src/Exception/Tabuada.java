package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    System.out.println("Qual a tabuada você gostaria de conferir:");

    while(true){
      try {
        option = scanner.nextInt();

        for(int i = 1; i < 11; i++){
          int result = option * i;
          System.out.printf("%s x %s = %s\n", option, i, result);
        }

        scanner.close();
        break;
      } catch (InputMismatchException e) {
        System.err.println("Digite um número");
        scanner.next();
        continue;
      }
    }
  }
}