package framework.engine.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.util.List;

public class SeleniumWrapper {

    protected final WebDriver driver;
    protected WebDriverWait wait; 

    //Constructor Base
    public SeleniumWrapper(WebDriver driver){
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements (By locator){
        return driver.findElements(locator);
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void sendKeys(Keys key, By locator){
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void click(WebElement elemento){
        elemento.click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public String getUrlTitle(){
        return driver.getTitle();
    }

    public void esperarXSegundos(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement esperaExplicita(By locator, int segundos) {
       wait = new WebDriverWait(this.driver, segundos);
        return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void scrollDown(){
        // Usando JavascriptExecutor para hacer scroll hacia abajo
        JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, 1200);");
        // Desplaza X( en este caso 1200) píxeles hacia abajo}
    }

    public void agregarTexto(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public void cerrarBrowser() {
        this.driver.close();
    }

    public void maximizarBrowser() {
        this.driver.manage().window().maximize();
    }

    public void esperarCargaCompleta() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Esperar a que el navegador haya terminado de cargar completamente
        while (!js.executeScript("return document.readyState").equals("complete")) {
            try {
                Thread.sleep(1000);  // Espera de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}