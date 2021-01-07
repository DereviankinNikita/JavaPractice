package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestInit {

    public WebDriver driver;

    @BeforeClass
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

    @AfterTest
    public void close(){
        driver.quit();
    }
}
