package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;


import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AlojamientosFrancia extends SeleniumWrapper {
    By servicio = By.xpath("//a[@href='#facilities']");
    By byVerServicio = By.xpath("//a[contains(text(), 'Ver más')]");
    By estrellas = By.xpath("//div[@id='Pill-StarsContainer']");
    By check = By.id("exp_elem_hotel_stars_2");
    By btnAplicar = By.xpath("//button[text()='Aplicar']");
    By btnReservar = By.xpath("//div[@data-testid='price-info'][@data-price='regular']");
    By btnContinuar = By.xpath("(//button//span[text()='Continuar'])[1]");
    By btnFinal= By.xpath("//button[@data-test='submit-button']");
    By bytipoAlojamiento = By.xpath("//div[@id='Pill-PropertyTypeContainer']");
    By checkta= By.xpath("//div[contains(text(),'Apartahotel')]");
    By byValoracion= By.xpath("//div[@id='Pill-RatingContainer']");
    By checkv= By.xpath("//div[@class='sc-1b2442ad-0 bWcmLW filter-rating-label-verygood']");
    By byregimen = By.xpath("//div[@id='Pill-MealContainer']");
    By checkre= By.xpath("//li[.//div[contains(text(),'Solo alojamiento')]]");
    By byserv= By.xpath("//div[@id='Pill-FacilitiesContainer']");
    By checkserv = By.xpath("//div[@class='listbox-label' and text()='Mascotas']");
    By bytodosLosFiltros = By.xpath("//div[@id='Pill-AllFiltersContainer']");
    By btnEliminar = By.xpath("//div[text()='Eliminar todo']");

    private org.openqa.selenium.support.ui.ExpectedConditions ExpectedConditions;

    public AlojamientosFrancia(WebDriver driver) {
        super(driver);
    }

    public void alojamientoHotel () {
        Set<String> allWindowHandles = driver.getWindowHandles();
        String[] windowHandles = allWindowHandles.toArray(new String[0]);
        driver.switchTo().window(windowHandles[windowHandles.length - 1]);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement irServicios = esperaExplicita(servicio, 10);
        Assertions.assertTrue(irServicios.isDisplayed(), "no disponible");
        esperarXSegundos(5000);
        click(servicio);
        esperarXSegundos(2000);
        click(byVerServicio);
    }
    public void estrellas(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement abrirEstrellas = esperaExplicita(estrellas, 10);
        Assertions.assertTrue(abrirEstrellas.isDisplayed(), "no disponible");
        esperarXSegundos(5000);
        click(estrellas);

        esperarXSegundos(2000);
        click(check);
        esperarXSegundos(2000);
        click(btnAplicar);
    }
    public void irReserva(){
        Set<String> allWindowHandles = driver.getWindowHandles();
        String[] windowHandles = allWindowHandles.toArray(new String[0]);
        driver.switchTo().window(windowHandles[windowHandles.length - 1]);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl());
        esperarXSegundos(3000);
        WebElement reservar = esperaExplicita(btnReservar, 10);
        Assertions.assertTrue(reservar.isDisplayed(), "no disponible");
        click(btnReservar);
        esperarXSegundos(2000);
        click(btnContinuar);
    }
    public void btnResrvar(){
        Set<String> allWindowHandles = driver.getWindowHandles();
        String[] windowHandles = allWindowHandles.toArray(new String[0]);
        driver.switchTo().window(windowHandles[windowHandles.length - 1]);
        scrollDown();
        esperaExplicita(btnFinal,10);
        click(btnFinal);
    }

    public void filtros(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement tipoAlojamiento = esperaExplicita(bytipoAlojamiento, 10);
        Assertions.assertTrue(tipoAlojamiento.isDisplayed(), "no disponible");
        esperarXSegundos(5000);
        click(bytipoAlojamiento);
        esperarXSegundos(2000);
        click(checkta);
        esperarXSegundos(2000);
        click(btnAplicar);

        esperaExplicita(byValoracion,10);
        click(byValoracion);
        esperaExplicita(checkv,10);
        click(checkv);
        esperarXSegundos(2000);
        click(btnAplicar);

        esperaExplicita(byregimen,10);
        click(byregimen);
        esperaExplicita(checkre,10);
        click(checkre);
        esperarXSegundos(2000);
        click(btnAplicar);

        esperaExplicita(byserv,10);
        click(byserv);
        esperaExplicita(checkserv,10);
        click(checkserv);
        esperarXSegundos(2000);
        click(btnAplicar);
    }
    public void eliminarFiltros(){
        WebElement eliminar = esperaExplicita(bytodosLosFiltros, 10);
        Assertions.assertTrue(eliminar.isDisplayed(), "no disponible");
        click(bytodosLosFiltros);

        esperarXSegundos(2000);
        click(btnEliminar);

    }

}








