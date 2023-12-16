package Lista3;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int number = input.nextInt();
        input.close();

        boolean primo = true;

        if (number <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(number + " é primo");
        } else {
            System.out.println(number + " não é primo");
        }
    }
}
