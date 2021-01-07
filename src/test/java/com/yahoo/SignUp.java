package com.yahoo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
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

        //
        String s = "igorrr" + i;
        // Enter login & password
        driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys(s);
        driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("qwerty1" + i);
        // Enter random phone number TODO FIX RANGE --> TEST UNSTABLE
        randomNumber();

        // Useless random month input
        driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
        int g = random.nextInt(12) + 1;

        driver.findElement(By.xpath("//option[@value='"+g+"']")).click();

        // Birth date input
        driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("01");
        driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys("1992");

        //Wait to appear suggestions container
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='desktop-suggestions-container show']")));

        driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).click();// Vodoo magic to continue
        driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();

    }

}
