package automation.testsuite.day12;

import automation.common.CommonBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeDropdownList extends CommonBase {
    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    public void runTest() {
        //1h52 <=> 8h57
    }
}
