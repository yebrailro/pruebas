package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.Prueba1Page;
public class Prueba1Steps {
	
	Prueba1Page prueba1page = new Prueba1Page();

	public void abrirGmail() throws InterruptedException {
		prueba1page.openBrowser();
		

	}

	public void Selecionamenu() throws InterruptedException {
		prueba1page.Selecionarmenu();
	}

    public void SelecionaCT() throws InterruptedException {
		prueba1page.SelecionarCT();
    }

	public void SelecionaSCT() throws InterruptedException {
		prueba1page.SelecionarSCT();
	}
}
