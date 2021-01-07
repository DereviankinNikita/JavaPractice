package ag.rezka.PageObjects;

import ag.rezka.helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RezkaMainPageObjects extends DriverHolder {
    public RezkaMainPageObjects(WebDriver driver) {
        super(driver);
    }

    public WebElement signUpButton() {
        return driver.findElement(By.xpath("//a[@class='b-tophead__register']"));
    }

    public WebElement signUpEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement signUpLoginField() {
        return driver.findElement(By.xpath("//input[@id='name']"));
    }

    public WebElement signUpPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password1']"));
    }

    public WebElement signUpSubmitButton() {
        return driver.findElement(By.xpath("//button[@name='submit']"));
    }

    public WebElement searchField() {
        return driver.findElement(By.xpath("//input[@id='search-field']"));
    }

    public WebElement searchList() {
        return driver.findElement(By.xpath("//ul[@class='b-search__section_list']//li[1]"));
    }

    public WebElement myBookmarks() {
        return driver.findElement(By.xpath("//a[@href='https://rezka.ag/favorites/']"));
    }

    public WebElement profileButton() {
        return driver.findElement(By.xpath("//span[@class='b-tophead-dropdown']"));
    }

    public WebElement signinButton() {
        return driver.findElement(By.xpath("//a[@class='b-tophead__login']"));
    }

    public WebElement signInLogin() {
        return driver.findElement(By.xpath("//input[@id='login_name']"));
    }

    public WebElement signInPassword() {
        return driver.findElement(By.xpath("//input[@id='login_password']"));
    }

    public WebElement loginBtn(){
        return driver.findElement(By.xpath("//button[contains(@class,'login')]"));
    }

    public WebElement rulesCheckUp(){
        return driver.findElement(By.xpath("//input[@id='accept-rules']"));
    }
}
