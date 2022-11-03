package tests.Tag03_CofigReeader;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PageClassBenutzen {
    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperties("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperties("facebookUrl"));
        Driver.closeDriver();

    }
}
