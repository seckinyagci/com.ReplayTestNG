package tests.Tag01_Notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.TestBaseC;

public class C04_DependsOnMethods extends TestBaseC {


    @Test
    public void test01(){
        driver.get("https://www.ramazon1.com");
        // bilerek yanlis adres girdik diger testler calismamali
        // bunun icin depends on notationu kullanilir

    }
    @Test (dependsOnMethods = "test01")
    public void test02(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);}
    @Test (dependsOnMethods = "test02")
    public void test03(){
        //sonuc yazisi nutella iceriyor mu
      WebElement ergebnisText=  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(ergebnisText.getText().contains("Nutella"));

    }
    @Test
    public void test04(){
        System.out.println("Depencyon olmayan test calisir ");
    }
}
