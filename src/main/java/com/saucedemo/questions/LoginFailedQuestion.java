package com.saucedemo.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.userinterfaces.LoginUserInterface.*;

public class LoginFailedQuestion {
    public static Question<String> message() {
        return actor ->
                Text.of(LOGIN_FAILED_MESSAGE).answeredBy(actor);
    }

    public static Question<String> usernameField() {
        return actor ->
                Text.of(MESSAGE_FIELD_USERNAME).answeredBy(actor);
    }

    public static Question<String> passwordField() {
        return actor ->
                Text.of(MESSAGE_FIELD_PASSWORD).answeredBy(actor);
    }

}
