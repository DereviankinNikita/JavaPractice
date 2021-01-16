package Helpers.ObjetUpPage;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SecondPageElements extends DriverHolder {
    public SecondPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement conTent() {
        return driver.findElement(By.xpath("//div[@class='b-content__inline_item-cover'][1]"));
    }

    //span[@class='name']
    public WebElement conets() {
        return driver.findElement(By.xpath("//textarea[@name='comments']"));
    }

    public WebElement valueAp() {
        return driver.findElement(By.xpath("//span[@class='bold'][1]"));
    }

    public WebElement accept() {
        return driver.findElement(By.xpath("//button[@class='btn btn-action btn-small']"));
    }

    public WebElement addZakladki() {
        return driver.findElement(By.xpath("//button[@class='btn btn-helper add-favorite']")); }

    public WebElement SozdatRazdel() {
        return driver.findElement(By.xpath("(//a[@class='b-userset__fav_link'])[1]"));
    }

    public WebElement SozdatRazdelName() {
        return driver.findElement(By.xpath("//input[@id='addcat-fav-name']"));
    }

    public WebElement sozdat() {
        return driver.findElement(By.xpath("//button[@id='addcat-fav-addbt']"));
    }
    public WebElement close() {
        return driver.findElement(By.xpath("//a[@id='addcat-fav-close']"));
    }
    public WebElement addZakladkimore(){
        return driver.findElement(By.xpath("//label[text()='Голуболй Огонёк']"));
    }




}



