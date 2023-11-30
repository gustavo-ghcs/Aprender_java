import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();

        System.out.print("Digite o quarto número: ");
        num4 = input.nextInt();

        soma = num1 + num2 + num3 + num4;

        System.out.println("A soma dos números é: " + soma);

        input.close();
    }
}