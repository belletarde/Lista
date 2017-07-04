package com.example.felix.application;

class Conta {
    protected double saldo;

    public double getSaldo(){
        return saldo;
    }
    public void deposita(double valor){
        saldo += valor;
    }
    public void getSaca(double valor){
        saldo -= valor;
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

}