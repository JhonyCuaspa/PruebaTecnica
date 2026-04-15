package com.saucedemo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterface {

    public static final Target INPUT_USERNAME = Target.the("username field")
            .locatedBy("//input[@id='user-name']");

    public static final Target INPUT_PASSWORD = Target.the("password field")
            .locatedBy("//input[@id='password']");

    public static final Target BUTTON_LOGIN = Target.the("login button")
            .locatedBy("//input[@id='login-button']");

    public static final Target TEXT_TITLE = Target.the("page title")
            .locatedBy("//div[@class='app_logo']");

    public static final Target TEXT_PRODUCTS = Target.the("text products")
            .locatedBy("//div/span[@class='title']");

    public static final Target LOGIN_FAILED_MESSAGE = Target.the("login failed message")
            .locatedBy("//div/h3");

    public static final Target MESSAGE_FIELD_USERNAME = Target.the("message field username")
            .locatedBy("//h3[text()='Epic sadface: Username is required']");

    public static final Target MESSAGE_FIELD_PASSWORD = Target.the("message field password")
            .locatedBy("//h3[text()='Epic sadface: Password is required']");
    private LoginUserInterface() {
        throw new UnsupportedOperationException("Utility class");
    }

}
