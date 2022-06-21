package br.edu.ifce.engenharia.software.mvp;



public class Main {

    public static void main(String[] args) {
        Model model = Model.modelFactory(null);
        View view = View.viewFactory(null);
        Presenter presenter = Presenter.presenterFactory(new Object[] {view,model});

        view.setPresenter(presenter);
        model.setPresenter(presenter);

        do{
            view.display("Digite seu nome: ");
            view.handleEvent();
        }while (presenter.getFlag());

    }
}
