package Lista2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int num1 = input.nextInt();

        System.out.print("Insira o segundo valor: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            int resultado = num1 * num2;
            System.out.println("Multiplicação: " + resultado);
        } else if (num1 > num2) {
            int resultado = num1 - num2;
            System.out.println("Subtração: " + resultado);
        } else {
            int resultado = num1 + num2;
            System.out.println("Soma: " + resultado);
        }

        input.close();
    }
}
