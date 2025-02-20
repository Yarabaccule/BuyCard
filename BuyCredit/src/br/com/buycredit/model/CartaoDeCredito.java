package br.com.buycredit.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDisponivel;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
        this.saldo = limiteDisponivel;
        this.compras = new ArrayList<>();
    }

    public boolean lancarCompra(Compras compras){
        if(this.saldo > compras.getValor()){
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        }
        return false;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void setCompras(List<Compras> compras) {
        this.compras = compras;
    }
}
