package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VuelosPage extends SeleniumWrapper {
    By btnBarato = By.xpath("//button[@data-value=\"price.asc\"]");
    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    public void vuelosBaratos (){
        esperarXSegundos(5000);

        esperaExplicita(btnBarato,10);
        click(btnBarato);
    }
}
