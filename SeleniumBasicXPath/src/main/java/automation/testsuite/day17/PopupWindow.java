package automation.testsuite.day17;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class PopupWindow extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://demo.guru99.com/popup.php");
    }

    @Test
    public void testDemoGuru() {
        click(By.xpath("//a[text()='Click Here']"));
        Set<String> listWindow = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle(); //chưa switch nên khi lấy vẫn sẽ lấy của main chính
        for (String s : listWindow
        ) {
            if (!s.equals(mainWindow)) {
                driver.switchTo().window(s);

                type(By.xpath("//input[@name='emailid']"), "test@gmail.com");
                click(By.xpath("//input[@name='btnLogin']"));
                isElementPresent(By.xpath("//h2[text()='Access details to demo site.']"));
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/popup.php");
    }
}
