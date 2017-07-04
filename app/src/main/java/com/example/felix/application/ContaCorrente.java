package com.example.felix.application;

/**
 * Created by felix on 03/07/2017.
 */

public class ContaCorrente extends Conta {

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
}
