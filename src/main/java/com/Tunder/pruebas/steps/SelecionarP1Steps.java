package com.Tunder.pruebas.steps;

import com.Tunder.pruebas.pages.SeleionarP1Page;

public class SelecionarP1Steps {

    SeleionarP1Page seleionarP1Page =new SeleionarP1Page();

    public void colchon() throws InterruptedException {
        seleionarP1Page.colchon();
    }

    public void agregar() throws InterruptedException {
        seleionarP1Page.agregar1();
    }

    public void cantidad() throws InterruptedException {
        seleionarP1Page.selecionar();
    }
    public void cantidad2() throws InterruptedException {
        seleionarP1Page.selecionar2();
    }
}
