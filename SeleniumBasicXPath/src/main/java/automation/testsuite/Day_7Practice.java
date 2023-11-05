package automation.testsuite;

import automation.common.CommonBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_7Practice extends CommonBase {
    public String url = "https://bepantoan.vn/";

    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver(url);
    }

    @Test
    public void test() {
        System.out.println("success");
    }
}
