package Uss_05;

import Uss_05.BaseDriver.BaseDriver;
import Uss_05.BaseDriver.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Uss_05_TC_0501 extends BaseDriver {

    @Test
    public void US_05_TC_0501(){
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

        WebElement siparislerim= driver.findElement(By.xpath("//ul[@id='AL']/li/a"));
        siparislerim.click();
        MyFunc.Bekle(1);

        WebElement siparisYok= driver.findElement(By.xpath("//div[@class='cwbb_v8']/div"));
        Assert.assertTrue("Bir islem hatasi olustu!!!", siparisYok.getText().contains("Kayıtlı siparişiniz bulunmuyor."));

        BekleKapat();

    }
}
