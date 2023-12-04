package automation.testsuite.day15;

import automation.common.CommonBase;
import automation.constant.trizzenPage.CT_Account;
import automation.page.trizzenPage.TrizenPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrizenTest extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver(CT_Account.TRIZEN_URL);
    }

    @Test
    public void testDateTimeAndDropdownList(){
        TrizenPage trizen = new TrizenPage(driver);
        trizen.searchFlights("Ha Noi","Ho Chi Minh");

        pausePage(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Flight Search Result']")).isDisplayed());
    }
}
