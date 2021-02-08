package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UnidadePage extends BasePages{
    public UnidadePage(WebDriver navegador) {
        super(navegador);
    }
    //Clicar no botão CONTINUAR
    public UnidadePage clickContinuar(){
        navegador.findElement(By.xpath("/html/body/div[1]")).findElement(By.xpath("/html/body/div[1]/div[2]/a")).click();

        return this;
    }
    //Abrindo o combo do filtro facilidade
    public UnidadePage clickCombo(){
        navegador.findElement(By.id("checkoox-select-facilities")).click();

        return this;
    }
    //Selecionar a opção Atendimento aos domingos - Tive que selecionar dessa forma, pois a tag é um DIV e não um SELECT
    public UnidadePage selectAtendimento(){
        navegador.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[3]/div[3]/div[1]/div[2]/div")).findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[3]/div[3]/div[1]/div[2]/div/div[4]/label/div/div/div[3]/label")).click();

        return this;
    }
    //Selecionar a opção Bicicletário e vaga verde
    public UnidadePage selectBicicletario(){
        navegador.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[3]/div[3]/div[1]/div[2]/div")).findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[3]/div[3]/div[1]/div[2]/div/div[3]/label/div/div/div[3]/label")).click();

        return this;
    }
    //Clicar no Ver Detalhe da primeira unidade que aparecer
    public PrimeiraUnidadePage clickVerDetalhe(){
        navegador.findElement(By.xpath("//*[@id=\"button-see-on-map-2-republica-do-libano-i\"]/div")).click();

        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return new PrimeiraUnidadePage(navegador);
    }

}
