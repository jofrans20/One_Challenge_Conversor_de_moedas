import alura.com.br.moedas_conversor.ConversorDeMoeda;

import java.util.Scanner;

public class Menu {
    private final ConversorDeMoeda currencyConverter = new ConversorDeMoeda();

    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("\n*****************************************\n");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda");
            System.out.println("1) Dólar -> Peso argentino");
            System.out.println("2) Peso argentino -> Dólar");
            System.out.println("3) Dólar -> Real brasileiro");
            System.out.println("4) Real brasileiro -> Dólar");
            System.out.println("5) Dólar -> Peso colombiano");
            System.out.println("6) Peso colombiano -> Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção válida: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    currencyConverter.converte("USD", "ARS");
                    break;
                case 2:
                    currencyConverter.converte("ARS", "USD");
                    break;
                case 3:
                    currencyConverter.converte("USD", "BRL");
                    break;
                case 4:
                    currencyConverter.converte("BRL", "USD");
                    break;
                case 5:
                    currencyConverter.converte("USD", "COP");
                    break;
                case 6:
                    currencyConverter.converte("COP", "USD");
                    break;
                case 7:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente De Novo.");
                    break;
            }
            System.out.println("\n*****************************************\n");
        } while (escolha != 0);
    }
}

