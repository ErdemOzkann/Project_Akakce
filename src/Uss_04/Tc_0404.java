package Uss_04;


import Uss_02.Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_0404 extends BaseDriver {

    @Test
    public void Test()
    {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement girisYap= driver.findElement(By.cssSelector("div[id='H_rl_v8'] [href='/akakcem/giris/']"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement ePosta= driver.findElement(By.id("life"));
        ePosta.sendKeys("");
        MyFunc.Bekle(2);

        WebElement sifre= driver.findElement(By.id("lifp"));
        sifre.sendKeys("");
        MyFunc.Bekle(2);

        WebElement girisYapButtonu= driver.findElement(By.cssSelector("a[class='fp']+input"));
        girisYapButtonu.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }
}
