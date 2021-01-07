package ag.rezka;

import ag.rezka.PageObjects.RezkaMainPageHelper;
import ag.rezka.PageObjects.RezkaMyBookmarksHelper;
import ag.rezka.PageObjects.RezkaTitleHelper;
import ag.rezka.helpers.TestSettings;
import org.junit.Assert;
import org.junit.Test;


public class RezkaTest extends TestSettings {


    @Test
    public void signUp() {
        RezkaMainPageHelper rezka = new RezkaMainPageHelper(driver);
        rezka.goTo();
        waitForElementToBeClickable(rezka.signUpButton());
        rezka.signUpButton().click();
        waitForElementToBeClickable(rezka.signUpEmailField());
        rezka.emailInput("nikiSss3SDssik");
        rezka.loginInput("katya228");
        rezka.passwordInput("wewewsdssds232323");


        rezka.confirmRegistration();

        rezka.goTo();


    }

    @Test
    public void signIn() {
        RezkaMainPageHelper rezka1 = new RezkaMainPageHelper(driver);
        rezka1.goTo();
        waitForElementToBeClickable(rezka1.signinButton());
        rezka1.signInClick();
        waitForElementToBeClickable(rezka1.signInLogin());
        rezka1.signInLoginEnter();
        rezka1.signInPassEnter();
        rezka1.loginCfrmClick();

        waitForElementToBeDisplayed(rezka1.myBookmarks());
        String profileButtonText = rezka1.textBookmarks();
        Assert.assertTrue("element is not visible", profileButtonText.contains("МОИ ЗАКЛАДКИ"));
    }

    @Test
    public void addToBookmarks() {
        signIn();
        RezkaMainPageHelper mainPage = new RezkaMainPageHelper(driver);
        waitForElementToBeClickable(mainPage.searchField());
        mainPage.searchInput("mad max");

        waitForElementToBeClickable(mainPage.searchList());
        mainPage.searchListPick();
        RezkaTitleHelper titlePage = new RezkaTitleHelper(driver);

        moveToElement(titlePage.addToBookmarksBtn());

        waitForElementToBeClickable(titlePage.addToBookmarksBtn());
        titlePage.addToBookmarksClick();
        moveToElement(titlePage.createFavListBtn());
        titlePage.createNewList();
        waitForElementToBeClickable(titlePage.addFavListnameFld());
        titlePage.enterFavListName("movies for true men");
        titlePage.submitCreationOfNewFavList();
        waitForElementToBeClickable(titlePage.cfrmCreationOfFLButton());
        moveToElement(titlePage.closeFavListsTitle());
        titlePage.closeFavLists();
        Assert.assertTrue("not contains",titlePage.addToBookmarksBtn().getText().contains("Находится в закладках"));

        mainPage.goTo();
        waitForElementToBeClickable(mainPage.searchField());
        mainPage.searchInput("fight club");
        waitForElementToBeDisplayed(mainPage.searchList());
        mainPage.searchListPick();
        waitForElementToBeDisplayed(titlePage.addToBookmarksBtn());
        moveToElement(titlePage.addToBookmarksBtn());
        titlePage.addToBookmarksClick();
        titlePage.firstBkmrksList().click();
        mainPage.goTo();

        waitForElementToBeClickable(mainPage.myBookmarks());
        mainPage.goToMyBookmarks();

        RezkaMyBookmarksHelper rezkaMyBookmarks = new RezkaMyBookmarksHelper(driver);

        waitForElementToBeClickable(rezkaMyBookmarks.completedCheckbox());
        Assert.assertFalse(rezkaMyBookmarks.fewCompletedCheckbox(0).isSelected());
        rezkaMyBookmarks.fewCompletedCheckbox(0).click();
        rezkaMyBookmarks.fewCompletedCheckbox(1).click();
        Assert.assertTrue(rezkaMyBookmarks.checkboxTest(0).isSelected());
        Assert.assertTrue(rezkaMyBookmarks.checkboxTest(1).isSelected());



        waitForElementToBeClickable(rezkaMyBookmarks.deleteTitleBtn());
        rezkaMyBookmarks.deleteTitleBtn().click();
        driver.switchTo().alert().accept();
        moveToElement(rezkaMyBookmarks.listsStngsBtn());
        rezkaMyBookmarks.listsStngsBtn().click();
        waitForElementToBeDisplayed(rezkaMyBookmarks.confirmListDeleteBtn());
        rezkaMyBookmarks.confirmListDeleteBtn().click();
        Assert.assertTrue(rezkaMyBookmarks.noPresenceOfTitles().isDisplayed());



    }

    @Test
    public void testst() {
        RezkaMainPageHelper test = new RezkaMainPageHelper(driver);
        test.goTo();
        test.signUpButton().click();
        waitForElementToBeDisplayed(test.signUpEmailField());
        Assert.assertTrue(test.rulesCheckUp().isSelected());



    }
}
