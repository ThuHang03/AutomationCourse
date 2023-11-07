package automation.testsuite.day8;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://bepantoan.vn/");
    }

    @Test
    public void getLocatorByText() {
        driver.findElement(By.linkText("Máy Hút Mùi")).click();

        WebElement linkCoDien = driver.findElement(By.partialLinkText("Cổ Điển"));
        System.out.println(linkCoDien);
    }

    @Test
    public void getLocatorByClassName_TagName(){
        System.out.println("so luong Checkbox chua class : " + driver.findElements(By.className("cursor-pointer")).size());

        System.out.println("The input : " + driver.findElement(By.tagName("input")));
    }

    @AfterMethod
    public void closeChrome() {
        driver.close();
    }
}
