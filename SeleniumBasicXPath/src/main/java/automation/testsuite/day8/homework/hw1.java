package automation.testsuite.day8.homework;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hw1 extends CommonBase {
    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void runTest() {
        System.out.println("User Email" + driver.findElement(By.id("userId")));
        System.out.println("Password" + driver.findElement(By.id("pass")));
        System.out.println("Company" + driver.findElement(By.name("company")));
        System.out.println("Mobile Number" + driver.findElement(By.name("mobile number")));
    }


}
