package ag.rezka.PageObjects;

import ag.rezka.helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RezkaCategoryPageObjects extends DriverHolder {
    public RezkaCategoryPageObjects(WebDriver driver) {
        super(driver);
    }

    public WebElement popularBtn(){
        return driver.findElement(By.xpath("//a[text()='Популярные']"));
    }

    public WebElement newestBtn(){
        return driver.findElement(By.xpath("//a[text()='Последние поступления']"));
    }

    public WebElement firstPopularMovie(){
        return driver.findElement(By.xpath("//div[@class='b-content__inline_item-link']"));
    }
}
