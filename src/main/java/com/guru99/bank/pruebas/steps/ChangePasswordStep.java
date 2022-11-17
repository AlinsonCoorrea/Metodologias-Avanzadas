package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.pages.ChangePasswordPage;
import com.guru99.bank.pruebas.utils.Espera;
import com.guru99.bank.pruebas.utils.VariableGlobales;
import org.openqa.selenium.By;

public class ChangePasswordStep {
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    //Escribe el texto que le enviamos por medio del escenario
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    //Da click sobre el elemento que le decimos
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void CambioContrasena (String old,String nuevo, String confirm){
        Espera.esperaExplicita(1);
        clicEnElemento(changePasswordPage.getBtnChangePassword());
        Espera.esperaExplicita(1);
        VariableGlobales.EnterRobot();
        Espera.esperaExplicita(1);
        escribirEnTexto(changePasswordPage.getOLdPassword(), old);
        Espera.esperaExplicita(1);
        escribirEnTexto(changePasswordPage.getNewPassword(), nuevo);
        Espera.esperaExplicita(1);
        escribirEnTexto(changePasswordPage.getConfirmPassword(), confirm);
        Espera.esperaExplicita(1);
        clicEnElemento(changePasswordPage.getBtnSubmit());
    }
}
