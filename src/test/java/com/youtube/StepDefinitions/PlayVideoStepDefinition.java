package com.youtube.StepDefinitions;

import com.youtube.questions.GetNameVideo;
import com.youtube.questions.Product;
import com.youtube.tasks.HomeTask;
import com.youtube.tasks.ProductDetailsTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PlayVideoStepDefinition {
    private String Nombre = "";
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("that user open page Youtube and search any video")
    public void OpenUrl() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.youtube.com/")
        );
    }
    @When("user click  on  video tittle")
    public void userClickOnVideoTittle() {
        theActorInTheSpotlight().attemptsTo(
                HomeTask.Home()
                //ProductDetailsTask.on()
        );


        Nombre = theActorInTheSpotlight().asksFor(
                GetNameVideo.from()

        );

        System.out.println(Nombre);
    }
    @Then("user can watch the video with its description")
    public void userCanWatchTheVideoWithItsDescription() {
        theActorInTheSpotlight().should(
                seeThat(
                        Product.from(Nombre), Matchers.equalTo(true)
                )
        );
    }
}
