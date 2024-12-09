package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePage extends SeleniumWrapper {
    By aceptarCookie= By.xpath("//button[@class=\"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");
    By btnHoteles = By.xpath("//a[@href='https://www.rumbo.es/hoteles']");

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
        click(aceptarCookie);
    }

}



