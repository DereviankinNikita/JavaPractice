package TestTelemart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelemartOrderPageHelpers extends TelemartOrderPageElements {
    public TelemartOrderPageHelpers(WebDriver driver) {
        super(driver);
    }

    public String priceTest() {
        WebElement price = testPrice();
        String str = price.getText().replaceAll("[^0-9]", "");
        int  i = Integer.parseInt(str);
        i *=2;
        str = i+"";

        System.out.println(str+"*2");
        return str;
    }

    public String totalPriceTest(){
        WebElement totalPrice = testTotalPrice();
        String str1 = totalPrice.getText().replaceAll("[^0-9]", "");

        int i1 = Integer.parseInt(str1);

        System.out.println(i1+"second");
    return str1;
    }

}
