import java.util.Scanner;
public class Tutorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float numero1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float numero2 = input.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float numero3 = input.nextFloat();

        float media = (numero1 + numero2 + numero3)/3;

        System.out.printf("A soma dos números é: %.2f", media);

        input.close();
    }
     
}
