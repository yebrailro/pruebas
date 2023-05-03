package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.InicioSessionPage;

import net.thucydides.core.annotations.Step;

public class InicioSessionSteps {
	
	InicioSessionPage inicioSessionpage = new InicioSessionPage();
	
	@Step
	public void clickEnDominio() throws InterruptedException {
		inicioSessionpage.clickEnDominio();
	}
	
	@Step
	public void abrirAplicacionFirmaElectronica() throws InterruptedException {
		inicioSessionpage.openBrowser();
	}

	@Step
	public void ingresarUsuario(String usuarioValido) throws InterruptedException {
		inicioSessionpage.ingresarUsuario(usuarioValido);
	}
	
	@Step
	public void ingresarClave(String claveValida) throws InterruptedException {
		inicioSessionpage.ingresarClave(claveValida);
	}
	
	@Step
	public void seleccionarDominioBancodeBogota() throws InterruptedException {
		inicioSessionpage.seleccionarDominioBancodeBogota();
	}
	
	@Step
	public void clickEnBtnIngresar() throws InterruptedException {
		inicioSessionpage.clickEnBtnIngresar();
	}
	
	@Step
	public void clickBtnGarantia() throws InterruptedException {
		inicioSessionpage.clickBtnGarantia();
	}
	@Step
	public void clickBtnTrami() throws InterruptedException {
		inicioSessionpage.clickBtnTrami();
	}
	
	@Step
	public void adjuntardocumentoValido() throws InterruptedException {
		inicioSessionpage.adjuntardocumentoValido();
	}
	@Step
	public void ingresarCodigoHqrunt() throws InterruptedException {
		inicioSessionpage.ingresarCodigoHqrunt();
	}
	
	@Step
	public void ingresarCodigoPrecinto() throws InterruptedException {
		inicioSessionpage.ingresarCodigoPrecinto();
	}
	
	@Step
	public void clickBtnGuardar() throws InterruptedException {
		inicioSessionpage.clickBtnGuardar();
	}
	
	@Step
	public void clickBtnRegresar() throws InterruptedException {
		inicioSessionpage.clickBtnRegresar();
	}
	@Step
	public void clickBtnCheck() throws InterruptedException {
		inicioSessionpage.clickBtnCheck();
	}
	
	@Step
	public void clickBtnEnviar() throws InterruptedException {
		inicioSessionpage.clickBtnEnviar();
	}

}
