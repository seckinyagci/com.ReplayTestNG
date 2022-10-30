package Tag01_Notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClassAfterClass extends TestBase {

    // junitte @beforeclass ve @afterclass methodlari static olmaliydi ama testng de böyle bir
    // zorunluluk yok
    /*
    testng bize daha fazla before ve after notationlari sunar
    diger notationlar beforeSuit BeforeGroup gibi xml dosyalarinda calisacaktir
     */
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

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
