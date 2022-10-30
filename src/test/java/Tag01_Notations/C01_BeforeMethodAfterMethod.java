package Tag01_Notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethodAfterMethod extends TestBase {

    //beforemethod ve aftermethod junit deki before ve after methodlari ile aynidir
    // testng testleri random calistirmaz alfabetik siraya göre calistirir. junit random

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");}
    @Test
    public void test02(){
        driver.get("https://www.bestbuy.com");}
    @Test
    public void test03(){
        driver.get("https://www.techproeducation.com");

    }
}
