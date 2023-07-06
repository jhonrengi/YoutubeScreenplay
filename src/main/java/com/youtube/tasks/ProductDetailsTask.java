package com.youtube.tasks;

import com.youtube.interactions.ClickRamdom;
import com.youtube.questions.GetNameVideo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductDetailsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                (Performable) GetNameVideo.from()
        );
    }

    public static Performable on(){
        return instrumented(ProductDetailsTask.class);
    }
}
