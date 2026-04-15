package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.LoginFailedQuestion;
import com.saucedemo.tasks.LoginTask;
import com.saucedemo.tasks.PasswordFieldValidationTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class PasswordFieldValidationStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa usuario {string} pero no ingresa contrasena")
    public void ingresaUsuarioPeroNoIngresaContrasena(String username) {
        theActorCalled("Actor").attemptsTo(
                PasswordFieldValidationTask.passwordField(username)
        );
    }
    @Then("el sistema genera un mensaje indicando que la contrasena es obligatoria {string}")
    public void elSistemaGeneraUnMensajeIndicandoQueLaContrasenaEsObligatoria(String message) {
        theActorCalled("Actor").should(
                seeThat("message field password", LoginFailedQuestion.passwordField(), equalTo(message))

        );

    }


}
