package com.Tunder.pruebas.stepdefinitions;

import com.Tunder.pruebas.steps.SelecionarP1Steps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class SelecionaP1Stepdefinitions {

    @Steps
    SelecionarP1Steps selecionarP1Steps;

    @Given("el usuario seleciona  un producto")
    public void el_usuario_seleciona_un_producto() throws InterruptedException {
    selecionarP1Steps.colchon();
        Thread.sleep(1000);
        Thread.sleep(2000);

    }
    @Given("seleciona agragar al carrito")
    public void seleciona_agragar_al_carrito() throws InterruptedException {
        selecionarP1Steps.agregar();
        Thread.sleep(4000);
        Thread.sleep(5000);


    }
    @Given("seleciona la cantidad")
    public void seleciona_la_cantidad() throws InterruptedException {
        selecionarP1Steps.cantidad();
        Thread.sleep(5000);
        selecionarP1Steps.cantidad2();
        Thread.sleep(1000);
        selecionarP1Steps.cantidad2();
        Thread.sleep(1000);
        selecionarP1Steps.cantidad2();


    }
}
