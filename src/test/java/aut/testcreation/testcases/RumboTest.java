package aut.testcreation.testcases;

import aut.testcreation.pages.AlojamientosFrancia;
import aut.testcreation.pages.HotelesPage;
import aut.testcreation.pages.RumboHomePage;
import aut.testcreation.pages.VuelosPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

public class RumboTest extends SeleniumTestBase {

    RumboHomePage rumboHomePage;
    HotelesPage hotelesPage;
    AlojamientosFrancia alojamientoFrancia;
    VuelosPage vuelosPage;



    @Test
    public void rumboHome(){
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        alojamientoFrancia = new AlojamientosFrancia(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.esperarXSegundos(4000);
        rumboHomePage.aceptarCookie();
        rumboHomePage.navegarAHoteles();
        hotelesPage.completarAlojamiento("Paris Orly");
        hotelesPage.completarFecha();
        hotelesPage.completarCantPersonas();
        hotelesPage.btnBuscar();
        hotelesPage.irAHotel();
        alojamientoFrancia.alojamientoHotel();
    }

    @Test
    public void filtroEstrellas(){
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        alojamientoFrancia = new AlojamientosFrancia(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.esperarXSegundos(4000);
        rumboHomePage.aceptarCookie();
        rumboHomePage.navegarAHoteles();
        hotelesPage.completarAlojamiento("Paris Orly");
        hotelesPage.completarFecha();
        hotelesPage.btnBuscar();
        alojamientoFrancia.estrellas();
    }

    @Test
    public void calendario(){
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        alojamientoFrancia = new AlojamientosFrancia(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.esperarXSegundos(4000);
        rumboHomePage.aceptarCookie();
        rumboHomePage.navegarAHoteles();
        hotelesPage.completarAlojamiento("Paris Orly");
        hotelesPage.completarFechaSuperior();
    }

    @Test
    public void camposVacios(){
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        alojamientoFrancia = new AlojamientosFrancia(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.esperarXSegundos(4000);
        rumboHomePage.aceptarCookie();
        rumboHomePage.navegarAHoteles();
        hotelesPage.completarAlojamientoMallorca("Mallorca");
        hotelesPage.completarFecha();
        hotelesPage.completarCantPersonas();
        hotelesPage.btnBuscar();
        hotelesPage.buscarHotelMallorca();
        alojamientoFrancia.irReserva();
        alojamientoFrancia.btnResrvar();
    }

    @Test
    public void aplicarFiltros(){
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        alojamientoFrancia = new AlojamientosFrancia(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.esperarXSegundos(4000);
        rumboHomePage.aceptarCookie();
        rumboHomePage.navegarAHoteles();
        hotelesPage.completarAlojamientoMallorca("Mallorca");
        hotelesPage.completarFecha();
        hotelesPage.btnBuscar();
        alojamientoFrancia.filtros();
    }

    @Test
    public void eliminarFiltrosAgregados(){
        hotelesPage = new HotelesPage(DriverFactory.getDriver());
        rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
        alojamientoFrancia = new AlojamientosFrancia(DriverFactory.getDriver());
        rumboHomePage.navegarAlHome();
        rumboHomePage.esperarXSegundos(4000);
        rumboHomePage.aceptarCookie();
        rumboHomePage.navegarAHoteles();
        hotelesPage.completarAlojamientoMallorca("Mallorca");
        hotelesPage.completarFecha();
        hotelesPage.btnBuscar();
        alojamientoFrancia.filtros();
        alojamientoFrancia.eliminarFiltros();
    }

   @Test
    public void vuelosBaratos () {
       rumboHomePage = new RumboHomePage(DriverFactory.getDriver());
       vuelosPage = new VuelosPage(DriverFactory.getDriver());
       rumboHomePage.navegarAlHome();
       rumboHomePage.esperarXSegundos(4000);
       rumboHomePage.aceptarCookie();
       rumboHomePage.formVuelos();
       vuelosPage.vuelosBaratos();
   }



}
