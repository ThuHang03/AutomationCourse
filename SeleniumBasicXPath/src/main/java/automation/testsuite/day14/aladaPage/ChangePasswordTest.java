package automation.testsuite.day14.aladaPage;

import automation.common.CommonBase;
import automation.constant.alada.CT_Account;
import automation.page.aladaPage.LoginPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangePasswordTest extends CommonBase {

    String newPassword = "newPass123";

    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.ALADA_URL_LOGIN);
    }

    @Test(priority = 1)
    public void changePassword() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction(CT_Account.email, CT_Account.pass);

        login.changePass(newPassword);

        waitAlert(5);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Cập nhật mật khẩu mới thành công!");
        alert.accept();
    }

    @Test(priority = 2)
    public void loginWithNewPass() {
        LoginPage login = new LoginPage(driver);
        login.loginFunction(CT_Account.email, newPassword);

        Assert.assertTrue(driver.findElement(CT_Account.AVATAR_USER).isDisplayed());
    }


    @AfterMethod
    public void close() {
        closeDriver();
    }
}
