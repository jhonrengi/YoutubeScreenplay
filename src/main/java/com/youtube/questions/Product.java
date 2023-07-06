package com.youtube.questions;

import com.youtube.ui.ProductUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Product implements Question  {
     private final String titulo;

    public Product(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Object answeredBy(Actor actor) {
       return  titulo.equals(ProductUI.TXT_INFORMATION.resolveFor(actor).getText());

    }

    public static Question from(String titulo){
        return new Product(titulo) ;
    }
}
