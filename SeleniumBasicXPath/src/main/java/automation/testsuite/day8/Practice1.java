package automation.testsuite.day8;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 extends CommonBase {

    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://rise.fairsketch.com/signin");
    }

    @Test
    public void getLocatorByIdNameClassname() {
        WebElement email = driver.findElement(By.id("email"));
        System.out.println(email);

        WebElement password = driver.findElement(By.name("password"));
        System.out.println(password);

        driver.findElement(By.tagName("button")).click();

    }

    @AfterMethod
    public void closeChrome() {
        driver.close();
    }
}
