package com.example.rapha.aula10;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rapha on 17/03/2016.
 */
@DatabaseTable
public class Professor {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String disciplina;
    @DatabaseField
    private String nome;


    @ForeignCollectionField
    Collection<Aluno> alunos = new ArrayList<>();

    public Professor(String disciplina, String nome) {
        this.disciplina = disciplina;
        this.nome = nome;
    }
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
