package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.pages.BaseWrapper;
import com.Tunder.pruebas.steps.HomeSteps;
import com.Tunder.pruebas.steps.CreacionCasoSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CreacionCasoStepdefinitions {
	
	@Steps
	CreacionCasoSteps creacioncasosSteps;
	@Steps
    HomeSteps homeSteps;
	
	com.Tunder.pruebas.pages.BaseWrapper BaseWrapper = new BaseWrapper();


@Given("el usuario seleciona  el boton crear caso")
public void el_usuario_seleciona_el_boton_crear_caso() throws InterruptedException {
	creacioncasosSteps.clickBtnCrear();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Given("seleciona el tipo de documento")
public void seleciona_el_tipo_de_documento() {
   
}

@Then("el usuario ingresa su documento")
public void el_usuario_ingresa_su_documento() {
   
}

@Then("el usuario ingresa el tipo de credito")
public void el_usuario_ingresa_el_tipo_de_credito() {
   
}

@Then("el usuario seleciona el producto bancario")
public void el_usuario_seleciona_el_producto_bancario() {
  
}

@Then("el usuario ingresa el numero de la garantia")
public void el_usuario_ingresa_el_numero_de_la_garantia() {
    
}

@Then("el usuario da click en el boton guardar")
public void el_usuario_da_click_en_el_boton_guardar() {
   
}

	
	
}
