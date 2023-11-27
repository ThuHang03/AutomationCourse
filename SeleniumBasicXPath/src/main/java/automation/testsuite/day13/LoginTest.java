package automation.testsuite.day13;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test(priority = 1)
    public void loginSuccessfully() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        Assert.assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
    }

    @Test(priority = 2)
    public void loginFailIncorrectEmail() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction("admin123@demo.com", "riseDemo");

        Assert.assertEquals(driver.findElement(CT_Account.STATUS_LOGIN).getText(), "Authentication failed!");
    }

    @Test(priority = 3)
    public void loginFailIncorrectPass() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction("admin@demo.com", "123");

        Assert.assertEquals(driver.findElement(CT_Account.STATUS_LOGIN).getText(), "Authentication failed!");
    }

    @Test(priority = 4)
    public void loginFailIncorrectPassAndEmail() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction("admin123@demo.com", "123");

        Assert.assertEquals(driver.findElement(CT_Account.STATUS_LOGIN).getText(), "Authentication failed!");
    }

    @Test(priority = 5)
    public void Logout() {
        loginSuccessfully();
        driver.findElement(CT_Account.USER_DROPDOWN).click();
        driver.findElement(CT_Account.BTN_LOGOUT).click();

        Assert.assertTrue(driver.findElement(CT_Account.BTN_SIGNING).isDisplayed());
    }

    @AfterMethod
    public void closeDriver() {
        closeWeb();
    }
}
