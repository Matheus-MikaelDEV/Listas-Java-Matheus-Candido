import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double salario, desconto;

        System.out.println("Qual seu salário?");
        salario = sc.nextDouble();

        if (salario <600){
            System.out.println("Isento.");
        }else if (salario > 600 && salario <= 1200){
            desconto = salario * 0.2;
            System.out.printf("Desconto: R$ %.2f\n", desconto);
        }else if (salario > 1200 && salario <= 2000){
            desconto = salario * 0.25;
            System.out.printf("Desconto: R$ %.2f\n", desconto);
        }else {
            desconto = salario * 0.3;
            System.out.printf("Desconto: R$ %.2f\n", desconto);
        }

        sc.close();
    }
}
