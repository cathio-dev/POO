package Entidades;

import java.util.*;

public class Disciplina {
    private String codigo;
    private String nomeDisciplina;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String codigo, String nomeDisciplina) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno); //adiciona o aluno na lista
    }

    public List<Aluno> mostraAprovados() { //retorno será uma lista
        List <Aluno> aprovados = new ArrayList<>(); //lista que so entrarão os aprovados
    
        for(Aluno atual : alunos){  //atual, recebe valor do aluno atual da lista percorrida
            if(atual.getMedia() >= 7.0){
                aprovados.add(atual);
            }
        }

        return aprovados;
    }   

    public void achaMelhor() {
        Aluno melhor

    }

}
