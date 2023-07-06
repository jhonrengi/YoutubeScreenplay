package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductUI {


    public static Target TXT_INFORMATION = Target.the("Textbox search flex")
            .locatedBy("//h1[@class='style-scope ytd-watch-metadata']");
}
