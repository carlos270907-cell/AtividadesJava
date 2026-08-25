import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do motorista: ");
        String nome = sc.nextLine();

        System.out.print("Distância percorrida (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Quantidade de litros utilizados: ");
        double litros = sc.nextDouble();

        double consumo = distancia / litros;

        System.out.println();
        System.out.println("Motorista: " + nome);
        System.out.println("Consumo médio: " + consumo + " km/l");

        sc.close();
    }
}