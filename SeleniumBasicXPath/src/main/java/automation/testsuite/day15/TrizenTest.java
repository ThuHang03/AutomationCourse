package automation.testsuite.day15;

import automation.common.CommonBase;
import automation.constant.trizzenPage.CT_Account;
import automation.page.trizzenPage.TrizenPage;
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
        trizen.handleDateTimeAndDropdownList();
    }
}
