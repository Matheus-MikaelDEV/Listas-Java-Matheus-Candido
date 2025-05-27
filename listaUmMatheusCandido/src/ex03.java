import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("É multiplo de 3.");
        }else {
            System.out.println("Não é multiplo de 3.");
        }

        sc.close();
    }
}