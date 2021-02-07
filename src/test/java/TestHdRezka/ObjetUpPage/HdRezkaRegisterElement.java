package TestHdRezka.ObjetUpPage;

import TestHdRezka.Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HdRezkaRegisterElement extends DriverHolder {
    public HdRezkaRegisterElement(WebDriver driver) {
        super(driver);
    }

    public WebElement regReg() {
        return driver.findElement(By.xpath("//a[@class='b-tophead__register']"));
    }

    public WebElement emailReg() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }


    public WebElement nameReg() {
        return driver.findElement(By.xpath("//input[@id='name']"));
    }


    public WebElement passReg() {
        return driver.findElement(By.xpath("//input[@id='password1']"));
    }

    public WebElement buttonReg() {
        return driver.findElement(By.xpath("//button[@name='submit']"));
    }

    public WebElement buttonClose() {
        return driver.findElement(By.xpath("//*[@id='register-popup']/i"));
    }

    public WebElement Galochka() {
        return driver.findElement(By.cssSelector("//label[@for='accept-rules']"));
    }
    public WebElement testMailReg(){
        return driver.findElement(By.xpath("//span[@class='string-ok']"));
    }
    public WebElement testPassReg(){
        return driver.findElement(By.xpath("(//span[@class='string-ok'])[2]"));
    }

}
