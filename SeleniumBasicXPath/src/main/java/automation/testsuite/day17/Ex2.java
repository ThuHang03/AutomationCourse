package automation.testsuite.day17;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2 extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://mediamart.vn/");
    }

    @Test
    public void verifyChatZalo() {
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='zalo-chat-widget']//iframe")));

        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='zalo-chat-widget']//iframe")));
        click(By.xpath("//div[@class='za-chat__head-box']"));

        isElementPresent(By.xpath("//div[text()='Chat nhanh']"));
        click(By.xpath("//div[text()='Chat nhanh']"));

        Assert.assertTrue(isElementPresent(By.xpath("//input[@placeholder='Nhập tin nhắn, nhấn Enter để gửi...']")));
    }
}
