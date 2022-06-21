package br.edu.ifce.engenharia.software.mvp;

public class Model {
    private String nome;
    private Presenter presenter;

    public void notifyChange(){
        this.presenter.updateView(this.nome);
    }

    public static Model modelFactory(Object arg){
        if (arg==null) {
            return new Model();
        }else{
            try{
                return new Model((Presenter) arg);
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }
    }

    public Model() {
    }

    public Model(Presenter presenter) {
        this.presenter = presenter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.notifyChange();
    }

    public Presenter getPresenter() {
        return presenter;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
