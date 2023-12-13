package automation.testsuite.day16;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertWithSenkey extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
    }

    @Test
    public void alertWithTextBox() {
        click(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        click(By.xpath("//div[@id='Textbox']/button"));

        String name = "abc";
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();

        String textResult = getElementPresentDOM(By.xpath("//p[@id='demo1']")).getText();
        Assert.assertEquals(textResult, "Hello " + name + " How are you today");
    }

    @AfterMethod
    public void closeChrome() {
        closeDriver();
    }
}
