package Tag01_Notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    /*
    testng test methodlarini alfabetik siraya göre calistirir
    eger siralamayi kenddimiz belirlemek istersek methodlara priority tanimlamak gerekir
    priorty kücükten büyüge dogru calisir
    bir methoda priorty sayisi atanmazsa default olarak sifir atanir
     */
    @Test (priority = 5)
    public void test01(){
        driver.get("https://www.amazon.com");} //enson
    @Test (priority = -5)
    public void test02(){
        driver.get("https://www.bestbuy.com");} //ilk
    @Test
    public void test03(){
        driver.get("https://www.techproeducation.com");
        // default olarak sifir oldugu icin ikinci calisir

    }
}
