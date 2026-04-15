package com.saucedemo.hook;

import com.saucedemo.utils.Constants;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSauceDemoPage implements Task {

    private EnvironmentVariables environmentVariables;


    public <T extends Actor> void performAs(T actor) {

        String pathWebUrl = EnvironmentSpecificConfiguration
                .from(environmentVariables)
                .getProperty(Constants.WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));

    }

    public static OpenSauceDemoPage open() {
        return instrumented(OpenSauceDemoPage.class);
    }
}
