package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.LoginFailedQuestion;
import com.saucedemo.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class FailedLoginStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa un usuario valido {string} y una contrasena incorrecta {string}")
    public void ingresaUnUsuarioValidoYUnaContrasenaIncorrecta(String username, String password) {
        theActorCalled("Actor").attemptsTo(
                LoginTask.login(username, password)
        );
    }
    @Then("el sistema genera un mensaje de error {string}")
    public void elSistemaGeneraUnMensajeDeError(String message) {
        theActorCalled("Actor").should(
                seeThat("login failed message", LoginFailedQuestion.message(), equalTo(message))

        );
    }
}
