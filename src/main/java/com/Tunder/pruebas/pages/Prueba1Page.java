package com.Tunder.pruebas.pages;


public class Prueba1Page {
	
BaseWrapper baseWrapper = new BaseWrapper();

	
	
public void openBrowser() throws InterruptedException {
	baseWrapper.openBrowser();
}

String menu ="return document.querySelector(\"body > div.render-container.render-route-store-home > div > div.vtex-store__template.bg-base > div > div:nth-child(2) > div.vtex-sticky-layout-0-x-wrapper.vtex-sticky-layout-0-x-wrapper--header-content > div > div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--header-row-layout.vtex-flex-layout-0-x-flexRow--header-content > div > div.pr3.items-stretch.vtex-flex-layout-0-x-stretchChildrenWidth.flex > div > div > div > div > div:nth-child(1) > div > div > div > button\")";

    String CT =  "return document.querySelector(\"#undefined-nivel2-Dormitorio\")";
    String SubCT = "return document.querySelector(\"#Categorías-nivel3-Colchones\\\\ sencillos\")";

    public void Selecionarmenu() throws InterruptedException {
        if (baseWrapper.FactoryShadowRootIsDisplayed(menu)) {
            baseWrapper.FactoryShadowRootClick(menu);
        }
    }

    public void SelecionarCT() throws InterruptedException {
        if (baseWrapper.FactoryShadowRootIsDisplayed(CT)) {
            baseWrapper.FactoryShadowRootClick(CT);
        }
    }

    public void SelecionarSCT() throws InterruptedException {
        if (baseWrapper.FactoryShadowRootIsDisplayed(SubCT)) {
            baseWrapper.FactoryShadowRootClick(SubCT);
        }
    }
}
