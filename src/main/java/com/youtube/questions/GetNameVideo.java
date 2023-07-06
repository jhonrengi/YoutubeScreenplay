package com.youtube.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Random;

import static com.youtube.ui.CatalogoUI.LBL_NAME_PRODUCT;

public class GetNameVideo implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        List<WebElementFacade> listProducts = LBL_NAME_PRODUCT.resolveAllFor(actor);


        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());

        String productName = listProducts.get(indexRandom).getText();

        listProducts.get(indexRandom).click();
        return productName;
    }

    public static GetNameVideo from(){
        return new GetNameVideo() ;
    }
}
