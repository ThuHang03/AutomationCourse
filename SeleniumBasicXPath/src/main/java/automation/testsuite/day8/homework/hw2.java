package automation.testsuite.day8.homework;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hw2 extends CommonBase {
    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
    }

    @Test
    public void runTest() {
        System.out.println("Name : " + driver.findElement(By.id("name")));
        System.out.println("Address : " + driver.findElement(By.id("address")));
        System.out.println("Email : " + driver.findElement(By.id("email")));
        System.out.println("Password : " + driver.findElement(By.name("password")));

    }
}
