import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do motorista: ");
        String nome = sc.nextLine();

        System.out.print("Distância da viagem (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Consumo médio do veículo (km/l): ");
        double consumoMedio = sc.nextDouble();

        System.out.print("Preço do litro do combustível: ");
        double precoLitro = sc.nextDouble();

        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        double litros = distancia / consumoMedio;
        double custo = litros * precoLitro;
        double custoPessoa = custo / quantidadePessoas;

        System.out.println();
        System.out.println("Motorista: " + nome);
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Litros necessários: " + litros + " litros");
        System.out.println("Custo estimado: R$ " + custo);
        System.out.println("Custo por pessoa: R$ " + custoPessoa);

        sc.close();
    }
}