package br.edu.ifce.engenharia.software.mvp;

import java.util.Scanner;

public class View {
    private Presenter presenter;
    private Scanner scanner;

    public void display(String message){
        System.out.println(message);
    }

    public void handleEvent(){
        final String input = this.scanner.nextLine();
        if(input.matches("[a-zA-Z]+")){
            this.presenter.processEvent(input);
        }else{
            this.display("Erro, entrada inválida! Digite algo...\n\n\n");
        }
    }

    public static View viewFactory(Object arg){
        if (arg==null){
            return new View();
        }else{
            try {
                return new View((Presenter) arg);
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }

    }

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public View(Presenter presenter) {
        this.presenter = presenter;
        this.scanner = new Scanner(System.in);
    }

    public Presenter getPresenter() {
        return presenter;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
