package com.Tunder.pruebas.pages;

import org.openqa.selenium.By;

public class SeleionarP1Page extends BaseWrapper{

    BaseWrapper baseWrapper = new BaseWrapper();

    String colchon =  "return document.querySelector(\"#gallery-layout-container > div:nth-child(1) > section > a > article > div.pointer.pt3.pb4.flex.flex-column.h-100 > div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--product-info-container > div > div > div > div:nth-child(1) > div > div > div:nth-child(3) > div\")";

    By agregar = By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[3]/div/div[11]/div/section/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[10]/div/div/div/div[2]/div[2]/button/div" +
            "");

    By uno = By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[3]/div/div[11]/div/section/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[10]/div/div/div/div[2]/div/button");

    //String btnTramitar = "return document.querySelector(\"body > app-root > app-login > div > app-form-login > div > bdb-at-load-button\").shadowRoot.querySelector(\"#boton\")";

    By dos = By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[3]/div/div[11]/div/section/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[10]/div/div/div/div[2]/div/button[2]");
    String agregar1 ="return document.querySelector(\"#render-store\\\\.search\\\\#subcategory > div > div.vtex-store__template.bg-base > div > div > div > div:nth-child(4) > div > div:nth-child(11) > div > section > div > div.pr0.vtex-flex-layout-0-x-stretchChildrenWidth.flex > div > div > div > div > div > div > div > div > div.vtex-flex-layout-0-x-flexCol.vtex-flex-layout-0-x-flexCol--product-price-PDP.ml0.mr0.pl0.pr0.flex.flex-column.h-100.w-100 > div:nth-child(1) > div > div > div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--row-buy-button > div > div > div > div:nth-child(2)\")";
    public void colchon() throws InterruptedException {
        if (baseWrapper.FactoryShadowRootIsDisplayed(colchon)) {
            baseWrapper.FactoryShadowRootClick(colchon);
        }
    }

    //public void agregar1() throws InterruptedException {
      //  if (baseWrapper.FactoryShadowRootIsDisplayed(agregar)) {
        //    baseWrapper.FactoryShadowRootClick(agregar);
        //}
    //}

    public void agregar1() throws InterruptedException {
        click(agregar);
    }


    public void selecionar() throws InterruptedException {
        click(uno);
    }

    public void selecionar2() throws InterruptedException {
        click(dos);
    }
}
