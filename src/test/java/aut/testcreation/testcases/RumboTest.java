package aut.testcreation.testcases;

import aut.testcreation.pages.RumboHomePage;
import aut.testcreation.pages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class RumboTest extends SeleniumTestBase {
   // RumboHomePage googleHomePage;//
    RumboHomePage rumboHomePage;
    TrenesPage trenesPage;

    @Test
    void IDCP001(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.buscarFormTrenes();
        rumboHomePage.verMas();
        rumboHomePage.irPageTrenes();
        trenesPage.campoOrigen("Burgos");
        trenesPage.campoDestino("Madrid");
        trenesPage.btnBuscar();
        trenesPage.clickResultadoBusqueda(); // metedo para acceder al primer resultado
        trenesPage.clickBtnSelect();
        trenesPage.campoDatosPersonales("Pedro","Herrera");
        trenesPage.scrollDown();
        trenesPage.rellenarFechaNac();
    }
    @Test
    void IDCP002(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.buscarFormTrenes();
        rumboHomePage.verMas();
        rumboHomePage.irPageTrenes();
        trenesPage.campoOrigen("A Coruña");
        trenesPage.campoDestino("Barcelona");
        trenesPage.btnBuscar();
        trenesPage.textMessage("No hemos encontrado ningún resultado con tus criterios de búsqueda.");

    }
    @Test
    void IDCP003(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.buscarFormTrenes();
        rumboHomePage.verMas();
        rumboHomePage.irPageTrenes();
        trenesPage.campoOrigen("Burgos");
        trenesPage.campoDestino("Madrid");
        trenesPage.btnBuscar();
        trenesPage.clickResultadoBusqueda(); // metedo para acceder al primer resultado
        trenesPage.clickBtnSelect();
        trenesPage.scrollDownmiddle();
        trenesPage.specialAssist();
    }

    @Test
    void IDCP004(){
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.buscarFormTrenes();
        rumboHomePage.verMas();
        rumboHomePage.irPageTrenes();
        trenesPage.campoOrigen("Burgos");
        trenesPage.campoDestino("Madrid");
        trenesPage.btnBuscar();
        trenesPage.clickResultadoBusqueda(); // metedo para acceder al primer resultado
        trenesPage.clickBtnSelect();
        trenesPage.campoDatosPersonales("Juan","Villegas");
        trenesPage.scrollDownmiddle();
        trenesPage.specialAssist2();
        trenesPage.scrollUp();
        trenesPage.campoDatosPersonales("Roberto","Quinteros");
        trenesPage.scrollDownmiddle();










    }

}
