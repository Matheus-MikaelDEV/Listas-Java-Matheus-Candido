import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, prestacao, porcentagem;

        System.out.println("Qual o valor do salário?");
        salario = sc.nextDouble();
        System.out.println("Qual o valor do prestação?");
        prestacao = sc.nextDouble();

        porcentagem = salario * 0.3;

        if (prestacao <= porcentagem) {
            System.out.println("Pode ser concedido.");
        }else {
            System.out.println("Não pode ser concedido.");
        }

        sc.close();
    }
}
