package com.guru99.bank.pruebas.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteCostumerPage extends PageObject {
    public By btnDeleteCustomer = By.xpath("/html/body/div[3]/div/ul/li[4]/a");
    public By CustomerId = By.name("cusid");
    public By btnSumit = By.name("AccSubmit");
    public By btnReset = By.name("res");

    public By getBtnDeleteCustomer() {
        return btnDeleteCustomer;
    }

    public By getCustomerId() {
        return CustomerId;
    }

    public By getBtnSumit() {
        return btnSumit;
    }

    public By getBtnReset() {
        return btnReset;
    }
}
