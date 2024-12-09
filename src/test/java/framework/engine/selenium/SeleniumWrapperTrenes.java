package framework.engine.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumWrapperTrenes {
    protected WebDriverWait wait;

    protected final WebDriver driver;

    //Constructor Base
    public SeleniumWrapperTrenes(WebDriver driver){
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
    public String getFirstOption (By locator){
        WebElement selectElement = driver.findElement(locator);
        Select select = new Select(selectElement);    // Inicializa un objeto
        WebElement selectedOption = select.getFirstSelectedOption();      // Obtén la opción actualmente seleccionada
        System.out.println("Opción seleccionada: " + selectedOption.getText());   // Imprime el texto de la opción seleccionada
        return selectedOption.getText();
    }

    public void write(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void sendKeys(Keys key, By locator){
        driver.findElement(locator).sendKeys(key);
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

    //waits------------------------------------------------------------------------------------
    public void esperarXSegundos(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement esperaExplicita(By locator,int segundos){
        wait = new WebDriverWait(this.driver,segundos);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement esperaExplicita(WebElement element,int segundos){
        try {
            wait = new WebDriverWait(this.driver,segundos);
            return wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            System.out.println(e);
        }
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Click------------------------------------------------------------------------------------

    public void click(WebElement elemento){  elemento.click();
    }

    public void click(WebElement elemento,int segundos){
        wait = new WebDriverWait(this.driver,segundos);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
        elemento.click();}

    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void clear(By locator){
        driver.findElement(locator).clear();
    }

    public void scrollDown(){
        // Usando JavascriptExecutor para hacer scroll hacia abajo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200);"); // Desplaza X( en este caso 1200) píxeles hacia abajo
    }

    public void scrollDownmiddle(){
        // Usando JavascriptExecutor para hacer scroll hacia abajo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2200);"); // Desplaza X( en este caso 2200) píxeles hacia abajo
    }

    public void scrollUp(){
        // Usando JavascriptExecutor para hacer scroll hacia abajo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 0);"); //
    }
}

