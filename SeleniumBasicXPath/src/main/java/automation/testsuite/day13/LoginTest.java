package automation.testsuite.day13;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test(priority = 1)
    public void LoginSuccessfully() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        Assert.assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
    }

    @Test(priority = 2)
    public void LoginFailIncorrectEmail() {

        LoginPage login = new LoginPage(driver);
        login.loginFunction("Fail_admin@demo.com", "riseDemo");

        Assert.assertEquals(driver.findElement(CT_Account.STATUS_LOGIN).getText(), "Authentication failed!");
    }

    @Test(priority = 3)
    public void LoginFailIncorrectPass() {

        LoginPage login = new LoginPage(driver);
        login.loginFunction("admin@demo.com", "123");

        Assert.assertEquals(driver.findElement(CT_Account.STATUS_LOGIN).getText(), "Authentication failed!");
    }

    @AfterMethod
    public void closeDriver() {
        closeWeb();
    }
}
