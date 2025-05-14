package Uss_03;

import Uss_03.Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class Uss_03_TC_0301 extends BaseDriver {

    @Test

    public void Tes1()
    {
        driver.get("https://www.akakce.com/");

        WebElement giris=driver.findElement(By.cssSelector("(//*[@rel='nofollow'])[2]"));
        giris.sendKeys("admin@admin.com");

        WebElement eposta=driver.findElement(By.cssSelector("//input[@id='life']"));
        eposta.sendKeys("erdemmozkann@hotmail.com");

        WebElement sifre=driver.findElement(By.cssSelector("//input[@id='lifp']"));
        sifre.sendKeys("Password123");

        WebElement girisyap=driver.findElement(By.cssSelector("//input[ contains(@id,'lf') ]"));
        girisyap.click();

        WebElement humansymbol=driver.findElement(By.cssSelector("(//*[@rel='nofollow'])[2]"));
        humansymbol.click();

        WebElement cik=driver.findElement(By.cssSelector("//*[text()='Çık']"));
        cik.click();

        BekleKapat();



    }


}
