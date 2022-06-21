package br.edu.ifce.engenharia.software.mvp;


public class Presenter {
    private View view;
    private Model model;
    private boolean flag;

    public void updateView(String nome){
        this.view.display("Olá "+nome+"\n\n\n");
    }

    public void processEvent(String userInput){
        if (userInput.equalsIgnoreCase("sair"))
            this.flag = false;
        else
            this.model.setNome(userInput);
    }

    public static Presenter presenterFactory(Object[] args){
        if (args == null){
            return new Presenter();
        }else{
            return new Presenter((View) args[0],(Model) args[1]);
        }
    }

    public Presenter() {
        this.flag = true;
    }

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        this.flag = true;
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

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
