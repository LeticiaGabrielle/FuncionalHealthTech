package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPage {
    public WebDriver driver;

    public LinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public LinkPage clicoNoLinkEmpresa() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/nav/div/div/ul/li[1]/a")).click();

        return new LinkPage(driver);
    }

}