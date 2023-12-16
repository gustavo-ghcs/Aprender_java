package Lista3;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = input.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = input.nextInt();

        for (int i = A + 1; i < B; i++) {
            System.out.println(i);
        }
        input.close();
    }
}

