import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = input.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média aritmética das notas é: " + media);

        input.close();
    }
}

