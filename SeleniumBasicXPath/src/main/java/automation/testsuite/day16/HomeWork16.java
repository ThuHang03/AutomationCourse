package automation.testsuite.day16;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork16 extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
    }

    @Test
    public void getMessengerAlert() {
        click(By.xpath("//button[text()='Try it']"));
        waitAlert();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Welcome to Selenium WebDriver Tutorials");
    }
}
