package com.Tunder.pruebas.pages;

public class CreacionCasoPage {

	
	BaseWrapper baseWrapper = new BaseWrapper();
	
	String btncrear = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > app-welcome-header > div > div.item-header-shipping.col-md-4 > button\")";
	
	
	public void clickBtnCrear() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btncrear)) {
			baseWrapper.FactoryShadowRootClick(btncrear);
		}
		System.out.println("Inicio de sesion. clickBtnCrear");
	}
	
	
}
