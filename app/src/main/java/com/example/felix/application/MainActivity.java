package com.example.felix.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        
        Alert t = new Alert();
        t.getAlert("Java","1) "+c.getSaldo()+"\n"+"2)"+cc.getSaldo()+"\n"+"3)"+cp.getSaldo()+"\n\n"+"Saldo Total: " + adc.getSaldoTotal(),this);



    }


}

