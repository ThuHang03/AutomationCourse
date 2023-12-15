package automation.testsuite.day17;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleIFrame extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://codestar.vn/");
    }

    @Test
    public void testCodeStar_kiemTraGuiNgay() {
        pause(2000);
        int sizeFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println("size iframe : " + sizeFrame);
        for (int i = 0; i < sizeFrame; i++) {
            driver.switchTo().frame(i);
            int totalBtn = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
            System.out.println("Toatal btn in frame : " + totalBtn);
            if (totalBtn != 0) {
                type(By.id("account_phone"), "032165498");
                isElementPresent(By.xpath("//button[text()='Gửi ngay']"));
                return;
            } else {
                driver.switchTo().defaultContent();
            }
//            if(isElementPresent(By.xpath("//button[text()='Gửi ngay']"))){
//                type(By.id("account_phone"), "032165498");
//                click(By.xpath("//button[text()='Gửi ngay']"));
//                isElementPresent(By.xpath("//button[text()='Gửi ngay']"));
//            }
        }
    }

    @Test
    public void testCodeStar_kiemTraDangKyNgay() {
        pause(2000);
        int sizeIframe = driver.findElements(By.tagName("iframe")).size();
        System.out.println("total iframe : " + sizeIframe);

        for (int i = 0; i < sizeIframe; i++) {
            driver.switchTo().frame(i);
            By btn = By.xpath("//button[text()='Đăng ký ngay']");
            if (isElementPresent(btn)) {
                type(By.xpath("//input[@name='account_name']"), "Tên khách hàng");
                type(By.xpath("//input[@name='account_phone']"), "Điện thoại");
                click(btn);
                isElementPresent(btn);
                return;
            }
            driver.switchTo().defaultContent();
        }
    }
}
