package ag.rezka.PageObjects;

import ag.rezka.helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RezkaTitleObjects extends DriverHolder {
    public RezkaTitleObjects(WebDriver driver) {
        super(driver);
    }

    public WebElement addToBookmarksBtn() {
        return driver.findElement(By.xpath("(//button[contains(@class,'btn')])[6]"));
    }

    public WebElement createFavListBtn() {
        return driver.findElement(By.xpath("//a[@class='b-userset__fav_link']"));
    }

    public WebElement addFavListnameFld() {
        return driver.findElement(By.xpath("//input[@id='addcat-fav-name']"));
    }

    public WebElement cfrmCreationOfFLButton() {
        return driver.findElement(By.xpath("//button[@id='addcat-fav-addbt']"));
    }

    public WebElement closeFavListsTitle() {
        return driver.findElement(By.xpath("//a[@id='addcat-fav-close']"));
    }

    public WebElement firstBkmrksList(){
        return driver.findElement(By.xpath("//label[contains(@for,'user-fav')]"));
    }



}
