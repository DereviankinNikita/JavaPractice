package Helpers.ObjetUpPage;

import Helpers.DriverHolder;
import org.openqa.selenium.*;



public class HdRezkaMainPageElement extends DriverHolder {
    public HdRezkaMainPageElement(WebDriver driver){
        super(driver);
    }


    public WebElement zakladkiHdRezka() {
        return driver.findElement(By.xpath("//a[text()='Мои закладки']"));
    }

    public WebElement searchContent(){
        return driver.findElement(By.xpath("//input[@id='search-field']"));
    }

    public WebElement contentLine1(){
        return driver.findElement(By.xpath("(//div[@class='b-content__inline_item-link'])[9]"));
    }
    public WebElement contentLine2(){
        return driver.findElement(By.xpath("(//div[@class='b-content__inline_item'])[10]"));
    }



}

