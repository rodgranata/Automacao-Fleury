package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import suporte.Generator;
import suporte.Screenshot;

import static org.junit.Assert.assertEquals;

public class PrimeiraUnidadePage extends BasePages{
    public PrimeiraUnidadePage(WebDriver navegador) {
        super(navegador);
    }

    public PrimeiraUnidadePage validarTitulo(){
        WebElement validarTitulo = navegador.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[2]/div")).findElement(By.tagName("h1"));
        String titulo = validarTitulo.getText();
        assertEquals(titulo,"República do Líbano I");

        //Evidência final da execução
        String screenshotArquivo = "C:\\Users\\tatia\\IdeaProjects\\Fleury\\TestReport\\" + Generator.datahoraParaArquivo() + "ResultadoExecução.png";
        Screenshot.print(navegador,screenshotArquivo);

        return this;
    }
}
