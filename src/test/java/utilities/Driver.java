package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    page object modelde artik driver icin testbase clasina extends etmek yerine
    driver clasindan static methodlar olusturarak ilgili ayarlari olusturup sonra kapatilmasi
    kararlastirilmistir

     */
     static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));}

        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
        driver.close();
        driver=null;}

    }
}
