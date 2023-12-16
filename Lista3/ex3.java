package Lista3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        while (true) {
            System.out.print("Insira um número: ");
            int number = input.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                count++;
            }

        }

        input.close();
        
        System.out.println("Quantidade de positivos: " + count);
    }
}

 