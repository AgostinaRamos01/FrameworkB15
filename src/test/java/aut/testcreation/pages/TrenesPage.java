package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapperTrenes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TrenesPage extends SeleniumWrapperTrenes {
    public TrenesPage(WebDriver driver) {super(driver);   }

    //localizadores
    By aceptarCookie= By.xpath("//button[@class=\"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");
    By btnVerMas=By.xpath("//div[@role=\"button\"] ");
    By btnPageTrenes=By.xpath("//a[@title=\"Trenes\"] ");
    By campoOrigen=By.xpath("(//input[@placeholder=\"Origen\"])[1]");
    By campoDestino=By.xpath("(//input[@placeholder=\"Destino\"])[1]");
    By btnBuscar=By.xpath("//button[@aria-label=\"Buscar\"] ");
    By message2 = By.xpath("//div[@class=\"Container__StyledContainer-sc-sb5e2u-0 ePfMk NoResultsPanel__Title-sc-148mow5-2 hzUUWC\"]");
    By primerResult= By.xpath("(//div[@class=\"FullTransportWay__LogoColumn-sc-acha5w-2 dvcNHA\"])[1]");
    By btnSeleccionar= By.xpath("//button[@class=\"Button__LmnDsButton-sc-1bbve8d-0 bsmtZs\"]  ");
    By campoNombre= By.xpath("//input[@name=\"name\"] ");
    By campoApellido= By.xpath("//input[@name=\"surname\"] ");
    By campoDiaSolo=By.xpath("(//span[@class=\"FormFieldstyles__LabelText-sc-1pt5zgp-0 hAXCiV\"])[8]");
    By campoDia2=By.xpath("(//input[@name=\"groups.1.travellers.1.dateOfBirth\"])[1]");
    By campoMesSolo=By.xpath("(//span[@class=\"FormFieldstyles__ValueWrapper-sc-1pt5zgp-4 Selectstyles__ValueWrapper-sc-d5yk3i-3 bNeTrq gnUxND\"])[2]");
    By campoMes=By.xpath("(//span[@class=\"MenuItemstyles__Label-sc-fguzn7-1 eALBLu\"])[1]");
    By campoañoSolo=By.xpath("(//span[@class=\"FormFieldstyles__ValueWrapper-sc-1pt5zgp-4 bNeTrq\"])[8]");
    By campoAño2= By.xpath("(//input[@name=\"groups.1.travellers.1.dateOfBirth\"])[2]");
    By btnSpecialAssist= By.xpath("//button[@id=\"special-assistance-checkbox\"]");
    By selectAssist=By.xpath("//select[@class=\"form-control select-input\"]");
    By selectAssistMovility=By.xpath("(//option[@data-test=\"special-request-structured-types-option\"])[2]");
    By selectDelete=By.xpath("//button[@class=\"Link__StyledLink-sc-y3byev-0 hJcxKT Link__BaseLinkButton-sc-y3byev-1 gvrLHZ\"]");
    By btnDetalles=By.xpath("//button[@class=\"Link__StyledLink-sc-y3byev-0 qajdq Link__BaseLinkButton-sc-y3byev-1 gvrLHZ sc-fYrVWQ ewNYBu\"]");
    By filtrosDetalle= By.xpath("(//div[@class=\"JourneyDetailsWayIntro__WayIntroSmallText-sc-7wt6gl-3 bYZjhX\"])[1]");


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

    public void campoOrigen(String origen){
        click(esperaExplicita(campoOrigen,60));
         write(origen,campoOrigen);
         sendKeys(Keys.ENTER,campoOrigen);
        esperarXSegundos(3000);

    }
    public void campoDestino(String destino){
        click(esperaExplicita(campoDestino,60));
        write(destino,campoDestino);
        sendKeys(Keys.ENTER,campoDestino);
        esperarXSegundos(3000);
    }

    public void btnBuscar(){
        click(esperaExplicita(btnBuscar,60));
        esperarXSegundos(2000);
    }

    public void textMessage(String text){
        esperaExplicita(message2,60);
        Assertions.assertEquals(text,getText(message2));
    }


    public void clickResultadoBusqueda(){
        click(esperaExplicita(primerResult,60));
    }

    public void clickBtnSelect(){
        click(esperaExplicita(btnSeleccionar,60));
    }
    public void campoDatosPersonales(String nombre,String apellido){
        click(esperaExplicita(campoNombre,60));
        write(nombre,campoNombre);
        click(esperaExplicita(campoApellido,60));
        write(apellido,campoApellido);
    }


    public void campoDatosPersonalesDelete(){
        click(esperaExplicita(campoNombre,60));
        sendKeys(Keys.DELETE,campoNombre);
        click(esperaExplicita(campoApellido,60));
        sendKeys(Keys.DELETE,campoApellido);
    }

    public void rellenarFechaNac(){
        click(esperaExplicita(campoDiaSolo,60));
        click(esperaExplicita(campoDia2,60));
        write("1",campoDia2);
        click(esperaExplicita(campoMesSolo,60));
        click(esperaExplicita(campoMes,60));
        click(esperaExplicita(campoañoSolo,60));
        write("1873",campoAño2);
        esperarXSegundos(5000);

    }
    public void specialAssist0(){
        click(esperaExplicita(btnSpecialAssist,60));
        click(esperaExplicita(selectAssist,60));
        click(esperaExplicita(selectAssistMovility,60));
    }

    public void specialAssist(){
        click(esperaExplicita(btnSpecialAssist,60));
        click(esperaExplicita(selectAssist,60));
        click(esperaExplicita(selectAssistMovility,60));
        click(esperaExplicita(selectDelete,60));
    }
    public void specialAssist2(){
        click(esperaExplicita(btnSpecialAssist,60));
        click(esperaExplicita(selectAssist,60));
        click(esperaExplicita(selectAssistMovility,60));
    }

    public void detallesFiltro(String text){
        click(esperaExplicita(btnDetalles,10));
        esperaExplicita(filtrosDetalle,60);
        Assertions.assertEquals(text,getText(filtrosDetalle));
        esperarXSegundos(4000);
    }
}
