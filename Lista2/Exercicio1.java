package Lista2;
import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = input.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = input.nextInt();

    if (num1 > num2) {
      System.out.println("O maior número é: " + num1);
    } else if (num2 > num1) {
      System.out.println("O maior número é: " + num2);
    } else {
      System.out.println("Os números são iguais.");
    }

    input.close();
  }
}
