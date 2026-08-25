import java.util.Scanner;

public class ExercícioExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        System.out.print("Preço do quilo da carne: ");
        double precoKgCarne = sc.nextDouble();

        System.out.print("Preço do refrigerante: ");
        double precoRefrigerante = sc.nextDouble();

        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = sc.nextInt();

        System.out.print("Valor gasto com acompanhamentos: ");
        double valorAcompanhamentos = sc.nextDouble();

        // 400 gramas de carne por pessoa = 0.4 kg
        double carneNecessariaKg = quantidadePessoas * 0.4;
        double valorCarne = carneNecessariaKg * precoKgCarne;
        double valorRefrigerantes = quantidadeRefrigerantes * precoRefrigerante;
        double valorTotal = valorCarne + valorRefrigerantes + valorAcompanhamentos;
        double valorPorPessoa = valorTotal / quantidadePessoas;

        System.out.println();
        System.out.println("===== Resumo do Churrasco =====");
        System.out.println("Quantidade de carne necessária: " + carneNecessariaKg + " kg");
        System.out.println("Valor gasto com carne: R$ " + valorCarne);
        System.out.println("Valor gasto com refrigerantes: R$ " + valorRefrigerantes);
        System.out.println("Valor gasto com acompanhamentos: R$ " + valorAcompanhamentos);
        System.out.println("Valor total do churrasco: R$ " + valorTotal);
        System.out.println("Valor por participante: R$ " + valorPorPessoa);

        sc.close();
    }
}