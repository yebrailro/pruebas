package com.Tunder.pruebas.pages;

public class HomePage {
	BaseWrapper baseWrapper = new BaseWrapper();
	

	String TextoQueDeseasRealizar = "return document.querySelector(\"#template-layout > div:nth-child(3) > app-home > div > div > p\")";
	
	String BtnAprobacionAgil = "return document.querySelector(\"#template-layout > div:nth-child(3) > app-home > div > div > div > bdb-ml-multi-action:nth-child(1)\").shadowRoot.querySelector(\"#bdb-ml-multi-action\")";
	String BtnIniciarSesionModalInactividad = "return document.querySelector(\"body > app-root > app-layout > bdb-ml-modal:nth-child(6)\").shadowRoot.querySelector(\"#\\\\30 \")";
	String BtnFirmaElectronica = "return document.querySelector(\"#template-layout > div:nth-child(3) > app-home > div > div > div > bdb-ml-multi-action:nth-child(2)\").shadowRoot.querySelector(\"#bdb-ml-multi-action\")";
	String TextoSuSesionHaCaducadoPorInactividad = "return document.querySelector(\"body > app-root > app-layout > bdb-ml-modal:nth-child(6)\").shadowRoot.querySelector(\"#wc-modal-alerts > div > div > div > div.bdb-ml-modal__content__box__title\")";

	public String extraerTextoQueDeseasRealizar() throws InterruptedException {
		return baseWrapper.FactoryShadowRootGetText(TextoQueDeseasRealizar);
	}
	
	
	

	public void clickEnAprobacionAgil() throws InterruptedException {
		if (baseWrapper.FactoryShadowRootIsDisplayed(BtnAprobacionAgil)) {
			baseWrapper.FactoryShadowRootClick(BtnAprobacionAgil);
		}
	}

	public void clickEnFirmaElectronica() throws InterruptedException {
		if (baseWrapper.FactoryShadowRootIsDisplayed(BtnFirmaElectronica)) {
			baseWrapper.FactoryShadowRootClick(BtnFirmaElectronica);
		}
	}

	public String extraerTextoSuSesionHaCaducadoPorInactividad() throws InterruptedException {
		return baseWrapper.FactoryShadowRootGetText(TextoSuSesionHaCaducadoPorInactividad);
	}

	public void clickEnIniciarSesionModalInactividad() throws InterruptedException {
		if (baseWrapper.FactoryShadowRootIsDisplayed(BtnIniciarSesionModalInactividad)) {
			baseWrapper.FactoryShadowRootClick(BtnIniciarSesionModalInactividad);
		}
	}
}
