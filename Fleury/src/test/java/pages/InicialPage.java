package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class InicialPage extends BasePages {

    public InicialPage(WebDriver navegador) {
        super(navegador);
    }
    //Clicar no elemento Unidade
    public UnidadePage clickUnidades(){
        navegador.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div")).findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div/div/div[16]")).click();

        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return new UnidadePage(navegador);
    }
}
