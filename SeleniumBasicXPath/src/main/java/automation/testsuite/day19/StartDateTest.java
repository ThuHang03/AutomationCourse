package automation.testsuite.day19;

import automation.common.CommonBase;
import automation.page.risePage.LoginPage_Factory;
import org.testng.annotations.*;

public class StartDateTest extends CommonBase {

    @BeforeMethod
    @Parameters("browser")
    public void openBrowser(@Optional("chrome") String browser) {
        setupDriver(browser);
        driver.get("https://rise.fairsketch.com");
    }

    @Test
    public void filter() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");
    }

    @AfterMethod
    public void closeBrowser() {
        closeDriver();
    }
}
