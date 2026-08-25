import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor consumido: ");
        double consumo = sc.nextDouble();

        System.out.print("Valor da taxa de serviço: ");
        double taxa = sc.nextDouble();

        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        double total = consumo + taxa;
        double valorPorPessoa = total / quantidadePessoas;

        System.out.println();
        System.out.println("Valor do consumo: R$ " + consumo);
        System.out.println("Taxa de serviço: R$ " + taxa);
        System.out.println("Valor total: R$ " + total);
        System.out.println("Valor por pessoa: R$ " + valorPorPessoa);

        sc.close();
    }
}