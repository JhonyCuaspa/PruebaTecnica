package com.saucedemo.tasks;

import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.LoginUserInterface.*;

public class UsernameFieldValidationTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                Click.on(BUTTON_LOGIN.resolveFor(actor))
        );
    }
    public static UsernameFieldValidationTask fieldValidation() {return Tasks.instrumented(UsernameFieldValidationTask.class);}
}
