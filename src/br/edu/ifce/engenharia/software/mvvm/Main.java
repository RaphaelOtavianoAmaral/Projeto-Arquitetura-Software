package br.edu.ifce.engenharia.software.mvvm;

public class Main {


    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        ViewModel viewModel = new ViewModel();

        viewModel.bindModel(model);
        view.setViewModel(viewModel);


        do{
            view.displayPromptText();
            view.handleEvent();
        }while (viewModel.getFlag());


    }
}
