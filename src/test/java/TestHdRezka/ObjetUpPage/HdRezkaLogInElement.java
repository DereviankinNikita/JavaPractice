package TestHdRezka.ObjetUpPage;

import TestHdRezka.Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HdRezkaLogInElement extends DriverHolder {
    public HdRezkaLogInElement(WebDriver driver) {
        super(driver);
    }

    public WebElement logInClick() {
        return driver.findElement(By.xpath("//a[@class='b-tophead__login']"));
    }

    public WebElement loginNmae() {
        return driver.findElement(By.xpath("//input[@id='login_name']"));
    }

    public WebElement loginPass() {
        return driver.findElement(By.xpath("//input[@id='login_password']"));
    }

    public WebElement LogInlogButton() {
        return driver.findElement(By.xpath("//button[@class='login_button btn btn-action']"));
    }
}
