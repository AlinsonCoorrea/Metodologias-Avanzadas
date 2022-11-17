package com.guru99.bank.prueba.stepdefinitions;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.ChangePassword;
import com.guru99.bank.pruebas.steps.ChangePasswordStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

public class ChangePasswordStepDefinition {
    ChangePasswordStep changePasswordStep = new ChangePasswordStep();

    @Cuando("^cuando ingreso la contraseña anterior y agrego la nueva$")
    public void cuandoIngresoLaContraseñaAnteriorYAgregoLaNueva(List<ChangePassword>datos) {
    changePasswordStep.CambioContrasena(datos.get(0).getOldpassword(),datos.get(0).getConfirmpassword(),datos.get(0).getNewpassword());
    }

    @Entonces("^deberia ver el cambio de contraseña$")
    public void deberiaVerElCambioDeContraseña() {
        SeleniumWebDriver.driver.quit();
    }


    }




