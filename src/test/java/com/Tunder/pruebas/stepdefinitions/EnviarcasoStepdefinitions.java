package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.pages.BaseWrapper;
import com.Tunder.pruebas.steps.HomeSteps;
import com.Tunder.pruebas.steps.EnviarcasoSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class EnviarcasoStepdefinitions {

	
	@Steps
	EnviarcasoSteps enviarcasoSteps;
	@Steps
    HomeSteps homeSteps;
	
	com.Tunder.pruebas.pages.BaseWrapper BaseWrapper = new BaseWrapper();

@Given("el usuario seleciona los casos a enviar")
public void el_usuario_seleciona_los_casos_a_enviar() throws InterruptedException {
	enviarcasoSteps.clickBtnCheck();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Given("ingresa el numero de precinto")
public void ingresa_el_numero_de_precinto() throws InterruptedException {
	enviarcasoSteps.ingresarCodigoPrecinto();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Then("el usuario da click en el boton enviar")
public void el_usuario_da_click_en_el_boton_enviar() throws InterruptedException {
	enviarcasoSteps.clickBtnEnviar();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Then("el usuario seleciona la bandeja mis casos enviados")
public void el_usuario_seleciona_la_bandeja_mis_casos_enviados() throws InterruptedException {
	enviarcasoSteps.clickBtnCasosEnviados();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Then("el usuario puede visualizar la bandeja de casos enviados")
public void el_usuario_puede_visualizar_la_bandeja_de_casos_enviados() throws InterruptedException {
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}
	
	
	
}
