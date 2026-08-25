import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println();
        System.out.println(nome + " possui aproximadamente " + idade + " anos.");

        sc.close();
    }
}