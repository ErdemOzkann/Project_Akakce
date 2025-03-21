package Uss_02.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver = new ChromeDriver();

    public BaseDriver() {
    }

    public static void BekleKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }

    static {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20L));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20L));
    }
}
