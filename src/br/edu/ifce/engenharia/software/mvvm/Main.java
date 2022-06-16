package br.edu.ifce.engenharia.software.mvvm;

import br.edu.ifce.engenharia.software.mvvm.model.Model;
import br.edu.ifce.engenharia.software.mvvm.view.View;
import br.edu.ifce.engenharia.software.mvvm.viewmodel.ViewModel;

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
