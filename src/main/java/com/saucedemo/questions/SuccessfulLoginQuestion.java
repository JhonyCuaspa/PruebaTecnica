package com.saucedemo.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.userinterfaces.LoginUserInterface.TEXT_PRODUCTS;
import static com.saucedemo.userinterfaces.LoginUserInterface.TEXT_TITLE;

public class SuccessfulLoginQuestion {

    public static Question<String> title() {
        return actor ->
                Text.of(TEXT_TITLE).answeredBy(actor);
    }
    public static Question<String> subTitle() {
        return actor ->
                Text.of(TEXT_PRODUCTS).answeredBy(actor);
    }


}
