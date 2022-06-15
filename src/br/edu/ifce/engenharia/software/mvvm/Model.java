package br.edu.ifce.engenharia.software.mvvm;

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
}
