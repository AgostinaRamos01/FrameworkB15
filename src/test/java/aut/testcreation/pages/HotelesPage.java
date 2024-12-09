package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HotelesPage extends SeleniumWrapper {
    By bytxtAlojamiento = By.xpath("//input[@aria-label=\"Buscar alojamiento en\"]");
    By fecha = By.xpath("//button[@aria-label='¿Cuándo?']");
    By byfechaIni = By.xpath("//div[@aria-labelledby='11-2024']//button[text()='15']");
    By byfechaSalida = By.xpath("//div[@aria-labelledby='11-2024']//button[text()='25']");
    By bypersonas = By.xpath("//span[text()='Personas']");
    By agregarPersonas= By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By buscar = By.xpath("//form[@aria-label='Hoteles']//button[@aria-label='Buscar']");

    By hotel = By.xpath("//div[contains(text(), 'La Maison Du Coteau')]");
    By byservicio = By.xpath("//span[contains(text(), 'Ver todos los servicios')]");
    By byVerServicio = By.xpath("//a[contains(text(), 'Ver más')]");

    By byfechaSupIni = By.xpath("//div[@aria-labelledby='11-2024']//button[text()='13']");
    By byfechaSupSalida = By.xpath("//div[@aria-labelledby='0-2025']//button[text()='15']");
    By byhotelMallorca = By.xpath("//div[text()='Iberostar Waves Cristina']");



    public HotelesPage(WebDriver driver) {
        super(driver);
    }


    public void completarAlojamiento(String alojamiento) {
        click(bytxtAlojamiento);
        esperarXSegundos(3000);
        write("Paris Orly", bytxtAlojamiento);
        esperarXSegundos(2000);
        //  write(String.valueOf(Keys.RETURN),bytxtAlojamiento);
    }
    public void completarFecha(){
            WebElement calendario = esperaExplicita(fecha, 10);
            Assertions.assertTrue(calendario.isDisplayed(), "no disponible");

            click(fecha);

            esperarXSegundos(2000);

            WebElement fechaIni = findElement(byfechaIni);
            click(fechaIni);

            esperarXSegundos(2000);

            WebElement fechaSalida = findElement(byfechaSalida);
            click(fechaSalida);
    }
    public void completarCantPersonas(){
        WebElement personas = esperaExplicita(bypersonas, 10);
        Assertions.assertTrue(personas.isDisplayed(), "no disponible");

       // click(bypersonas);
        esperarXSegundos(4000);

        WebElement agregar = esperaExplicita(agregarPersonas,10);
        click(agregarPersonas);
    }
    public void btnBuscar(){
        WebElement btnBuscar = esperaExplicita(buscar,10);
        Assertions.assertTrue(btnBuscar.isDisplayed(), "no disponible");

        click(btnBuscar);
    }
    public void irAHotel (){
        WebElement irHotel = esperaExplicita(hotel, 10);
        Assertions.assertTrue(irHotel.isDisplayed(), "no disponible");
        esperarXSegundos(5000);
        click(hotel);
    }
    public void completarFechaSuperior(){
        WebElement calendario = esperaExplicita(fecha, 10);
        Assertions.assertTrue(calendario.isDisplayed(), "no disponible");

        click(fecha);

        esperarXSegundos(2000);

        WebElement inicio = findElement(byfechaSupIni);
        click(inicio);

        esperarXSegundos(2000);

        WebElement salida = findElement(byfechaSupSalida);
        click(salida);
    }

    public void completarAlojamientoMallorca(String alojamiento) {
        click(bytxtAlojamiento);
        esperarXSegundos(3000);
        write("Mallorca", bytxtAlojamiento);
        esperarXSegundos(2000);
    }
    public void buscarHotelMallorca(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement hotelMallorca = esperaExplicita(byhotelMallorca, 10);
        Assertions.assertTrue(hotelMallorca.isDisplayed(), "no disponible");
        esperarXSegundos(5000);
        click(byhotelMallorca);
    }


}


