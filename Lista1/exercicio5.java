import java.util.Scanner;
import java.lang.Math;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        if (num1 > 0 && num2 > 0) {
            double resultado = Math.pow(num1, num2);
            System.out.println(num1 + " elevado a " + num2 + " é igual a " + resultado);
        } else {
            System.out.println("Os números devem ser maiores que 0.");
        }

        input.close();
    }
}

