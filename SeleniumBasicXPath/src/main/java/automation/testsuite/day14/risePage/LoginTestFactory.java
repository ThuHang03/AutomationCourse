package automation.testsuite.day14.risePage;

import automation.common.CommonBase;
import automation.constant.risePage.CT_Account;
import automation.page.risePage.LoginPage_Factory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestFactory extends CommonBase {

    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test(priority = 1)
    public void loginSuccessfully() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        Assert.assertTrue(isElementPresent(CT_Account.DASHBOARD_TEXT));
    }

    @Test(priority = 2)
    public void loginFailIncorrectEmail() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo12.com", "riseDemo");

        Assert.assertFalse(isElementPresent(CT_Account.DASHBOARD_TEXT));
    }

    @Test(priority = 3)
    public void logout() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.logoutFunction("admin@demo.com", "riseDemo");

    }

    @AfterMethod
    public void closeDriver() {
        closeWeb();
    }
}
