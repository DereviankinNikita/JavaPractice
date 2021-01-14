package Helpers.ObjetUpPage;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HdRezkaMainPageHelper extends HdRezkaMainPageElement {


    public HdRezkaMainPageHelper(WebDriver driver) {
        super(driver);
    }


    public void goTo() {
        driver.get("https://rezka.ag/");
    }



    public void searchs(String content) {
        WebElement searchCon = searchContent();
        searchCon.clear();
        searchCon.sendKeys(content + Keys.ENTER);
    }


}
