package automation.testsuite.day16;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPractice extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void deleteCustomerSuccessfully() {
        type(By.xpath("//input[@name='cusid']"), "1234");
        click(By.xpath("//input[@name='submit']"));

        String msgConfirm = driver.switchTo().alert().getText();
        Assert.assertEquals(msgConfirm, "Do you really want to delete this Customer?");
        driver.switchTo().alert().accept();

        String msgNotifyDeleteSuccess = driver.switchTo().alert().getText();
        Assert.assertEquals(msgNotifyDeleteSuccess, "Customer Successfully Delete!");
        driver.switchTo().alert().accept();


    }

    @AfterMethod
    public void closeChrome() {
        closeDriver();
    }
}
