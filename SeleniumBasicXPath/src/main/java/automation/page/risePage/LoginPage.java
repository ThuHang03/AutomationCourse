package automation.page.risePage;

import automation.constant.risePage.CT_Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    public void logoutFunction() {
        driver.findElement(CT_Account.USER_DROPDOWN).click();
        driver.findElement(CT_Account.BTN_LOGOUT).click();

        Assert.assertTrue(driver.findElement(CT_Account.BTN_SIGNING).isDisplayed());
    }
}
