package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.DocumentosPage;

import net.thucydides.core.annotations.Step;

public class DocumentosSteps {

	DocumentosPage documentospage = new DocumentosPage();
	
	@Step
	public void abrirAplicacionFirmaElectronica() throws InterruptedException {
		documentospage.openBrowser();
	}
	
}
