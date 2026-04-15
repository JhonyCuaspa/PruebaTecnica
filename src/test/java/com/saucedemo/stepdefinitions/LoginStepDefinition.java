package com.saucedemo.stepdefinitions;

import com.saucedemo.hook.OpenSauceDemoPage;
import com.saucedemo.questions.SuccessfulLoginQuestion;
import com.saucedemo.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario se encuentra en la pagina de inicio de sesion")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {

        theActorCalled("Actor").wasAbleTo(OpenSauceDemoPage.open());
    }

    @When("ingresa el usuario {string} y la contrasena {string}")
    public void ingresaElUsuarioYLaContrasena(String username, String password) {

        theActorCalled("Actor").attemptsTo(
                LoginTask.login(username, password)
        );
    }

    @Then("el usuario ingresa a la pagina principal {string} {string}")
    public void elUsuarioIngresaALaPaginaPrincipal(String title, String subtitle) {
        theActorCalled("Actor").should(
                seeThat("main page title",SuccessfulLoginQuestion.title(), equalTo(title)),
                seeThat("main page subtitle",SuccessfulLoginQuestion.subTitle(), equalTo(subtitle))
        );
    }


}
