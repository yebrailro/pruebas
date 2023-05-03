package com.Tunder.pruebas.pages;

import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_TIMEOUTS_FLUENTWAIT;
import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_WAIT_FOR_TIMEOUT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.DefaultTimeouts;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;

public class InicioSessionPage {

BaseWrapper baseWrapper = new BaseWrapper();
	
	By btnCargarPrenda = By.xpath("/html/body/app-root/app-layout/div/div/app-shipping-manager/div/app-table/table/tbody/tr[1]/td[8]/app-cell-table/div/button/label");
	
	String txtUsuario =  "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-input:nth-child(2)\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String txtClave  =  "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-input:nth-child(3)\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String mostrarClave = "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-input:nth-child(3)\").shadowRoot.querySelector(\"div > div.input-box__content > span.input-box__content__labelMask\")";
	String selectDominio = "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-dropdown\").shadowRoot.querySelector(\"#dropdown_1\")";
	String optionBancodeBogota = "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-dropdown\").shadowRoot.querySelector(\"#option-BANCODEBOGOTA\")";
	String btnIngresar = "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-load-button\").shadowRoot.querySelector(\"#boton\")";
	String btnTrami = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > div > app-table > table > tbody > tr:nth-child(1) > td:nth-child(8) > app-cell-table > div > button\")";
	String btnGarantiaExistente = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager-process > app-case-information:nth-child(3) > div.container > div.row.s-m-y-4.ng-tns-c15-0.ng-star-inserted > app-checkbox-group:nth-child(2) > div > bdb-at-radio-button\").shadowRoot.querySelector(\"#check_0 > div\")";
	String txtCodigoHqrunt =  "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager-process > app-case-information:nth-child(3) > div.container > div > app-checkbox-group:nth-child(2) > div > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String btnGuardar = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager-process > section > button\")";
	String btnRegresar = "return document.querySelector(\"body > app-root > app-layout > bdb-ml-header-bv\").shadowRoot.querySelector(\"#bdb-ml-header-bv > div > div.bdb-ml-header-bv__container__content__button.bdb-ml-header-bv__container__content__button--l > div > button\")";
	String btncheck = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > div > app-table > table > thead > tr > th:nth-child(1) > app-cell-table > div > bdb-at-check-button\").shadowRoot.querySelector(\"#bdb-at-check-button\")";
	String txtCodigoprecinto = "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > section > bdb-at-input\").shadowRoot.querySelector(\"#bdb-at-input\")";
	String btnenviar= "return document.querySelector(\"body > app-root > app-layout > div > div > app-shipping-manager > section > button\")";
	
	
	By btnTramitar = By.xpath("/html/body/app-root/app-layout/div/div/app-shipping-manager/div/app-table/table/tbody/tr[2]/td[8]");
	//String btnTramitar = "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-load-button\").shadowRoot.querySelector(\"#boton\")";

	public void openBrowser() throws InterruptedException {
		baseWrapper.openBrowser();
	}
	
	
	public void adjuntardocumentoValido() throws InterruptedException {
		if(find(btnCargarPrenda).isEnabled()) {
			baseWrapper.uploadFile(btnCargarPrenda, "D:\\Trabajo\\Proyectos\\ViVe\\Factura Vehículos\\prendaPrueba.PDF");
		}
		System.out.println("PrendaFirmada. adjuntardocumentoValido");
	}
	 public <T extends net.serenitybdd.core.pages.WebElementFacade> T find(By selector) {
	        return element(selector);
	    }
	 public <T extends net.serenitybdd.core.pages.WebElementFacade> T element(By bySelector) {
	        return net.serenitybdd.core.pages.WebElementFacadeImpl.wrapWebElement(driver,
	                bySelector,
	                getImplicitWaitTimeout().toMillis(),
	                getWaitForTimeout().toMillis(),
	                bySelector.toString());
	    }
	 private WebDriver driver;

	  public Duration getWaitForTimeout() {

	        if (waitForTimeout == null) {
	            int configuredWaitForTimeoutInMilliseconds = fluentWaitTimeout();
	            waitForTimeout = Duration.ofMillis(configuredWaitForTimeoutInMilliseconds);
	        }
	        return waitForTimeout;
	    }
	  private int fluentWaitTimeout() {
	        return (WEBDRIVER_WAIT_FOR_TIMEOUT.integerFrom(environmentVariables,
	                WEBDRIVER_TIMEOUTS_FLUENTWAIT.integerFrom(environmentVariables,
	                        (int) DefaultTimeouts.DEFAULT_WAIT_FOR_TIMEOUT.toMillis())));
	    }
	  
	  private EnvironmentVariables environmentVariables;
	 
	 public Duration getImplicitWaitTimeout() {

	        if (waitForElementTimeout == null) {
	            int configuredWaitForTimeoutInMilliseconds =
	                    ThucydidesSystemProperty.WEBDRIVER_TIMEOUTS_IMPLICITLYWAIT
	                            .integerFrom(environmentVariables, (int) DefaultTimeouts.DEFAULT_IMPLICIT_WAIT_TIMEOUT.toMillis());
	            waitForElementTimeout = Duration.ofMillis(configuredWaitForTimeoutInMilliseconds);
	        }
	        return waitForElementTimeout;
	    }
	 private Duration waitForTimeout;
	    private Duration waitForElementTimeout;

	

	public void ingresarUsuario(String usuarioValido) throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(txtUsuario)) {
			baseWrapper.FactoryShadowRootClick(txtUsuario);
			baseWrapper.FactoryShadowRootSendKeys(txtUsuario, usuarioValido);
		}
		System.out.println("Inicio de sesion. ingresarUsuario");
	}
	
	public void ingresarClave(String claveValida) throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(txtClave)) {
			baseWrapper.FactoryShadowRootClick(txtClave);
			baseWrapper.FactoryShadowRootSendKeys(txtClave, claveValida);
			baseWrapper.FactoryShadowRootClick(mostrarClave);
		}
		System.out.println("Inicio de sesion. ingresarClave");
	}
	
	public void clickEnDominio() throws InterruptedException {
		if (baseWrapper.FactoryShadowRootIsDisplayed(txtUsuario)) {
			baseWrapper.FactoryShadowRootClick(txtUsuario);
		}
	}
	public void seleccionarDominioBancodeBogota() throws InterruptedException {
		baseWrapper.FactoryShadowRootClick(selectDominio);
		Thread.sleep(500);
		baseWrapper.FactoryShadowRootClick(optionBancodeBogota);
		System.out.println("Inicio de sesion. seleccionarDominioBancodeBogota");
	}
	public void clickEnBtnIngresar() throws InterruptedException {
		if(baseWrapper.FactoryShadowRootIsDisplayed(btnIngresar)) {
			baseWrapper.FactoryShadowRootClick(btnIngresar);
		}
		System.out.println("Inicio de sesion. clickEnBtnIngresar");
	}
	public void clickBtnTramitar() throws InterruptedException {
		click(btnTramitar);
		System.out.println("HomePage. btnTramitar");
	}
	private void click(By btnTramitar) {
		// TODO Auto-generated method stub
		
	}
	
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
