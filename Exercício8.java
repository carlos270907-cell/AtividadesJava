import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        double[] precos = new double[3];
        int[] quantidades = new int[3];
        double[] subtotais = new double[3];
        double total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("--- Produto " + (i + 1) + " ---");

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Preço: ");
            precos[i] = sc.nextDouble();

            System.out.print("Quantidade: ");
            quantidades[i] = sc.nextInt();
            sc.nextLine();

            subtotais[i] = precos[i] * quantidades[i];
            total += subtotais[i];
            System.out.println();
        }

        System.out.println("===== Resumo da Compra =====");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + " - Subtotal: R$ " + subtotais[i]);
        }
        System.out.println("Valor total da compra: R$ " + total);

        sc.close();
    }
}