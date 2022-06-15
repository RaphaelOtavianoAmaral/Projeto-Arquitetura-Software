package br.edu.ifce.engenharia.software.mvvm;

public class ViewModel {
    private View view;
    private Model model;
    private boolean flag;

    public ViewModel() {
        flag = true;
    }

    public void bindView(View view){
        this.view = view;
        this.view.setViewModel(this);
    }

    public void bindModel(Model model){
        this.model = model;
        this.model.setViewModel(this);
    }

    public void processEvent(String userInput){
        if (userInput.equalsIgnoreCase("sair"))
            this.flag = false;
        else
            this.model.setNome(userInput);
    }

    public void update(){
        final String nome = this.model.getNome();
        this.view.updateView(nome);
    }

    public boolean getFlag() {
        return flag;
    }
}
