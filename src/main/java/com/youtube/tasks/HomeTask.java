package com.youtube.tasks;

import com.youtube.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.TXT_SEARCH),
                Enter.theValue("despacito").into(HomeUI.TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }
    public static Performable Home(){
        return instrumented(HomeTask.class);
    }
}
