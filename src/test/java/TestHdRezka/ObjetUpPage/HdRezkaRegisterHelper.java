package TestHdRezka.ObjetUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class HdRezkaRegisterHelper extends HdRezkaRegisterElement {
    public HdRezkaRegisterHelper(WebDriver driver) {
        super(driver);
    }

    Random random = new Random();
    int s;

    public void registration() {
        WebElement reg = regReg();
        reg.click();
    }

    public void mailReg(String mail) {
        WebElement eMail = emailReg();
        s = random.nextInt(100) + 1;
        eMail.sendKeys(s + mail + s + "@mail.ru");
        System.out.println("Мыло:");
        System.out.println(s + mail + s + "@mail.ru" + "\n");
    }

    public void passRegister(String pas) {
        WebElement pass = passReg();
        s = random.nextInt(1000) + 1;
        pass.sendKeys(pas + s);
        System.out.println("пасс:");
        System.out.println(pas + s + "\n");
    }

    public void nameRegister(String name) {
        WebElement rName = nameReg();
        s = random.nextInt(100) + 1;
        rName.sendKeys(name + s);
        System.out.println("Ник:");
        System.out.println(name + s + "\n");

    }

    public void closeButtonReg() {
        WebElement close = buttonClose();
        close.click();
    }

    public void galOchka() {
        WebElement gal1 = Galochka();
        gal1.click();
    }

    public void registrations() {
        WebElement reg = buttonReg();
        reg.click();
    }
}
