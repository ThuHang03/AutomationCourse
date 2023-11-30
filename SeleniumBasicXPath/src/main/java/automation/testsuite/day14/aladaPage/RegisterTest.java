package automation.testsuite.day14.aladaPage;

import automation.common.CommonBase;
import automation.constant.alada.CT_Account;
import automation.page.aladaPage.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.ALADA_URL_REGISTER);
    }

    @Test
    public void register() {
        RegisterPage register = new RegisterPage(driver);
        register.registerFunction(CT_Account.name, CT_Account.email, CT_Account.pass, CT_Account.phone);

        Assert.assertTrue(driver.findElement(CT_Account.AVATAR_USER).isDisplayed());
    }

    @AfterMethod
    public void close() {
        closeWeb();
    }
}
