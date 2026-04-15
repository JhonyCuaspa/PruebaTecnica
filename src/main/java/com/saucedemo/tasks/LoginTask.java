package com.saucedemo.tasks;

import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.LoginUserInterface.*;

public class LoginTask implements Task {

    @Getter
    private final String username;
    @Getter
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN.resolveFor(actor))
        );
    }

    public static LoginTask login(String username, String password) {return Tasks.instrumented(LoginTask.class,username, password);}
}
