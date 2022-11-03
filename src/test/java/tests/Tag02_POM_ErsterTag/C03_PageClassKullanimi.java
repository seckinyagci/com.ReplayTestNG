package tests.Tag02_POM_ErsterTag;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {

    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();
        //facebook anasayfaya gidin kullanici adina rastgele isim
        Driver.getDriver().get("https://www.facebook.com");
       // sifreye rastgele sifre girin
        facebookPage.cookies.click();
        facebookPage.kullaniciAdi.sendKeys(faker.internet().emailAddress()+ Keys.TAB);
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.giris.click();

        Assert.assertTrue(facebookPage.hataYazisi.isEnabled());
        Driver.closeDriver();

        //giris yapilamadigini test edin

    }
}
