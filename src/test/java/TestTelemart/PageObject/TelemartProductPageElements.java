package TestTelemart.PageObject;

import TestTelemart.Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelemartProductPageElements extends DriverHolder {
    public TelemartProductPageElements(WebDriver driver) {
        super(driver);
    }
    public WebElement buyProduct(){  return driver.findElement(By.xpath("(//div[@class='b-i-product-wrap-price'])[2]//a"));
        }
    public WebElement orderProduct(){
        return driver.findElement(By.xpath("//a[@class='b-btn-checkout']"));
    }








}
