package TestTelemart.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelemartMainPageHelpers extends TelemartMainPageElemet{
    public TelemartMainPageHelpers(WebDriver driver) { super(driver); }

    public void goTo(){driver.get("https://telemart.ua/");}


    public void search() {
    WebElement searchLine =  topSearchLine();
    searchLine.sendKeys("игровая клавиатура"+ Keys.ENTER);

    }
}
