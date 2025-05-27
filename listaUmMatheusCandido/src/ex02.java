import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        if (soma <= 20) {
            soma = soma - 5;
            System.out.println(soma);
        }else if (soma >= 20) {
            soma = soma + 8;
            System.out.println(soma);
        }

        sc.close();
    }
}