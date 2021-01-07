package ag.rezka.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RezkaMyBookmarksHelper extends RezkaMyBookmarksObjects{
    public RezkaMyBookmarksHelper(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox(){
       completedCheckbox().click();
    }
}
