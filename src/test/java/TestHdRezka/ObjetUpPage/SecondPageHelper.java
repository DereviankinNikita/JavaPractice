package Helpers.ObjetUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondPageHelper extends SecondPageElements {
    public SecondPageHelper(WebDriver driver) {
        super(driver);
    }

    public void valueApr() {
        WebElement value = valueAp();
        WebElement comMents = conets();
        comMents.click();
        WebElement acc = accept();
        acc.click();
        String s = value.getText();
        try {
            Double s1 = Double.valueOf(s);
            System.out.println(s1);
            if (s1 > 5) {
                System.out.println(s1 + "Больше 5");
                comMents.sendKeys("Хороший фильм");

            } else {
                System.out.println(s1 + "меньше 5");
                comMents.sendKeys("Поганый фильм");
            }
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

    }

    public void addRazdelName(String name) {
        WebElement addRazdelName1 = SozdatRazdelName();
        addRazdelName1.sendKeys(name);
    }
}
