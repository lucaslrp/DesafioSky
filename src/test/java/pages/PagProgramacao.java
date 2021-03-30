package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagProgramacao extends PagPrincipal{
    public PagProgramacao(WebDriver navegador) {
        super(navegador);
    }

    public String nomeNaProgramacao(){
        return navegador.findElement(By.xpath("//*[@id=\"schedules-container\"]/div[4]/div[3]/div/div/div[1]/div[2]/div/div/div/div[6]/div/div[1]/h2")).getText();
   }

    public String horaNaProgramacao() {
        return navegador.findElement(By.xpath("//*[@id=\"schedules-container\"]/div[4]/div[3]/div/div/div[1]/div[2]/div/div/div/div[6]/div/div[1]/div[2]/div[1]")).getText();
    }

    public PagInfoProgramacao abrirInfoDoPrograma(){
        navegador.findElement(By.xpath("//*[@id=\"schedules-container\"]/div[4]/div[3]/div/div/div[1]/div[2]/div/div/div/div[6]/div/div[1]/div[1]")).click();
        return new PagInfoProgramacao(navegador);
    }
}
