package com.youtube.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PlayVideo.feature",
        glue = "com.youtube.StepDefinitions",
        snippets =CucumberOptions.SnippetType.CAMELCASE
)
public class PlayVideoRunner {
}
