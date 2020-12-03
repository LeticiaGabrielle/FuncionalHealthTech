package steps;

import config.AcessarSite;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LinkPage;
import pages.ValidarPage;

public class FuncionalTechSteps {

    public static WebDriver driver;

    @Dado("Que acesso o site da Funcional Health Tech")
    public void queAcessoOSiteDaFuncionalHealthTech() {
        AcessarSite acessarSite = new AcessarSite();
        // para utilizar o navegador chrome usar "chrome"
        // para utilizar o navegador mozila firefox usar "firefox"
        driver = acessarSite.queAcessoOSiteDaFuncionalHealthTech("chrome");
    }

    @Quando("Clico no link empresa")
    public void clicoNoLinkEmpresa() {
        LinkPage clicarLink = new LinkPage(driver);
        clicarLink.clicoNoLinkEmpresa();
    }

    @Então("Valido o direcionamento correto para o link empresa.")
    public void validoODirecionamentoCorretoParaOLinkEmpresa() {
        ValidarPage validarPage = new ValidarPage(driver);
        validarPage.validoODirecionamentoCorretoParaOLinkEmpresa();
    }
}