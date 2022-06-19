package br.edu.ifce.engenharia.software.mvc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

    public View() {
    }

    public void display(String message){
        System.out.println(message);
    }

    @Override
    public void update(Observable o, Object arg) {
        try {
            final Method getNome = o.getClass().getMethod("getNome", null);
            final String result = (String) getNome.invoke(o);

            this.display("Olá "+result+"\n\n\n");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static View viewFactory(){
        return new View();
    }
}
