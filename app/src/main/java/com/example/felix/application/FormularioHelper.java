package com.example.felix.application;


import android.widget.EditText;
import android.widget.RatingBar;

import com.example.felix.application.modelo.Aluno;

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoSite;
    private final EditText campoTelefone;
    private final RatingBar campoNota;

    public FormularioHelper (FormularioActivity activity){
        this.campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        this.campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        this.campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        this.campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        this.campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }

    public Aluno PegaAluno(){
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        return aluno;
    }

}
