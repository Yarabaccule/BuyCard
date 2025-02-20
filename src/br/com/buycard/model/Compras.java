package br.com.buycard.model;

public class Compras {
    private String descricao;
    private double valor;

    // Construtor
    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: " + descricao + " | Valor: R$ " + valor;
    }
}
