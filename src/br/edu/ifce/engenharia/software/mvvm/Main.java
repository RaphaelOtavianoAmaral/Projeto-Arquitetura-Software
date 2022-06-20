package br.edu.ifce.engenharia.software.mvvm;

import br.edu.ifce.engenharia.software.mvvm.model.Model;
import br.edu.ifce.engenharia.software.mvvm.view.View;
import br.edu.ifce.engenharia.software.mvvm.viewmodel.ViewModel;

public class Main {


    public static void main(String[] args) {
        System.out.println("EXEMPLO MVVM");
        View view = View.viewFactory();
        Model model = Model.modelFactory();
        ViewModel viewModel = ViewModel.viewModelFactory();

        viewModel.bindModel(model);
        view.setViewModel(viewModel);


        do{
            view.displayPromptText();
            view.handleEvent();
        }while (viewModel.getFlag());


    }
}
