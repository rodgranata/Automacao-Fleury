package suporte;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Classe para otimazar o código e não ter que repetir os passos abaixo em todos os testes.
public class Web {
    public static final String AUTOMATE_USERNAME = "rodrigogranata1";
    public static final String AUTOMATE_ACCESS_KEY = "91xBySqLvtnX163Kphyk";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver createBrowserStack(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1366x768");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "testValidarNomeUnidade");
        caps.setCapability("build", "BStack Build Number 1");

        WebDriver navegador = null;

        try {
            navegador = new RemoteWebDriver(new URL(URL), caps);

            navegador.manage().window().maximize();

            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            navegador.get("https://www.fleury.com.br/");

        } catch (MalformedURLException e) {
            System.out.println("Houveram problemas com a URL:" + e.getMessage());
        }

        return navegador;
    }


}
