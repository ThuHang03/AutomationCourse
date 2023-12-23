package automation.testsuite.day18;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;

public class Ex2 extends CommonBase {

    @BeforeMethod
    @Parameters("browser")
    public void openChrome(@Optional("chrome") String browser) {
        setupDriver(browser);
        driver.get("https://bepantoan.vn/");
    }

    @Test
    public void openChat() {
        pause(2000);
        List<WebElement> iframes = driver.findElements(By.xpath("//iframe[@title='chat widget']"));

        for (int i = 0; i < iframes.size(); i++) {
            driver.switchTo().frame(i);
            if (isElementPresent(By.xpath("//div[@class='tawk-text-truncate']"))) {
                click(By.xpath("//div[@class='tawk-text-truncate']"));
            }
            if (isElementPresent(By.xpath("//button[normalize-space()='Not now']"))) {
                click(By.xpath("//button[normalize-space()='Not now']"));
                return;
            }
            driver.switchTo().defaultContent();
        }
    }

    @AfterMethod
    public void close() {
        closeDriver();
    }
}
