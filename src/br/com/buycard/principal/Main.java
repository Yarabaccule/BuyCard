package br.com.buycard.principal;

import br.com.buycard.model.Compras;
import br.com.buycard.model.CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor inicial do cartão
        System.out.print("Digite o valor inicial do seu cartão: ");
        double dinheiroInicial = scanner.nextDouble();
        scanner.nextLine(); // Limpa a quebra de linha

        // Inicializa o cartão com o valor inicial
        CreditCard cartao = new CreditCard(dinheiroInicial);

        int opcao;

        do {
            // Mostra o saldo disponível no cartão
            System.out.println("\nDinheiro disponível no cartão: R$ " + cartao.getDinheiroDisponivel());

            // Solicita a descrição da compra
            System.out.print("Digite a descrição da compra: ");
            String descricao = scanner.nextLine();

            // Solicita o valor da compra
            System.out.print("Digite o valor da compra: ");
            double valorCompra = scanner.nextDouble();
            scanner.nextLine(); // Consome a quebra de linha

            // Cria uma nova compra
            Compras compra = new Compras(descricao, valorCompra);

            // Tenta realizar a compra
            if (cartao.realizarCompra(compra)) {
                System.out.println("Compra realizada com sucesso!\n");
            } else {
                System.out.println("Saldo insuficiente! Compra não realizada.\n");
            }

            // Pergunta se deseja continuar ou sair
            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha
        } while (opcao != 0);

        System.out.println("Programa finalizado.");
    }
}