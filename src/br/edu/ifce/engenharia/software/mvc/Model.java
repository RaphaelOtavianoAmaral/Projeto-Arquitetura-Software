package br.edu.ifce.engenharia.software.mvc;

import java.util.Observable;

public class Model extends Observable {

    private String nome;

    public Model() {
        super();
    }

    public static Model modelFactory(){
        return new Model();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.setChanged();
        this.notifyObservers();
    }
}
