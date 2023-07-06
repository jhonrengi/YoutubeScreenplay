package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static Target TXT_SEARCH = Target.the("Textbox search flex")
            .locatedBy("//input[@id='search']");
}
