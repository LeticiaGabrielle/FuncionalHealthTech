package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AcessarSite {

    public static WebDriver queAcessoOSiteDaFuncionalHealthTech(String navegador) {
        switch (navegador) {
            case "chrome":
                return queAcessoOSiteDaFuncionalHealthTechChrome();
            case "firefox":
                return queAcessoOSiteDaFuncionalHealthTechFirefox();
            default:
                return queAcessoOSiteDaFuncionalHealthTechChrome();
        }
    }

    private static WebDriver queAcessoOSiteDaFuncionalHealthTechFirefox() {

        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.funcionalcorp.com.br/");
        firefox.manage().window().maximize();
        firefox.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return firefox;

    }

    private static WebDriver queAcessoOSiteDaFuncionalHealthTechChrome() {
        WebDriver chrome = new ChromeDriver();
        System.setProperty("webdriver.chrome.chrome", "chromedriver.exe");
        chrome.get("https://www.funcionalcorp.com.br/");
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return chrome;
    }
}



