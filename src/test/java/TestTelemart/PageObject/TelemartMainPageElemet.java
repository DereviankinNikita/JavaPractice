package TestTelemart.PageObject;

import TestTelemart.Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelemartMainPageElemet extends DriverHolder {

    public TelemartMainPageElemet(WebDriver driver) {
        super(driver);
    }

    public WebElement topSearchLine(){ return driver.findElement(By.xpath("(//input[@id='header_search_term'])[1]")); }

    public WebElement close(){
        return driver.findElement(By.xpath("(//button[@type='button'])[7]"));
    }

    public WebElement product(){return  driver.findElement(By.xpath("(//div[@class='b-i-product-inner'])[1]//a[1]"));}

    public WebElement basket(){return driver.findElement(By.xpath("(//a[@class='b-btn-go2basket'])[1]"));}


public WebElement baskeLabel(){return driver.findElement(By.xpath("//span[@class='b-label']"));}

public WebElement GoToBasket(){return driver.findElement(By.xpath("(//a[@class='b-btn-go2basket'])[1]"));}

}
