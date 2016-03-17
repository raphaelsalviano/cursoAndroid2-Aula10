package com.example.rapha.aula10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aluno aluno1 = new Aluno("123", "Raphael");
        Aluno aluno2 = new Aluno("456", "Ittalo");

        DB db = new DB();
        db.insertAluno(aluno1, this);
        db.insertAluno(aluno2, this);

        List<Aluno> alunos = db.selectAluno(this);
        for(Aluno aluno : alunos){
            Log.i("ayty", "nome: "+aluno.getNome()+" matricula: "+aluno.getMatricula());
        }

    }
}
