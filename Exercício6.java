import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do proprietário: ");
        String nome = sc.nextLine();

        System.out.print("Comprimento do terreno (m): ");
        double comprimento = sc.nextDouble();

        System.out.print("Largura do terreno (m): ");
        double largura = sc.nextDouble();

        double area = comprimento * largura;

        System.out.println();
        System.out.println("Proprietário: " + nome);
        System.out.println("Área total do terreno: " + area + " m²");

        sc.close();
    }
}