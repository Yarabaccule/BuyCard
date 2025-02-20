package br.com.buycard.model;

public class CreditCard {
    private double dinheiroDisponivel;

    // Construtor
    public CreditCard(double dinheiroInicial) {
        this.dinheiroDisponivel = dinheiroInicial;
    }

    // Getter para obter o valor disponível
    public double getDinheiroDisponivel() {
        return dinheiroDisponivel;
    }

    // Método para reduzir o saldo disponível
    public boolean realizarCompra(Compras compra) {
        if (compra.getValor() <= dinheiroDisponivel) {
            dinheiroDisponivel -= compra.getValor();
            return true; // Compra realizada
        }
        return false; // Saldo insuficiente
    }
}
