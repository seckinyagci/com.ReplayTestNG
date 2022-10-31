package tests.Tag02_POM_ErsterTag;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_Amazon_POM_Test {
    @Test
    public void test01(){
        //amazona git nutella arat
        Driver.getDriver().get("https://www.amazon.com");
       AmazonPage amazonPage=new AmazonPage();
       amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

       // sonuclarin nutella icerdigini test et
        String actuelData=amazonPage.sonucYazisi.getText();
        String expectedData="Nutella";
        Assert.assertTrue(actuelData.contains(expectedData));
        Driver.closeDriver();

    }
}
