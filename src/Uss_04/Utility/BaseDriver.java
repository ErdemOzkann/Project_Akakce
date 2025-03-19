package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    static {
        driver=new ChromeDriver();

        driver.manage().window().maximize();    // EKrani max yapiyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn muhlet: sayfayi yukleme muhleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn muhlet: elementi bulma muhleti
    }

    public static void BekleKapat(){
        MyFunc.Bekle(3);
        driver.quit();
    }
}