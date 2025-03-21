package Uss_07;

import Uss_05.BaseDriver.BaseDriver;
import Uss_05.BaseDriver.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Uss_07_TC_0702 extends BaseDriver {
    @Test
    public void US_07_TC_0702() {
        driver.get("https://www.akakce.com/");

        WebElement GirisYap= driver.findElement(By.cssSelector("div[id='H_rl_v8'] a+a"));
        GirisYap.click();

        WebElement Eposta= driver.findElement(By.cssSelector("div[id='L_h_v8']> :nth-child(2)> :nth-child(4) input"));
        Eposta.sendKeys("erdemmozkann@hotmail.com");

        WebElement Sifre=driver.findElement(By.cssSelector("div[id='L_h_v8']> :nth-child(2)> :nth-child(6) input"));
        Sifre.sendKeys("Password123");
        MyFunc.Bekle(1);

        WebElement GirisYap2= driver.findElement(By.cssSelector("span[class='checkbox-wrapper']+label+a+input"));
        GirisYap2.click();

        WebElement hesabim= driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));
        hesabim.click();
        MyFunc.Bekle(1);

        WebElement hesabimiSil= driver.findElement(By.xpath("//ul[@id='AL']/li[4]/a[4]"));
        hesabimiSil.click();

        WebElement HesapSilmeSifresi = driver.findElement(By.xpath("//div[@id='content']/form/span/label/following-sibling::input"));
        HesapSilmeSifresi.sendKeys("Password123");

        WebElement hesabimisil2= driver.findElement(By.xpath("//*[@id='content']/form/span/following-sibling::span/input"));
        hesabimisil2.click();

        MyFunc.Bekle(2);

        WebElement hesapsilindi= driver.findElement(By.xpath("//*[text()='Hesabın silindi.']"));
        Assert.assertTrue("Bir islem hatasi olustu!!!", hesapsilindi.getText().contains("Hesabın silindi."));

        BekleKapat();
    }
}
