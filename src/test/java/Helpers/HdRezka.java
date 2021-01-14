package Helpers;

import Helpers.ObjetUpPage.HdRezkaMainPageHelper;
import Helpers.ObjetUpPage.HdRezkaRegisterHelper;
import Helpers.ObjetUpPage.MoiZakladkiElements;
import Helpers.ObjetUpPage.SecondPageHelper;
import org.openqa.selenium.Alert;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class HdRezka extends TestInit {


    @Test
    public void HdRezka() {
        HdRezkaMainPageHelper rezka = new HdRezkaMainPageHelper(driver);

        rezka.goTo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        HdRezkaRegisterHelper rezkareg = new HdRezkaRegisterHelper(driver);

        rezkareg.registration();
        rezkareg.mailReg("sawm");
        Assert.assertEquals(rezkareg.testMailReg().getText(), "Можно использовать данный email для регистрации");
        rezkareg.nameRegister("Lwewa");
        Assert.assertEquals(rezkareg.testPassReg().getText(), "Можно использовать данный логин для регистрации");
        rezkareg.passRegister("6dhjh2");
        rezkareg.registrations();

        rezka.searchs("Гарри Поттре");

        SecondPageHelper total = new SecondPageHelper(driver);

        total.conTent().click();
        total.valueApr();
        total.addZakladki().click();
        waitForElementToBeClickable(total.SozdatRazdel());
        total.SozdatRazdel().click();
        total.addRazdelName("Голубой Огонёк");
        total.sozdat().click();
        waitForElementToBeClickable(total.close());
        total.close().click();

        rezka.zakladkiHdRezka().click();

        MoiZakladkiElements zaklad = new MoiZakladkiElements(driver);
        zaklad.chekBox().click();


    }

    
    @Test
    public void HdRezkaSingIn() {
        HdRezkaMainPageHelper rezka1 = new HdRezkaMainPageHelper(driver);
        HdRezkaLogInHelper log = new HdRezkaLogInHelper(driver);

        rezka1.goTo();

        log.logInClick().click();
        waitForElementToBeClickable(log.loginNmae());
        log.logNmae("Lwewa3");
        log.logPass("6dhjh2487");
        log.LogInlogButton().click();

        rezka1.goTo();
        rezka1.contentLine1().click();

        SecondPageHelper total1 = new SecondPageHelper(driver);

        waitForElementToBeDisplayed(total1.addZakladki());
        total1.addZakladki().click();
        moveToElement(total1.SozdatRazdel());
        waitForElementToBeDisplayed(total1.SozdatRazdel());
        total1.SozdatRazdel().click();
        total1.addRazdelName("Голуболй Огонёк");
        waitForElementToBeDisplayed(total1.sozdat());
        total1.sozdat().click();


        rezka1.goTo();
        rezka1.contentLine2().click();

        waitForElementToBeDisplayed(total1.addZakladki());
        total1.addZakladki().click();
        moveToElement(total1.addZakladkimore());
        waitForElementToBeDisplayed(total1.addZakladkimore());
        total1.addZakladkimore().click();


        rezka1.goTo();
        waitForElementToBeDisplayed(rezka1.zakladkiHdRezka());
        rezka1.zakladkiHdRezka().click();

        MoiZakladkiElements zak = new MoiZakladkiElements(driver);
        zak.chekBoxClick(0).click();
        zak.chekBoxClick(1).click();
        Assert.assertTrue(zak.checkBoxTest(0).isSelected());
        Assert.assertTrue(zak.checkBoxTest(1).isSelected());
        zak.moiZakladkiSettings().click();
        zak.dellMoiZakladki().click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        rezka1.goTo();
        rezka1.zakladkiHdRezka();

        boolean sd = zak.noPresenceOfTitles().isDisplayed();
        Assert.assertTrue(sd);

    }
}
