package com.Tunder.pruebas.pages;

public class TrasmitarPage {

	BaseWrapper baseWrapper = new BaseWrapper();
	
	String btnTrami = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > div > app-table > table > tbody > tr:nth-child(6) > td.button > app-cell-table > div > button\")";
	String btnGarantiaExistente = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager-process > app-case-information:nth-child(3) > div.container > div.row.s-m-y-4.ng-tns-c15-0.ng-star-inserted > app-checkbox-group:nth-child(2) > div > bdb-at-radio-button\").shadowRoot.querySelector(\"#check_0 > div\")";
	String txtCodigoHqrunt =  "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager-process > app-case-information:nth-child(3) > div.container > div > app-checkbox-group:nth-child(2) > div > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String btnGuardar = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager-process > section > button\")";
	String btnRegresar = "return document.querySelector(\"body > app-root > app-layout > bdb-ml-header-bv\").shadowRoot.querySelector(\"#bdb-ml-header-bv > div > div.bdb-ml-header-bv__container__content__button.bdb-ml-header-bv__container__content__button--l > div > button\")";
	String btncheck = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > div > app-table > table > thead > tr > th:nth-child(1) > app-cell-table > div > bdb-at-check-button\").shadowRoot.querySelector(\"#bdb-at-check-button\")";
	String txtCodigoprecinto = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > section > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String btnenviar= "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > section > button\")";
	
	
	public void clickBtnTrami() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btnTrami)) {
			baseWrapper.FactoryShadowRootClick(btnTrami);
		}
		System.out.println("Inicio de sesion. clickEnBtnTrami");
	}
	public void clickBtnGarantia() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btnGarantiaExistente)) {
			baseWrapper.FactoryShadowRootClick(btnGarantiaExistente);
		}
		System.out.println("Inicio de sesion. clickEnBtnTrami");
	}
	//////////////
	
	public void ingresarCodigoHqrunt() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(txtCodigoHqrunt)) {
			baseWrapper.FactoryShadowRootClick(txtCodigoHqrunt);
			baseWrapper.FactoryShadowRootSendKeys(txtCodigoHqrunt, "1234567");
		}
		System.out.println("Hqrunt. ingresarCodigoHqrunt");
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
	
	
	///////////
	public void clickBtnGuardar() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btnGuardar)) {
			baseWrapper.FactoryShadowRootClick(btnGuardar);
		}
		System.out.println("Inicio de sesion. clickEnbtnGuardar");
	}
	
	public void clickBtnRegresar() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btnRegresar)) {
			baseWrapper.FactoryShadowRootClick(btnRegresar);
		}
		System.out.println("Inicio de sesion. clickEnBtnRegresar");
	}
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
	
}
