package br.edu.ifce.engenharia.software.mvvm.view;

import br.edu.ifce.engenharia.software.mvvm.viewmodel.ViewModel;

public class View {
    private TextAreaEntity textAreaEntity;
    private TextFieldEntity textFieldEntity;
    private ViewModel viewModel;

    public View() {
        this.textFieldEntity = TextFieldEntity.textFieldEntityFactory();
        this.textAreaEntity = TextAreaEntity.textAreaEntityFactory();
    }

    private void bindEntities(){
        this.viewModel.bindEntity(textAreaEntity);
        this.viewModel.bindEntity(textFieldEntity);
    }

    public void displayPromptText(){
        this.textAreaEntity.println("Digite seu nome: ");
    }

    public void handleEvent(){
        String input = this.textFieldEntity.getText();
        if(input.matches("[a-zA-Z]+")){
            this.viewModel.processEvent(input);
        }else{
            this.textAreaEntity.println("Erro, entrada inválida! Digite algo...\n\n\n");
        }
    }

    public void setViewModel(ViewModel viewModel) {
        this.viewModel = viewModel;
        this.bindEntities();
    }

}
