package com.example.rapha.aula10;

import android.content.Context;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rapha on 17/03/2016.
 */
public class DB {

    public void insertAluno(Aluno aluno, Context context){
        Helper helper = new Helper(context);
        try {
            AlunoDAO alunoDAO = new AlunoDAO(helper.getConnectionSource());
            alunoDAO.create(aluno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateAluno(Aluno aluno, Context context){
        Helper helper = new Helper(context);
        try {
            AlunoDAO alunoDAO = new AlunoDAO(helper.getConnectionSource());
            alunoDAO.update(aluno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteAluno(Aluno aluno, Context context){
        Helper helper = new Helper(context);
        try {
            AlunoDAO alunoDAO = new AlunoDAO(helper.getConnectionSource());
            alunoDAO.delete(aluno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Aluno> selectAluno(Context context){
        Helper helper = new Helper(context);
        List<Aluno> alunos = new ArrayList<>();
        try {
            AlunoDAO alunoDAO = new AlunoDAO(helper.getConnectionSource());
            alunos = alunoDAO.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }


}
