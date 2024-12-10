package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePage extends SeleniumWrapper {
    By aceptarCookie= By.xpath("//button[@class=\"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");
    By btnHoteles = By.xpath("//a[@href='https://www.rumbo.es/hoteles']");
    By vuelos = By.xpath("//a[@title='Vuelos']");
    By btnIda= By.xpath("//button[text()='Solo ida']");
    By origen = By.xpath("//*[@id=\":Riqij6lalamt2mm:\"]");
    By destino = By.xpath("//input[@role=\"combobox\" and @placeholder=\"Ciudad o aeropuerto\" and @aria-label=\"Destino\"]");
    By btnBuscar = By.xpath("//form[@aria-label='Vuelos']//button[@aria-label='Buscar']");


    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }

    public void navegarAHoteles(){
        click(esperaExplicita(btnHoteles, 10));
    }
    public void aceptarCookie() {
        WebElement cookie = esperaExplicita(aceptarCookie, 10);
        Assertions.assertTrue(cookie.isDisplayed(), "no disponible");
        esperarXSegundos(3000);
        click(aceptarCookie);
    }
    public void formVuelos(){
        click(vuelos);
        esperarCargaCompleta();
        WebElement ida = esperaExplicita(btnIda, 10);
        Assertions.assertTrue(ida.isDisplayed(), "no disponible");
        click(btnIda);
        esperarXSegundos(4000);
        write("Buenos Aires (BUE) ", origen);
        esperaExplicita(destino,10);
        click(destino);
        write("Cancun", destino);
        esperarXSegundos(2000);
        esperaExplicita(btnBuscar,10);
        click(btnBuscar);
    }




}



