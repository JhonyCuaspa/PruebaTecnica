package com.saucedemo.tasks;

import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.LoginUserInterface.*;

public class PasswordFieldValidationTask implements Task {

    @Getter
    private final String username;

    public PasswordFieldValidationTask(String username) {
        this.username = username;

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(username).into(INPUT_USERNAME),
                Click.on(BUTTON_LOGIN.resolveFor(actor))
        );
    }
    public static PasswordFieldValidationTask passwordField(String username) {return Tasks.instrumented(PasswordFieldValidationTask.class,username);}
}
