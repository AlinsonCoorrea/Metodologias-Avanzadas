package com.guru99.bank.prueba.stepdefinitions;

import com.guru99.bank.pruebas.models.DeleteCostumer;
import com.guru99.bank.pruebas.steps.DeleteCostumerStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

public class DeleteCustomerStepDefinition {
 DeleteCostumerStep deleteCostumerStep = new DeleteCostumerStep();
    @Cuando("^tengo el id para eliminar$")
    public void tengoElIdParaEliminar(List<DeleteCostumer> data) {
   deleteCostumerStep.borrarCustomer(data.get(0).getIdCustomer());
    }


    @Entonces("^deberia eliminar el usuario$")
    public void deberiaEliminarElUsuario() {
        // Write code here that turns the phrase above into concrete actions
    }
}
