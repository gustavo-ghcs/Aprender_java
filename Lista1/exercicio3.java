import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = input.nextDouble();

        double novoSalario = salario * 1.25;

        System.out.printf("O novo salário do funcionário é R$ %.2f", novoSalario);

        input.close();
    }
}
