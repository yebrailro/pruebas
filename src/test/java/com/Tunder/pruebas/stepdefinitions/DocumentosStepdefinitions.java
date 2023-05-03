package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.pages.BaseWrapper;
import com.Tunder.pruebas.steps.HomeSteps;
import com.Tunder.pruebas.steps.DocumentosSteps;


import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class DocumentosStepdefinitions {

	@Steps
	DocumentosSteps documentosSteps;
	
	@Steps
    HomeSteps homeSteps;

	BaseWrapper basewrapper = new BaseWrapper();
		@Given("el usuario se encuentra en la pantalla adjuntar documentos")
		public void el_usuario_se_encuentra_en_la_pantalla_adjuntar_documentos() throws InterruptedException {
		documentosSteps.abrirAplicacionFirmaElectronica();

			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			basewrapper.ScrollDownPage();
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
			
		}

	
	
}
