package TestTelemart;

import TestTelemart.Helpers.TestInit;
import TestTelemart.PageObject.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class TelemartTest extends TestInit {
    @Test
    public void TelemartTestr() {
        TelemartMainPageHelpers telemart = new TelemartMainPageHelpers(driver);

        telemart.goTo();
        implicitlyWait();
        telemart.close().click();
        waitForElementToBeDisplayed(telemart.topSearchLine());
        telemart.search();
        telemart.product().click();


        TelemartProductPageHelpers telemartPrPage = new TelemartProductPageHelpers(driver);

        telemartPrPage.buyProduct().click();
        telemart.waitForElementToBeClickable(telemartPrPage.orderProduct());
        waitForElementToBeDisplayed(telemartPrPage.orderProduct());
        telemartPrPage.orderProduct().click();


        TelemartOrderPageHelpers telemartOrderPE = new TelemartOrderPageHelpers(driver);

       telemartOrderPE.takeMore().click();
       telemartOrderPE.testLabel().click();
        Assert.assertTrue("checkbox",telemartOrderPE.testipute().isSelected());


        telemart.goTo();
        Actions action = new Actions(driver);
        action.moveToElement(telemart.baskeLabel()).build().perform();
        waitForElementToBeDisplayed(telemart.GoToBasket());
        telemart.basket().click();


        String str1= telemartOrderPE.priceTest();
        String str2 = telemartOrderPE.totalPriceTest();
        boolean i = str1.equals(str2);
        Assert.assertTrue("the price does not match",i);






















    }

}
