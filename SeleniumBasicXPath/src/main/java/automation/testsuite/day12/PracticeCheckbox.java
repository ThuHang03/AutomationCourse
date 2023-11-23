package automation.testsuite.day12;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeCheckbox extends CommonBase {
    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    public void clickOnCheckbox() {
        WebElement defaultCheckbox = driver.findElement(By.xpath("//label[normalize-space()= 'Default Checked']//child::input[@type='checkbox']"));
        System.out.println("Status isDisplayed : " + defaultCheckbox.isDisplayed());
        System.out.println("Status isEnabled : " + defaultCheckbox.isEnabled());

        WebElement thisCheckbox = driver.findElement(By.xpath("//label[normalize-space()= 'Click on this check box']//child::input[@type='checkbox']"));
        if (!thisCheckbox.isSelected()) {
            thisCheckbox.click();
            System.out.println("Status thisCheckbox : " + thisCheckbox.isSelected());

        }
    }

    @Test
    public void clickMultipleCheckbox() {
        List<WebElement> list = driver.findElements(By.xpath("//label[contains(normalize-space(),'Option')]"));
        System.out.println("Size : " + list.size());
        for (WebElement element : list) {
            if (element.getText().contains("Option 2") || element.getText().contains("Option 4")) {
                WebElement checkbox = element.findElement(By.xpath("//descendant::input"));
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
                System.out.println("Status " + element.getText() + checkbox.isSelected());
            }
        }
    }

    @AfterTest
    public void closeChrome() {
        driver.close();
    }
}
