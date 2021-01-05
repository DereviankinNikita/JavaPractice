package com.yahoo;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

//TODO ADD MAC DRIVER
public class WebDriverSettings {
    public ChromeDriver driver;
    Random random = new Random();

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver_win.exe");
        driver = new ChromeDriver();

    }

    public void randomNumber() {
        int array[] = {66, 99, 97, 63, 73};
        int n3 = random.nextInt(9998) + 1000;
        int n2 = random.nextInt(998) + 1;
        int n = array[random.nextInt(array.length)];
        String number = "" + n + n2 + n3;
        driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys(number);
    }

    @After
    public void close() {
        driver.quit();
    }
}
