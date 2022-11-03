package tests.Tag4_Xml;


import org.apache.poi.hpsf.Section;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
        linkedinPage.kullaniciAdi
                .sendKeys(ConfigReader.getProperties("linkedinKullaniciadi"+ Keys.TAB));

        linkedinPage.sifre.sendKeys("linkedinSifre");
        linkedinPage.oturumAc.click();
    }

    @Test
    public void test03() {
        linkedinPage.girisButonu.click();
        Section section=new Section();
    }
}
