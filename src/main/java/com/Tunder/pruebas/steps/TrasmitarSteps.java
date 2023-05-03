package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.TrasmitarPage;

import net.thucydides.core.annotations.Step;

public class TrasmitarSteps {

	//GarantiasPage garantiasPage = new GarantiasPage();
	TrasmitarPage trasmitarPage = new TrasmitarPage();
	
	
	@Step
	public void clickBtnGarantia() throws InterruptedException {
		trasmitarPage.clickBtnGarantia();
	}
	@Step
	public void clickBtnTrami() throws InterruptedException {
		trasmitarPage.clickBtnTrami();
	}
	
	
	@Step
	public void ingresarCodigoHqrunt() throws InterruptedException {
		trasmitarPage.ingresarCodigoHqrunt();
	}
	
	@Step
	public void ingresarCodigoPrecinto() throws InterruptedException {
		trasmitarPage.ingresarCodigoPrecinto();
	}
	
	@Step
	public void clickBtnGuardar() throws InterruptedException {
		trasmitarPage.clickBtnGuardar();
	}
	
	@Step
	public void clickBtnRegresar() throws InterruptedException {
		trasmitarPage.clickBtnRegresar();
	}
	@Step
	public void clickBtnCheck() throws InterruptedException {
		trasmitarPage.clickBtnCheck();
	}
	
	@Step
	public void clickBtnEnviar() throws InterruptedException {
		trasmitarPage.clickBtnEnviar();
	}
	
}
