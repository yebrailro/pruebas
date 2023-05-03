package com.Tunder.pruebas.steps;


import com.Tunder.pruebas.pages.EnviarcasosPage;

import net.thucydides.core.annotations.Step;

public class EnviarcasoSteps {

	
	EnviarcasosPage enviarcasosPage = new EnviarcasosPage();
	
	
	
	@Step
	public void clickBtnCheck() throws InterruptedException {
		enviarcasosPage.clickBtnCheck();
	}
	
	@Step
	public void clickBtnEnviar() throws InterruptedException {
		enviarcasosPage.clickBtnEnviar();
	}
	
	@Step
	public void ingresarCodigoPrecinto() throws InterruptedException {
		enviarcasosPage.ingresarCodigoPrecinto();
	}
	
	@Step
	public void clickBtnCasosEnviados() throws InterruptedException {
		enviarcasosPage.clickBtnCasosEnviados();
	}
	
}
