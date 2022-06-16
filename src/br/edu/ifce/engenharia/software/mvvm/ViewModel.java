package br.edu.ifce.engenharia.software.mvvm;

import java.util.ArrayList;
import java.util.List;

public class ViewModel {
    private List<TextAreaEntity> textAreaEntitiesList;
    private List<TextFieldEntity> textFieldEntitiesList;
    private Model model;
    private boolean flag;

    public ViewModel() {
        this.textAreaEntitiesList = new ArrayList();
        this.textFieldEntitiesList = new ArrayList<>();
        this.flag = true;
    }

    public void bindEntity(Object object){
        if (object.getClass().getSimpleName().equals("TextAreaEntity"))
            this.textAreaEntitiesList.add((TextAreaEntity) object);
        if (object.getClass().getSimpleName().equals("TextFieldEntity"))
            this.textFieldEntitiesList.add((TextFieldEntity) object);
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
        this.textAreaEntitiesList.get(0).println("Olá "+nome+"\n\n");
    }

    public boolean getFlag() {
        return flag;
    }
}
