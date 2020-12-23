package com.yahoo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class SignUp extends WebDriverSettings {

    @Test
    public void signUp() {

        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        // Go to Sign Up
        driver.findElement(By.xpath("//a[@class='_yb_a89nr']")).click();
        driver.findElement(By.xpath("//a[@id='createacc']")).click();
        // Enter First &  Last names
        driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Roman");
        driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Doroshenko");

        // Generate random login
        Random random = new Random();
        int i = random.nextInt(99) + 1;
        String s = "igorrr" + i;

        // Enter login & password
        driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys(s);
        driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("qwerty1" + i);
        // Enter random phone number TODO FIX RANGE --> TEST UNSTABLE
        randomNumber();

        // Useless random month input
        driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
        int g = random.nextInt(12) + 1;
        switch (g) {
            case 1:
                driver.findElement(By.xpath("//option[@value='1']")).click();

            case 2:
                driver.findElement(By.xpath("//option[@value='2']")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//option[@value='3']")).click();
                break;
            case 4:
                driver.findElement(By.xpath("//option[@value='4']")).click();
                break;
            case 5:
                driver.findElement(By.xpath("//option[@value='5']")).click();
                break;
            case 6:
                driver.findElement(By.xpath("//option[@value='6']")).click();
                break;
            case 7:
                driver.findElement(By.xpath("//option[@value='7']")).click();
                break;
            case 8:
                driver.findElement(By.xpath("//option[@value='8']")).click();
                break;
            case 9:
                driver.findElement(By.xpath("//option[@value='9']")).click();
                break;
            case 10:
                driver.findElement(By.xpath("//option[@value='10']")).click();
                break;
            case 11:
                driver.findElement(By.xpath("//option[@value='11']")).click();
                break;
            case 12:
                driver.findElement(By.xpath("//option[@value='12']")).click();
                break;
        }

        // Birth date input
        driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("01");
        driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys("1992");

        //Wait to appear suggestions container
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='desktop-suggestions-container show']")));

        driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).click();// Voogirtdoo magic to continue
        driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();

    }
}
