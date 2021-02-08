package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.InicialPage;
import suporte.Web;

public class RefactoryValidarNomedaUnidade {
    public WebDriver navegador;

    @Before
    public void setUp(){
        //Chamada da class Web para abrir o Chrome e navegar pelo site Fleury
        navegador = Web.createBrowserStack();
    }

    @Test
    public void testValidarNomeUnidade(){
        new InicialPage(navegador)
                .clickUnidades()
                .clickContinuar()
                .clickCombo()
                .selectAtendimento()
                .selectBicicletario()
                .clickVerDetalhe()
                .validarTitulo();
    }

    @After
    public void tearDown(){
        //Fechar navegador
        navegador.quit();
    }
}
