package com.librerianacional.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;


import static com.librerianacional.ui.HomeUI1.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRamdom implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LBL_NAME_PRODUCT.resolveAllFor(actor);


        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());

        String productName = listProducts.get(indexRandom).getText();

        listProducts.get(indexRandom).click();

    }

    public static Performable click(){
        return  instrumented(ClickRamdom.class);
    }
}
