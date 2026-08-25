import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Valor recebido por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println();
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário: R$ " + salario);

        sc.close();
    }
}
