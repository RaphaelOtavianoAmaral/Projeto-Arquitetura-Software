package br.edu.ifce.engenharia.software.mvc;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;
    private Scanner scanner;
    private boolean flag;

    public Controller() {
        this.scanner = new Scanner(System.in);
        this.flag = true;
    }

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.scanner = new Scanner(System.in);
        this.flag = true;
    }


    public void handleEvent(){
        final String input = this.scanner.nextLine();
        if(input.matches("[a-zA-Z]+")){
            this.processEvent(input);
        }else{
            this.view.display("Erro, entrada inválida! Digite algo...\n\n\n");
        }
    }

    private void processEvent(String input) {
        if (!input.equalsIgnoreCase("sair")){
            this.model.setNome(input);
        }else {
            this.flag = false;
        }
    }

    public static Controller controllerFactory(int mode){
        switch (mode){
            case 0:
                return new Controller();
            case 1:
                return new Controller(View.viewFactory(),Model.modelFactory());
            default:
                System.out.println("Mode inválido para o Controller Factory");
                return null;
        }
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public boolean getFLag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
