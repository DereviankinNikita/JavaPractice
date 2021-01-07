package ag.rezka.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RezkaTitleHelper extends RezkaTitleObjects {
    public RezkaTitleHelper(WebDriver driver) {
        super(driver);
    }

    public void addToBookmarksClick(){
        addToBookmarksBtn().click();
    }

    public void createNewList(){
        createFavListBtn().click();
    }

    public void enterFavListName(String name){
        WebElement enter = addFavListnameFld();
        enter.clear();
        enter.sendKeys(name);
    }
    public void submitCreationOfNewFavList(){
        WebElement submit = cfrmCreationOfFLButton();
        submit.click();
    }
    public void closeFavLists(){
        closeFavListsTitle().click();
    }
}
