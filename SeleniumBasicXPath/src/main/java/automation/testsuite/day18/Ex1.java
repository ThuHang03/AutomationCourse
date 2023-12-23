package automation.testsuite.day18;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Ex1 extends CommonBase {

    @BeforeMethod
    @Parameters("browser")
    public void openChrome(String browser) {
        setupDriver(browser);
        driver.get("https://dienmaynhapkhaugiare.com.vn");
    }

    @Test
    public void openZalo() {
        click(By.xpath("//div[@id='zalo-vr']//div[@class='phone-vr-img-circle']"));
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> I1 = windows.iterator();
        String originalHandle = I1.next();
        String secondHandle = I1.next();

        driver.switchTo().window(secondHandle);
        Assert.assertTrue(isElementPresent(By.xpath("//a[@title='Zalo']")));
    }

    @AfterMethod
    public void close() {
        closeAllDriver();
    }

}
