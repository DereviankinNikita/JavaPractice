package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestForTest extends TestInit {

    @Test
    public void rozetka(){
        driver.get("https://rozetka.com.ua/");
        WebElement searchField = driver.findElement(By.xpath("//input[contains(@class, 'search')]"));
        searchField.sendKeys("Жидкости для электронных сигарет");
        searchField.sendKeys(Keys.ENTER);
// TODO need to add some assertion for current test
//        Assert.assertEquals();

    }
}
