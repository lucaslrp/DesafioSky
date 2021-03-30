package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagPrincipal {
    protected WebDriver navegador;

    public PagPrincipal(WebDriver navegador) {
        this.navegador = navegador;
    }

    public PagProgramacao abrirProgramacao(){
        navegador.findElement(By.linkText("Programação")).click();
        return new PagProgramacao (navegador);
    }
}