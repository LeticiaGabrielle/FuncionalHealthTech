package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ValidarPage {
    private WebDriver driver;

    public ValidarPage(WebDriver driver) {
        this.driver = driver;
    }

    public LinkPage validoODirecionamentoCorretoParaOLinkEmpresa() {

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1600)");

        driver.findElement(By.xpath("//*[@id=\"post-2\"]/div/div/div[7]/h2"));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"post-2\"]/div/div/div[7]/h2")).getText(), "missão");
        System.out.println("\n\nAcesso link de mais informações da empresa Funcional Health Tech com sucesso.");

        return new LinkPage(driver);
    }
}

