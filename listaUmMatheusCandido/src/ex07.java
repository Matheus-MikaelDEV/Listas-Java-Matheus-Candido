import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a nota da primeira prova:(1 a 10) ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota da segunda prova:(1 a 10) ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("Você, %s com a primeira nota sendo %.2f e a segunda nota sendo %.2f, a média que obteve foi %.2f, e com isso você foi aprovado.", nome, nota1, nota2, media);
        }else if (media < 3) {
            System.out.printf("Você, %s com a primeira nota sendo %.2f e a segunda nota sendo %.2f, a média que obteve foi %.2f, e com isso você foi reprovado.", nome, nota1, nota2, media);
        }else {
            System.out.printf("Você, %s com a primeira nota sendo %.2f e a segunda nota sendo %.2f, a média que obteve foi %.2f, e com isso você foi pra prova final.", nome, nota1, nota2, media);
        }

        sc.close();
    }
}
