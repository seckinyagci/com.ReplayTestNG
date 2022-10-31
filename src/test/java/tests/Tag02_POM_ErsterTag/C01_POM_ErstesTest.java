package tests.Tag02_POM_ErsterTag;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_POM_ErstesTest {
    /*
    bugüne kadar testbase den extends ettigimiz
    driver yerine artik driver classtan kullanacagimiz driver methodlarini cagiracagiz
    artik driver degil Driver.getdriver() kodu ile driverimizi calistiracagiz
     */
    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
