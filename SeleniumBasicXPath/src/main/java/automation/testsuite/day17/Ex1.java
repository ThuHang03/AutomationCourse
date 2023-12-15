package automation.testsuite.day17;

import automation.common.CommonBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex1 extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://dienmaynhapkhaugiare.com.vn");
    }

    @Test
    public void verifyChatMessenger() {

    }
}
