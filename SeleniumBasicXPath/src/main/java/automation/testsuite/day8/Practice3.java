package automation.testsuite.day8;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice3 extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void getLocatorsOnPage() {
        System.out.println("Id : " + driver.findElement(By.id("userId")));
        System.out.println("Password : " + driver.findElement(By.id("pass")));
        System.out.println("Company : " + driver.findElement(By.name("company")));
        System.out.println("Phone Number : " + driver.findElement(By.name("mobile number")));
    }

    @AfterMethod
    public void closeChrome() {
        driver.close();
    }
}
