package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinPage {

    @FindBy(xpath = "//*[@data-control-name='ga-cookie.consent.accept.v4']")
    public WebElement cerezKabul;

    @FindBy (xpath = "/html/body/nav/div/a[2]")
    public WebElement girisButonu;

    @FindBy (id = "username")
    public WebElement kullaniciAdi;

    @FindBy (id = "password")
    public WebElement sifre;

    @FindBy (xpath = " //*[@data-litms-control-urn=\"login-submit\"]")
    public WebElement oturumAc;

    @FindBy (xpath = " //span[@title=\"My Network\"]")
    public WebElement myNetwork;

    @FindBy (id = "ember1130")
    public WebElement seeAll;

    @FindBy (id = "ember1952")
    public WebElement ilkKisi;

    @FindBy (id = "ember1953")
    public WebElement ilkKisiRet;

    @FindBy (id = "ember1954")
    public WebElement ilkKisiKabul;

}
