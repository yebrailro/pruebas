package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.steps.HomeSteps;
import com.Tunder.pruebas.steps.TrasmitarSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class trasmitarStepdefinitions {
	@Steps
	TrasmitarSteps trasmitarSteps;
	@Steps
    HomeSteps homeSteps;

@Given("el Ejecutivo selecciona el registro a tramitar")
public void el_ejecutivo_selecciona_el_registro_a_tramitar() throws InterruptedException {
	trasmitarSteps.clickBtnTrami();	
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	
}

@Given("visualiza la informacion del caso seleccionado")
public void visualiza_la_informacion_del_caso_seleccionado() throws InterruptedException {
	trasmitarSteps.clickBtnGarantia();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	
}

@Given("el Ejecutivo da click en ngresa el numero de garantia")
public void el_ejecutivo_da_click_en_ngresa_el_numero_de_garantia() throws InterruptedException {
	trasmitarSteps.ingresarCodigoHqrunt();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	
}

@Given("da click en el boton Guardar")
public void da_click_en_el_boton_guardar() throws InterruptedException {
	trasmitarSteps.clickBtnGuardar();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Given("da click en el boton Regresar")
public void da_click_en_el_boton_regresar() throws InterruptedException {
	trasmitarSteps.clickBtnRegresar();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
}

@Then("el usuario puede visualizar y observar el cambio de estado")
public void el_usuario_puede_visualizar_y_observar_el_cambio_de_estado() throws InterruptedException {
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
	Thread.sleep(1000);
   
}
	
	
}
