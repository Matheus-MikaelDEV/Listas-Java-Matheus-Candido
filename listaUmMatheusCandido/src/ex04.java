import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("É divisivel por 5.");
        }else {
            System.out.println("Não é divisivel por 5.");
        }

        sc.close();
    }
}
