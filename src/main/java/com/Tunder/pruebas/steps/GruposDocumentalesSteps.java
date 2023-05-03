package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.GruposDocumentalesPage;
import net.thucydides.core.annotations.Step;

public class GruposDocumentalesSteps {

    GruposDocumentalesPage gruposDocumentalesPage = new GruposDocumentalesPage();

    @Step
    public void abrirAplicacionFirmaElectronica() throws InterruptedException {
        gruposDocumentalesPage.openBrowser();
    }



}
