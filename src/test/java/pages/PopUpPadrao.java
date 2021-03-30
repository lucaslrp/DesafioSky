package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpPadrao extends PagPrincipal {

    public PopUpPadrao(WebDriver navegador) {
        super(navegador);
    }
    public PagPrincipal fecharPopUpInicial(){
        navegador.findElement(By.xpath("//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_YQcCxObpxg0J\"]/div/div[2]/div/div[2]/div/div/div/div[1]/button/span")).click();
        return new PagPrincipal(navegador);
    }
}

