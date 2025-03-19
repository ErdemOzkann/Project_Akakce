package Uss_01;

import Uss_01.BaseDriver.BaseDriver;
import Uss_01.BaseDriver.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Uss_01_TC_0102 extends BaseDriver {
    @Test
    public void Uss_01_TC_0101(){

        driver.get("https://www.akakce.com/");

        WebElement hesapAc= driver.findElement(By.cssSelector("[id=H_rl_v8] :nth-child(1)"));
        hesapAc.click();

        WebElement ad= driver.findElement(By.cssSelector("[id=FrmRnuS] :nth-child(5) :nth-child(1)"));
        ad.sendKeys("TestUser");


        WebElement mailtekrar = driver.findElement(By.cssSelector("[id=FrmRnuS] :nth-child(11) :nth-child(1)"));
        mailtekrar.sendKeys("erdemmozkann@hotmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id=FrmRnuS] :nth-child(13) :nth-child(1)"));
        password.sendKeys("Password123");

        WebElement passwordrepeat = driver.findElement(By.cssSelector("[id=FrmRnuS] :nth-child(15) :nth-child(1)"));
        passwordrepeat.sendKeys("");

        WebElement gender = driver.findElement(By.cssSelector("[id=FrmRnuS] :nth-child(17) :nth-child(2) input"));
        gender.click();

        WebElement gun=driver.findElement(By.cssSelector("[class=select_h_v8] :nth-child(1) select :nth-child(11)"));
        gun.click();

        WebElement ay =driver.findElement(By.cssSelector("[class=select_h_v8] :nth-child(2) select :nth-child(11)"));
        ay.click();

        WebElement yil =driver.findElement(By.cssSelector("[class=select_h_v8] :nth-child(3) select :nth-child(18)"));
        yil.click();

        WebElement checkbox=driver.findElement(By.xpath("(//span[@class='chbx_v8']//input)[1]"));
        checkbox.click();

        WebElement hesapac =driver.findElement(By.xpath("(//*[@id='FrmRnuS']//input)[17] "));
        hesapac.click();
        MyFunc.Bekle(2);

        WebElement mesaj=driver.findElement(By.xpath("(//*[@class='alertX t2'])/p"));

        Assert.assertTrue("Hata mesajı alınamadı.",mesaj.getText().equals("E-posta adresleri aynı olmalı."));

        BekleKapat();

    }
}
