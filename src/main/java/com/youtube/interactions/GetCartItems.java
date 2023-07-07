package com.youtube.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;


import static com.youtube.ui.ProductUI.TXT_INFORMATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetCartItems implements Interaction {


    private static String productNameCart;
    @Override
    public <T extends Actor> void performAs(T actor) {

        productNameCart = TXT_INFORMATION.resolveFor(actor).getText();
    }

    public static Performable items(){
        return instrumented(GetCartItems.class);
    }

    public static String produtName(){
        return productNameCart;
    }


}
