package com.guru99.bank.pruebas.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChangePasswordPage extends PageObject {
    public By BtnChangePassword = By.xpath("/html/body/div[3]/div/ul/li[11]/a");

    public By OLdPassword = By.name("oldpassword");
    public By NewPassword = By.name("newpassword");
    public By ConfirmPassword = By.name("confirmpassword");

    public By BtnSubmit = By.name("sub");
    public By BtnReset = By.name("res");

    public By getOLdPassword() {
        return OLdPassword;
    }

    public By getNewPassword() {
        return NewPassword;
    }

    public By getConfirmPassword() {
        return ConfirmPassword;
    }

    public By getBtnSubmit() {
        return BtnSubmit;
    }

    public By getBtnChangePassword() {
        return BtnChangePassword;
    }

    public By getBtnReset() {
        return BtnReset;
    }
}
