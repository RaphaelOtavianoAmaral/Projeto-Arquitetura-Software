package br.edu.ifce.engenharia.software.mvc;

public class Main {

    public static void main(String[] args) {
        System.out.println("EXEMPLO MVC");
        Controller controller = Controller.controllerFactory(1);
        if (controller!=null) {
            controller.getModel().addObserver(controller.getView());
            do {
                controller.getView().display("Digite seu nome: ");
                controller.handleEvent();
            } while (controller.getFLag());
        }
    }

}
