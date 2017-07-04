package com.example.felix.application;


import android.app.Activity;
import android.support.v7.app.AlertDialog;

public class Alert {

    int saldo = 100;

    public void getAlert(String titulo, String mensagem, Activity act){
        AlertDialog alertDialog = new AlertDialog.Builder(act).create();
        alertDialog.setTitle(titulo);
        alertDialog.setMessage(mensagem);
        alertDialog.show();
    }


}
