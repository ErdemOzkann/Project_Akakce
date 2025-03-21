package Uss_02;

import Uss_02.Utility.BaseDriver;
import Uss_02.Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_0201 extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
        WebElement girisYap = driver.findElement(By.cssSelector("div[id='H_rl_v8'] [href='/akakcem/giris/']"));
        girisYap.click();
        MyFunc.Bekle(2);
        WebElement ePosta = driver.findElement(By.id("life"));
        ePosta.sendKeys(new CharSequence[]{"erdemmozkann@hotmail.com"});
        MyFunc.Bekle(2);
        WebElement sifre = driver.findElement(By.id("lifp"));
        sifre.sendKeys(new CharSequence[]{"Password123"});
        MyFunc.Bekle(2);
        WebElement girisYapButtonu = driver.findElement(By.cssSelector("a[class='fp']+input"));
        girisYapButtonu.click();
        MyFunc.Bekle(2);
        WebElement kullaniciadi = driver.findElement(By.cssSelector("div[id='HM_v8']> :nth-child(1) a"));
        System.out.println("Kullanici adi = " + kullaniciadi.getText());
        Assert.assertTrue("Aranan mesaj bulanamadi", kullaniciadi.getText().contains("TestUser"));
        BekleKapat();
    }

}
