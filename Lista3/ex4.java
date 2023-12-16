package Lista3;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = input.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = input.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.println("É impar: " + i);
            }
        }

        input.close();
    }
}

