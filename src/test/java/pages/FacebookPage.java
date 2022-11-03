package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@data-cookiebanner='accept_button']")
    public WebElement cookies;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//input[@id=\"pass\"]")
    public WebElement sifre;

    @FindBy(xpath = "//button[@data-testid=\"royal_login_button\"]")
    public WebElement giris;

    @FindBy (xpath= "//img[@class='_9ay6 img']")
    public WebElement hataYazisi;



}
