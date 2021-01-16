package Helpers.ObjetUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HdRezkaLogInHelper extends HdRezkaLogInElement {
    public HdRezkaLogInHelper(WebDriver driver) {
        super(driver);
    }

    public void logNmae(String name) {
        WebElement logName1 = loginNmae();
        logName1.sendKeys(name);
    }

    public void logPass(String pass) {
        WebElement logPass1 = loginPass();
        logPass1.sendKeys(pass);
    }


}
