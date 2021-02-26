package TestTelemart.Helpers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestInit {
    public ChromeDriver driver;

    public void implicitlyWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void waitForElementToBeDisplayed(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(element));
    }

    @Before
    public void setUp(){
        if(System.getProperty("os.name").toLowerCase().contains("mac")){
           System.setProperty(
                   "webdriver.chrome.driver",
                   "src/chromedriver"
           );
        }else if (System.getProperty("os.name").toLowerCase().contains("win")){
            System.setProperty(
                    "webdriver.chrome.driver",
                    "src/chromedriver_win.exe");
        }
        else{
            new Exception("CURRENT SOLUTION IMPLEMENTED ONLY FOR MAC AND WINDOWS");
        }

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }


//    @After
//public void close(){driver.quit();}
}
