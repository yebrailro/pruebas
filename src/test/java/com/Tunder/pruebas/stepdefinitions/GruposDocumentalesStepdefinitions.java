package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.pages.BaseWrapper;
import com.Tunder.pruebas.steps.GruposDocumentalesSteps;
import com.Tunder.pruebas.steps.HomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class GruposDocumentalesStepdefinitions {

    @Steps
    GruposDocumentalesSteps gruposDocumentalesSteps;

    @Steps
     HomeSteps homeSteps;


    @Given("el usuario se encuentra en la pantalla de grupos documentales")
    public void el_usuario_se_encuentra_en_la_pantalla_de_grupos_documentales() throws InterruptedException {
            gruposDocumentalesSteps.abrirAplicacionFirmaElectronica();


    }
    @Then("selecciona el grupo a cargar")
    public void selecciona_el_grupo_a_cargar() {

    }
    @Then("se observa la lista de documentos a cargar")
    public void se_observa_la_lista_de_documentos_a_cargar() {

    }
}
