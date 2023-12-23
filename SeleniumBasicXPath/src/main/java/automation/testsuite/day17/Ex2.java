package automation.testsuite.day17;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ex2 extends CommonBase {
    @BeforeMethod
    @Parameters("browser")
    public void openChrome(@Optional("chrome") String browser) {
        setupDriver(browser);
        driver.get("https://mediamart.vn/");
    }

    @Test
    public void verifyChatZalo() {
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='zalo-chat-widget']//iframe")));

        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='zalo-chat-widget']//iframe")));
        click(By.xpath("//div[@class='za-chat__head-box']"));

        isElementPresent(By.xpath("//div[text()='Chat nhanh']"));
        click(By.xpath("//div[text()='Chat nhanh']"));

//        Assert.assertTrue(isElementPresent(By.xpath("//input[@placeholder='Nhập tin nhắn, nhấn Enter để gửi...']")));
    }

    @AfterMethod
    public void close() {
        closeDriver();
    }
}
