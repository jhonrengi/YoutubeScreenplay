package com.youtube.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.youtube.ui.CatalogoUI.LBL_NAME_PRODUCT;


public class GetName implements Interaction {

    private static String productName;
    @Override
    public <T extends Actor> void performAs(T actor) {
        productName = LBL_NAME_PRODUCT.resolveFor(actor).getText();
        actor.remember("ProductName ",productName);
    }

    public static GetName name(){ return  new GetName();}
    public static String getNames(Actor actor ){ return actor.recall("ProductName");}
}
