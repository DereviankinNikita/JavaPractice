package ag.rezka.helpers;

import org.openqa.selenium.WebDriver;


public class DriverHolder {
    protected WebDriver driver;

    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }

}
