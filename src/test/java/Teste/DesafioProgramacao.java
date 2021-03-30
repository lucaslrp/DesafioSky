package Teste;

import Web.Web;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.PagInfoProgramacao;
import pages.PagProgramacao;
import pages.PopUpPadrao;

public class DesafioProgramacao {

    private WebDriver navegador;

    @Before
    public void iniciar(){
        navegador = Web.abrirNavegador();
    }

    @Test
    public void desafioTitulo(){

        String tituloNaProgramacao = new PopUpPadrao(navegador).fecharPopUpInicial()
                .abrirProgramacao()
                .nomeNaProgramacao();
        String tituloModal = new PagProgramacao(navegador)
                .abrirInfoDoPrograma()
                .nomeNoModal();
        Assert.assertArrayEquals(new String[]{tituloModal}, new String[]{tituloNaProgramacao});

    }

    @Test
    public void desafioHora() {

        String horaProgramacao = new PopUpPadrao(navegador).fecharPopUpInicial()
                .abrirProgramacao()
                .horaNaProgramacao();
        String horaModal = new PagProgramacao(navegador)
                .abrirInfoDoPrograma()
                .horaNoModal();
        Assert.assertArrayEquals(new String[]{horaModal}, new String[]{horaProgramacao});

    }

    //@After
    public void tearDown(){
        navegador.quit();
    }

}
