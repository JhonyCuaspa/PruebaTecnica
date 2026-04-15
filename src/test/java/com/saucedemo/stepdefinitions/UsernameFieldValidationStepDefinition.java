package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.LoginFailedQuestion;
import com.saucedemo.tasks.LoginTask;
import com.saucedemo.tasks.UsernameFieldValidationTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class UsernameFieldValidationStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("intenta iniciar sesion sin ingresar usuario ni contrasena")
    public void intentaIniciarSesionSinIngresarUsuarioNiContrasena() {
        theActorCalled("Actor").attemptsTo(
                UsernameFieldValidationTask.fieldValidation()
        );
    }
    @Then("el sistema genera un mensaje indicando que el usuario es obligatorio {string}")
    public void elSistemaGeneraUnMensajeIndicandoQueElUsuarioEsObligatorio(String message) {
        theActorCalled("Actor").should(
                seeThat("message field username", LoginFailedQuestion.usernameField(), equalTo(message))

        );
    }

}
