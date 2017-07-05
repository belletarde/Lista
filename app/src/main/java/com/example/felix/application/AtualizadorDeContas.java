package com.example.felix.application;

/**
 * Created by felix on 04/07/2017.
 */

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }


    public double getSaldoTotal() {
        return this.saldoTotal;
    }
}
