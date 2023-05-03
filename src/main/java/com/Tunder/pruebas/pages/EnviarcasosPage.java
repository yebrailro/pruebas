package com.Tunder.pruebas.pages;

public class EnviarcasosPage {

	BaseWrapper baseWrapper = new BaseWrapper();
	
	
	String btncheck = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > div > app-table > table > thead > tr > th:nth-child(1) > app-cell-table > div > bdb-at-check-button\").shadowRoot.querySelector(\"#bdb-at-check-button\")";
	String txtCodigoprecinto = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > section > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String btnenviar= "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > section > button\")";
	String btncasosenviados= "return document.querySelector(\"body > app-root > app-layout > div > app-slide-menu > div > app-item-menu:nth-child(2) > div\")";
	
	
	public void clickBtnCheck() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btncheck)) {
			baseWrapper.FactoryShadowRootClick(btncheck);
		}
		System.out.println("Inicio de sesion. clickEnBtnCheck");
	}
	public void clickBtnEnviar() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btnenviar)) {
			baseWrapper.FactoryShadowRootClick(btnenviar);
		}
		System.out.println("Inicio de sesion. clickEnBtnEnviar");
	}
	
	public void ingresarCodigoPrecinto() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(txtCodigoprecinto)) {
			baseWrapper.FactoryShadowRootClick(txtCodigoprecinto);
			baseWrapper.FactoryShadowRootSendKeys(txtCodigoprecinto, "12345678910");
		}
		System.out.println("Hqrunt. ingresarCodigoPrecinto");
	}
	
	public class Assert {
		
		
	}
	
	public void clickBtnCasosEnviados() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btncasosenviados)) {
			baseWrapper.FactoryShadowRootClick(btncasosenviados);
		}
		System.out.println("Inicio de sesion. clickEnBtnCasosEnviados");
	}
	
	
}
