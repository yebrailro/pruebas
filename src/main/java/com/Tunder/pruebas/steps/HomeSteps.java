package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Step
	public String extraerTextoQueDeseasRealizar() throws InterruptedException {
		return homePage.extraerTextoQueDeseasRealizar();
	}
	
	
	
	
	@Step
	public void clickEnAprobacionAgil() throws InterruptedException {
		homePage.clickEnAprobacionAgil();
	}
	
	@Step
	public void clickEnFirmaElectronica() throws InterruptedException {
		homePage.clickEnFirmaElectronica();
	}
	
	@Step
	public String extraerTextoSuSesionHaCaducadoPorInactividad() throws InterruptedException{
		return homePage.extraerTextoSuSesionHaCaducadoPorInactividad();
	}
	
	@Step
	public void clickEnIniciarSesionModalInactividad() throws InterruptedException{
		homePage.clickEnIniciarSesionModalInactividad();
	}
	
	
}
