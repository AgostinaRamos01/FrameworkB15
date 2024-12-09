package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePage extends SeleniumWrapper {

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    By aceptarCookie= By.xpath("//button[@class=\"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");
    By btnVerMas=By.xpath("//div[@role=\"button\"] ");
    By btnPageTrenes=By.xpath("//a[@title=\"Trenes\"] ");
    //methods
    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }

    public void buscarFormTrenes(){
        click(esperaExplicita(aceptarCookie,60));
    }
    public void verMas(){
        click(esperaExplicita(btnVerMas,60));
    }
    public void irPageTrenes(){
        click(esperaExplicita(btnPageTrenes,60));
    }

}

