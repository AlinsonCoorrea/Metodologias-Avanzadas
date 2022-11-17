package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.pages.DeleteCostumerPage;
import com.guru99.bank.pruebas.utils.Espera;
import com.guru99.bank.pruebas.utils.VariableGlobales;
import org.openqa.selenium.By;

public class DeleteCostumerStep {
    DeleteCostumerPage deleteCostumerPage = new DeleteCostumerPage();
    //Escribe el texto que le enviamos por medio del escenario
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    //Da click sobre el elemento que le decimos
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void borrarCustomer(String customerId) {
        clicEnElemento(deleteCostumerPage.getBtnDeleteCustomer());
        Espera.esperaExplicita(1);
        VariableGlobales.EnterRobot();
        Espera.esperaExplicita(1);
        escribirEnTexto(deleteCostumerPage.getCustomerId(), customerId);
        Espera.esperaExplicita(1);
        clicEnElemento(deleteCostumerPage.getBtnSumit());
        Espera.esperaExplicita(1);

    }
}
