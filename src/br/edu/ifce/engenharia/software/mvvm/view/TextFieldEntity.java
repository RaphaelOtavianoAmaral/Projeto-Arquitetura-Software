package br.edu.ifce.engenharia.software.mvvm.view;

import java.util.Scanner;

public class TextFieldEntity {
    private Scanner scanner;

    public TextFieldEntity() {
        this.scanner = new Scanner(System.in);
    }

    public String getText(){
        return this.scanner.nextLine();
    }

    public static TextFieldEntity textFieldEntityFactory(){
        return new TextFieldEntity();
    }

}
