package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogoUI {
    //DIV[@id='meta']

    public static final Target LBL_NAME_PRODUCT = Target.the("products collection")
            .locatedBy("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer' and not(@is-empty)]");
}
