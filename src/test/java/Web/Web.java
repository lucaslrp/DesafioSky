package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver abrirNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Chrome_Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("http://www.sky.com.br");

        return navegador;
    }
}
