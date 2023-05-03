package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.steps.HomeSteps;
import com.Tunder.pruebas.steps.Prueba1Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Prueba1Stepdefinitions {
	@Steps
	Prueba1Steps prueba1steps;
	
	@Steps
    HomeSteps homeSteps;

	@Given("el usuario se encuentra en la pantalla exito")
	public void el_usuario_se_encuentra_en_la_pantalla_exito() throws InterruptedException {
		prueba1steps.abrirGmail();
		Thread.sleep(1000);
		
	    
	}

	@When("ingresa el usuario  selecionara una categoria")
	public void ingresa_el_usuario_selecionara_una_categoria() throws InterruptedException {
		prueba1steps.Selecionamenu();
		Thread.sleep(1000);
		prueba1steps.SelecionaCT();
		Thread.sleep(1000);
	}
	@When("y seleciona una sub categoria")
	public void y_seleciona_una_sub_categoria() throws InterruptedException {
		prueba1steps.SelecionaSCT();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(5000);

		Thread.sleep(5000);
	}
}
