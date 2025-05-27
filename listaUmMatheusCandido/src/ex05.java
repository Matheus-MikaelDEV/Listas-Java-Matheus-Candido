import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("É divisivel por 3 e 7.");
        }else {
            System.out.println("Não é divisivel por 3 e 7.");
        }

        sc.close();
    }
}