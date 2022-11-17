package com.guru99.bank.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

//cucumber options permite:
@CucumberOptions(
        //llamar el feature el cual es utilizado para escriber los criterios de aceptación
        features = "src/test/resources/features/ChangePassword.feature",

        //glue describe la ubicación y la ruta del archivo de definición de pasos.
        glue = "com/guru99/bank/prueba/stepdefinitions",

        //los snippets son utilizados mas por apariencia y tambien para mantener la sintaxis de java
        snippets = SnippetType.CAMELCASE)
public class ChangePasswordRunner {

}
