package br.edu.ifce.engenharia.software.mvvm.view;

public class TextAreaEntity {


    public TextAreaEntity() {
    }

    public void println(String message){
        System.out.println(message);
    }

    public static TextAreaEntity textAreaEntityFactory(){
        return new TextAreaEntity();
    }
}
