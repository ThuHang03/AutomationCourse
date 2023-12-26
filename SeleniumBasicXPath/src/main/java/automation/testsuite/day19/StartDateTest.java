package automation.testsuite.day19;

import automation.common.CommonBase;
import automation.page.risePage.FilterStartDate;
import automation.page.risePage.LoginPage_Factory;
import automation.page.risePage.StartDatePage;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class StartDateTest extends CommonBase {

    @BeforeMethod
    @Parameters("browser")
    public void openBrowser(@Optional("chrome") String browser) {
        setupDriver(browser);
        driver.get("https://rise.fairsketch.com");
    }

    @Test(priority = 0)
    public void filterThisMonth() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        isElementPresent(By.xpath("//span[text()='Dashboard']"));

        StartDatePage page = new StartDatePage(driver);
        page.actionOpenFilter(FilterStartDate.this_month);
    }

    @Test(priority = 1)
    public void filterLastMonth() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        isElementPresent(By.xpath("//span[text()='Dashboard']"));

        StartDatePage page = new StartDatePage(driver);
        page.actionOpenFilter(FilterStartDate.last_month);
    }

    @Test(priority = 2)
    public void filterThisYear() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        isElementPresent(By.xpath("//span[text()='Dashboard']"));

        StartDatePage page = new StartDatePage(driver);
        page.actionOpenFilter(FilterStartDate.this_year);
    }

    @Test(priority = 3)
    public void filterLastYear() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        isElementPresent(By.xpath("//span[text()='Dashboard']"));

        StartDatePage page = new StartDatePage(driver);
        page.actionOpenFilter(FilterStartDate.last_year);
    }

    @Test(priority = 4)
    public void filterNext7Day() {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com", "riseDemo");

        isElementPresent(By.xpath("//span[text()='Dashboard']"));

        StartDatePage page = new StartDatePage(driver);
        page.actionOpenFilter(FilterStartDate.next_7_days);
    }

    @AfterMethod
    public void closeBrowser() {
        closeDriver();
    }
}
