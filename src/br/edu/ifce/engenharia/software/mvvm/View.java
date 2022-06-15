package br.edu.ifce.engenharia.software.mvvm;

import java.util.Scanner;

public class View {
    private Scanner scanner;
    private ViewModel viewModel;

    public View() {
        this.scanner = new Scanner(System.in);
    }


    public void updateView(String nome) {
        this.display(nome);
    }

    public void displayPromptText(){
        System.out.println("Digite seu nome: ");
    }

    public void handleEvent(){
        String input = scanner.nextLine();
        if(input.matches("[a-zA-Z]+")){
            this.viewModel.processEvent(input);
        }else{
            System.out.println("Erro, entrada inválida! Digite algo...\n\n\n");
        }
    }

    private void display(String nome){
        System.out.println("Olá "+nome+"\n\n");
    }

    public void setViewModel(ViewModel viewModel) {
        this.viewModel = viewModel;
    }


}
