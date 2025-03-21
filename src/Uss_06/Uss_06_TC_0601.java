package Uss_06;

import Uss_05.BaseDriver.BaseDriver;
import Uss_05.BaseDriver.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Uss_06_TC_0601 extends BaseDriver {
    @Test
    public void Test1(){
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

        WebElement Mesajlarim= driver.findElement(By.xpath("//*[text()='Mesajlarım']"));
        Mesajlarim.click();
        MyFunc.Bekle(1);

        WebElement Mesajbulunamadi= driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue("Bir islem hatasi olustu!!!", Mesajbulunamadi.getText().contains("Listelenecek mesaj bulunamadı."));

        BekleKapat();
    }
}
