package com.Tunder.pruebas.stepdefinitions;




import com.Tunder.pruebas.steps.HomeSteps;
import com.Tunder.pruebas.steps.InicioSessionSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InicioSessionStepdefinitions {

	@Steps
	InicioSessionSteps inicioSesionSteps;
	
	@Steps
    HomeSteps homeSteps;
	
	@Given("el usuario se encuentra en la pantalla Login de Garantias")
	public void el_usuario_se_encuentra_en_la_pantalla_login_de_garantias() throws InterruptedException {
		inicioSesionSteps.abrirAplicacionFirmaElectronica();
		inicioSesionSteps.clickEnDominio();
	}

	@When("ingresa el usuario de red {string} y la clave {string}")
	public void ingresa_el_usuario_de_red_y_la_clave(String usuarioValido, String claveValida)throws InterruptedException {
		inicioSesionSteps.ingresarUsuario(usuarioValido);
		inicioSesionSteps.ingresarClave(claveValida);
	}

	@When("selecciona el dominio correcto")
	public void selecciona_el_dominio_correcto() throws InterruptedException {
		inicioSesionSteps.seleccionarDominioBancodeBogota();
	}

	@When("presiona el boton Ingresar")
	public void presiona_el_boton_ingresar() throws InterruptedException {
		inicioSesionSteps.clickEnBtnIngresar();
	}

	@Then("se debe visualizar la pantalla HomePage")
	public void se_debe_visualizar_la_pantalla_home_page() throws InterruptedException {
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
	   
	}

	
	
}
