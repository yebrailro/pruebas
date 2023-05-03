package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.CreacionCasoPage;

import net.thucydides.core.annotations.Step;

public class CreacionCasoSteps {
	
	//EnviarcasosPage enviarcasosPage = new EnviarcasosPage();
	CreacionCasoPage creacioncasoPage = new CreacionCasoPage();
	
	@Step
	public void clickBtnCrear() throws InterruptedException {
		creacioncasoPage.clickBtnCrear();
	}

}
