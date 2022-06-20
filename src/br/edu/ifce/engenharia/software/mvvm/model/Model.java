package br.edu.ifce.engenharia.software.mvvm.model;

import br.edu.ifce.engenharia.software.mvvm.viewmodel.ViewModel;

public class Model {
    private String nome;
    private ViewModel viewModel;

    public Model() {
    }

    public String getNome() {
        return nome;
    }

    private void notifyChanges(){
        this.viewModel.update();
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.notifyChanges();
    }

    public void setViewModel(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public static Model modelFactory(){
        return new Model();
    }

}
