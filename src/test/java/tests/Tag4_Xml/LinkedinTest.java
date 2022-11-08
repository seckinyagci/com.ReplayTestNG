package tests.Tag4_Xml;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedinPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LinkedinTest {
    LinkedinPage linkedinPage=new LinkedinPage();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperties("linkedinUrl"));


    }
    @Test
    public void test02()  {

        Assert.assertTrue(linkedinPage.cerezKabul.isEnabled());
        linkedinPage.cerezKabul.click();
        linkedinPage.kullaniciAdi
                .sendKeys(ConfigReader.getProperties("linkedinKullaniciadi"+ Keys.TAB));


        linkedinPage.sifre.sendKeys(ConfigReader.getProperties("linkedinSifre"));
        linkedinPage.oturumAc.click();
    }

}
