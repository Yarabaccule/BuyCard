package br.com.buycredit.model;

public class Compras implements Comparable<Compras> {
    private String descricao;
    private double valor;

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

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.getValor()));
    }
}
