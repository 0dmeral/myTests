package ag.rezka.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverHolder {
    protected WebDriver driver;

    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }

}
