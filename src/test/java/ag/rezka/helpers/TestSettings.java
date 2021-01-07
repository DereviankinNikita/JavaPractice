package ag.rezka.helpers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestSettings {
    public WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


    public void waitForElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeDisplayed(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void moveToElement(WebElement element){
        new Actions(driver).moveToElement(element).build().perform();
    }

    @After
    public void close() {
        driver.quit();
    }
}
