package Lista2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcao = input.nextInt();

        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Divisão por zero.");
                } else {
                    System.out.println("Divisão: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        input.close();
    }
}
