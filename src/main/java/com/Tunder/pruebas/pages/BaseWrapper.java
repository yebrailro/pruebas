package com.Tunder.pruebas.pages;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zaproxy.clientapi.core.ClientApi;

import net.serenitybdd.core.pages.PageObject;

public class BaseWrapper extends PageObject {
	public static final String ZAP_PROXYHOST = "localhost";
	public static final int ZAP_PROXYPORT = 8050;
	public static ClientApi api;
	int time = 500;

	
	public static int MAXIMO_TIEMPO_ESPERA = 15000;
	public static int MEDIO_TIEMPO_ESPERA = 8000;
	public static int MINIMO_TIEMPO_ESPERA = 2000;
	
	public static final String DOMINIO_ROOT = "https://st-firmaelectronica.awsbanbogota.com/";
	
	public void uploadFile(By locator, String path) {
		WebElement chooseFile = getDriver().findElement(locator);
		chooseFile.sendKeys(path);
	}
	
///////////////////////////////
	public void FactoryShadowRootClick1(String locator) throws InterruptedException {
		new WebDriverWait(getDriver(), 20)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.click();
	}

	public void FactoryShadowRootSendKeys1(String locator, String value) throws InterruptedException {
		new WebDriverWait(getDriver(), 20)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.sendKeys(value);
	}
	
	
	public boolean FactoryShadowRootIsDisplayed1(String locator) throws InterruptedException {
		return new WebDriverWait(getDriver(), 20)
				.until(ExpectedConditions.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver())

						.executeScript(locator)))
				.isDisplayed();
	}


	
	//////////////////////////////777

	public void openBrowser() {
		open();
	}

	public void refreshPage() {
		getDriver().navigate().refresh();
	}

	public String getText(By locator) throws InterruptedException {
		Thread.sleep(time);
		return find(locator).getText();
	}

	public void click(By locator) throws InterruptedException {
		find(locator).click();
		Thread.sleep(time);
	}

	public String getCurrentUrl() throws InterruptedException {
		Thread.sleep(time);
		return getDriver().getCurrentUrl();
	}

	public Boolean isDisplayed(By locator) {
		return find(locator).isDisplayed();
	}

	public WebDriverWait objectExists(By locator) {
		WebDriverWait element = new WebDriverWait(getDriver(), 30);
		element.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		return element;
	}
	

	public String FactoryShadowRootGetText(String locator) throws InterruptedException {
		return new WebDriverWait(getDriver(), 30)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.getText();
	}

	public void FactoryShadowRootObjectInvisibility(String locator) throws InterruptedException {
		new WebDriverWait(getDriver(), 30).until(ExpectedConditions
				.invisibilityOf((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)));
		Thread.sleep(time);
	}

	public boolean FactoryShadowRootObjectVisibility(String locator) throws InterruptedException {
		new WebDriverWait(getDriver(), 30).until(ExpectedConditions
				.visibilityOf((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)));
		Thread.sleep(time);
		return true;
	}

	public void FactoryShadowRootClick(String locator) throws InterruptedException {
		new WebDriverWait(getDriver(), 30)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.click();
		Thread.sleep(time);
	}
	public WebElement Scroll(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebElement element = find(locator);
		return (WebElement) js.executeScript("arguments[4].scrollIntoView();", element);
	}

	public void FactoryShadowRootSendKeys(String locator, String value) throws InterruptedException {
		FactoryShadowRootClear(locator);
		new WebDriverWait(getDriver(), 30)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.sendKeys(value);
		Thread.sleep(time);
	}

	public void FactoryShadowRootClear(String locator) throws InterruptedException {
		new WebDriverWait(getDriver(), 30)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.clear();
		Thread.sleep(time);
	}

	public boolean FactoryShadowRootIsDisplayed(String locator) throws InterruptedException {
		return new WebDriverWait(getDriver(), 30)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.isDisplayed();
	}
	

	public boolean FactoryShadowRootIsEnabled(String locator) throws InterruptedException {
		return new WebDriverWait(getDriver(), 30)
				.until(ExpectedConditions
						.elementToBeClickable((WebElement) ((JavascriptExecutor) getDriver()).executeScript(locator)))
				.isEnabled();
	}

	

	public void ScrollDownPage() throws InterruptedException {
		Thread.sleep(100);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollTo(0,260, document.body.scrollHeight)");
	}

	public void Scroll(int a) throws InterruptedException {
		Thread.sleep(time);
		((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0," + a + ")");
	}

	public void BtnNegociar() {
		// TODO Auto-generated method stub
		
	}
}
