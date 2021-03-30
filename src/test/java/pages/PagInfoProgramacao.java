package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagInfoProgramacao extends PagPrincipal{
    public PagInfoProgramacao(WebDriver navegador) {
        super(navegador);
    }

    public String nomeNoModal(){
        return navegador.findElement(By.xpath("//*[@id=\"modal\"]/div/div[2]/div/div/div[1]/div/div[2]/div[1]")).getText();
    }

    public String horaNoModal(){
        return navegador.findElement(By.xpath("//*[@id=\"modal\"]/div/div[2]/div/div/div[1]/div/div[2]/div[2]")).getText();
    }
}
