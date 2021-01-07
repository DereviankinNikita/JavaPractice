package ag.rezka.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RezkaMainPageHelper extends RezkaMainPageObjects {
    public RezkaMainPageHelper(WebDriver driver) {
        super(driver);
    }

    Random random = new Random();
    private int loginRandom, emailRandom;

    public void goTo() {
        driver.get("https://rezka.ag/");
    }

    public void emailInput(String email) {
        WebElement emailInputField = signUpEmailField();
        emailRandom = random.nextInt(999) - 1;
        emailInputField.sendKeys(email + emailRandom + "@mail.ru");
    }

    public void loginInput(String login) {
        WebElement loginField = signUpLoginField();
        loginRandom = random.nextInt(100) - 1;
        loginField.sendKeys(login + loginRandom + loginRandom);
    }

    public void passwordInput(String password) {
        WebElement passField = signUpPasswordField();
        passField.sendKeys(password);
    }

    public void confirmRegistration() {
        WebElement submit = signUpSubmitButton();
        submit.click();
    }

    public void searchInput(String input) {
        WebElement sInput = searchField();
        sInput.clear();
        sInput.sendKeys(input);
    }

    public void searchListPick() {
        WebElement pickFirst = searchList();
        pickFirst.click();
    }

    public void goToMyBookmarks() {
        WebElement go = myBookmarks();
        go.click();
    }


    public void signInClick() {
        signinButton().click();
    }

    public void signInLoginEnter() {
        signInLogin().sendKeys("rrtyui123");
    }

    public void signInPassEnter() {
        signInPassword().sendKeys("qwerty123");
    }

    public void loginCfrmClick(){
        loginBtn().click();
    }

    public String textBookmarks(){
        return myBookmarks().getText();
    }
}
