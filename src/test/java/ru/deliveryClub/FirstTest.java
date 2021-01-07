package ru.deliveryClub;

import com.yahoo.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends WebDriverSettings {



    @Test
    public void firstTest() {
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("roast chicken");
        driver.findElement(By.xpath("//input[@value='Search']")).click();


    }

//    @Test
//    public void firstTest2() {
//        driver.get("https://www.delivery-club.ru/");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Delivery Club — Доставка еды из ресторанов от 25 минут!"));
//
//    }


}
