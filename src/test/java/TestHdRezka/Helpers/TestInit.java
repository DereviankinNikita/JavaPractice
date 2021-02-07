package TestHdRezka.Helpers;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Before;

public class TestInit{
    public ChromeDriver driver;

    public void  waitForElementToBeClickable(WebElement element){
        new WebDriverWait(driver , 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeDisplayed(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(element));
    }
    public void moveToElement(WebElement element){
        new Actions(driver).moveToElement(element).build().perform();
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
                    "src/chromedriver_win.exe"
            );
        }else {
            new Exception("CURRENT SOLUTION IMPLEMENTED ONLY FOR MAC AND WINDOWS");
        }
        driver = new ChromeDriver();
    }


//    @After
//    public void close(){
//        driver.quit();
//    }

}