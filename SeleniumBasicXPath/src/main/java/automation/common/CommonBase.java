package automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class CommonBase {
    public WebDriver driver;

    public WebDriver initChromeDriver(String URL) {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return driver;
    }


    public void closeWeb() {
        driver.close();
    }

    public void pausePage(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
