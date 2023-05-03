package com.Tunder.pruebas.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", 
				glue = "com.minecraf.pruebas.stepdefinitions", 
				tags = ("@tramiTest"))
public class trasmitarRunner {

}
