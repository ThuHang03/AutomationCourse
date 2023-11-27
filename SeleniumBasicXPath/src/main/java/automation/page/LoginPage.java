package automation.page;

import automation.constant.CT_Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginFunction(String emailValue, String passValue) {
        WebElement pass = driver.findElement(CT_Account.TEXTBOX_PASS);
        WebElement email = driver.findElement(CT_Account.TEXTBOX_EMAIL);
        WebElement signin = driver.findElement(CT_Account.BTN_SIGNING);

        if (email.isEnabled()) {
            email.clear();
            email.sendKeys(emailValue);
        }

        if (pass.isEnabled()) {
            pass.clear();
            pass.sendKeys(passValue);
        }

        signin.click();

    }
}
