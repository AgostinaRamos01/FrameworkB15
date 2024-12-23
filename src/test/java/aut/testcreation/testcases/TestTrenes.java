package aut.testcreation.testcases;

import aut.testcreation.pages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class TestTrenes extends SeleniumTestBase{
    TrenesPage trenesPage;

    @Test
    void IDCP001(){
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        trenesPage.navegarAlHome();
        trenesPage.buscarFormTrenes2();
        trenesPage.verMas();
        trenesPage.irPageTrenes();
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
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        trenesPage.navegarAlHome();
        trenesPage.buscarFormTrenes2();
        trenesPage.verMas();
        trenesPage.irPageTrenes();
        trenesPage.campoOrigen("A Coruña");
        trenesPage.campoDestino("Barcelona");
        trenesPage.btnBuscar();
        trenesPage.textMessage("No hemos encontrado ningún resultado con tus criterios de búsqueda.");

    }
    @Test
    void IDCP003(){
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        trenesPage.navegarAlHome();
        trenesPage.buscarFormTrenes2();
        trenesPage.verMas();
        trenesPage.irPageTrenes();
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
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        trenesPage.navegarAlHome();
        trenesPage.buscarFormTrenes2();
        trenesPage.verMas();
        trenesPage.irPageTrenes();
        trenesPage.campoOrigen("Burgos");
        trenesPage.campoDestino("Madrid");
        trenesPage.btnBuscar();
        trenesPage.clickResultadoBusqueda(); // metedo para acceder al primer resultado
        trenesPage.clickBtnSelect();
        trenesPage.campoDatosPersonales("Juan","Villegas");
        trenesPage.scrollDownmiddle();
        trenesPage.specialAssist2();
        trenesPage.scrollUp();
        trenesPage.campoDatosPersonalesDelete("Roberto","Quinteros");
        trenesPage.textnombreassist("Roberto","Quinteros");
    }

    @Test
    void IDCP005(){
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        trenesPage.navegarAlHome();
        trenesPage.buscarFormTrenes2();
        trenesPage.verMas();
        trenesPage.irPageTrenes();
        trenesPage.campoOrigen("Burgos");
        trenesPage.campoDestino("Madrid");
        trenesPage.btnBuscar();
        trenesPage.clickResultadoBusqueda(); // metedo para acceder al primer resultado
        trenesPage.clickBtnSelect();
        trenesPage.detallesFiltro("Burgos - Madrid");

    }

    @Test
    void IDCP006(){
        trenesPage    = new TrenesPage(DriverFactory.getDriver());
        trenesPage.navegarAlHome();
        trenesPage.buscarFormTrenes2();
        trenesPage.verMas();
        trenesPage.irPageTrenes();
        trenesPage.campoOrigen("Burgos");
        trenesPage.campoDestino("Madrid");
        trenesPage.btnBuscar();
        trenesPage.clickResultadoBusqueda(); // metedo para acceder al primer resultado
        trenesPage.desglosePrecioIgual();
    }
}

