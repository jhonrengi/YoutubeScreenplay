package com.youtube.questions;


import com.youtube.interactions.GetCartItems;
import com.youtube.interactions.GetName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.youtube.utils.modelo.productName;


public class GetNameValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String productSelName = GetName.getNames(actor);
        String productNameCart = GetCartItems.produtName();

        return productName.equals(productNameCart);
    }

    public static GetNameValidation from(){
        return new GetNameValidation() ;
    }
}
