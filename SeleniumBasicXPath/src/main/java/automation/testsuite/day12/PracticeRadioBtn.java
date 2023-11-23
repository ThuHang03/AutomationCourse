package automation.testsuite.day12;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeRadioBtn extends CommonBase {
    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    @Test
    public void clickOnRadioBox() {
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='Female']")).click();
    }

    @AfterTest
    public void closeChrome() {
        driver.close();
    }
}
