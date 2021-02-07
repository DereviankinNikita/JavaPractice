package TestHdRezka.ObjetUpPage;

import TestHdRezka.Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoiZakladkiElements extends DriverHolder {
    public MoiZakladkiElements(WebDriver driver){
        super(driver);
    }
    public WebElement chekBox(){
        return driver.findElement(By.xpath("//label[@for='label-favorite-239']"));
    }

    public WebElement chekBoxClick(int ch){
        return driver.findElements(By.xpath("//label[contains(@for,'label')]")).get(ch);
    }
    public WebElement moiZakladkiSettings(){
        return driver.findElement(By.xpath("//span[@class='edit-cat']"));
    }
    public WebElement moiZakladkiName(){
        return driver.findElement(By.xpath("//span[@class='name']"));
    }
    public WebElement dellMoiZakladki(){
        return driver.findElement(By.xpath("//button[@id='ps-favorites-remove']"));
    }
    public WebElement noPresenceOfTitles(){
        return driver.findElement(By.xpath("//div[@id='favorites-content-holder-0']"));
    }
    public WebElement checkBoxTest(int ch1){
        return driver.findElements(By.xpath("//input[@type='checkbox']")).get(ch1);
    }
}
