package ag.rezka.PageObjects;

import ag.rezka.helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RezkaMyBookmarksObjects extends DriverHolder {
    public RezkaMyBookmarksObjects(WebDriver driver) {
        super(driver);
    }

    public WebElement completedCheckbox(){
        return driver.findElement(By.xpath("//label[contains(@for,'label')]"));
    }

    public WebElement deleteTitleBtn(){
        return driver.findElement(By.xpath("//button[@class='btn btn-attention btn-mini remove-items']"));
    }

    public WebElement listsStngsBtn(){
        return driver.findElement(By.xpath("//span[@class='edit-cat']"));
    }

    public WebElement confirmListDeleteBtn(){
        return driver.findElement(By.xpath("//button[@id='ps-favorites-remove']"));
    }

    public WebElement fewCompletedCheckbox(int qty){
        return driver.findElements(By.xpath("//label[contains(@for,'label')]")).get(qty);
    }

    public WebElement checkboxTest(int qty){
        return driver.findElements(By.xpath("//input[@type='checkbox']")).get(qty);
    }

    public WebElement noPresenceOfTitles(){
        return driver.findElement(By.xpath("//div[@id='favorites-content-holder-0']"));
    }
}
