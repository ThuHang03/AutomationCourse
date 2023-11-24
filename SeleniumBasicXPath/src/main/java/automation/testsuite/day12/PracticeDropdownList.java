package automation.testsuite.day12;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeDropdownList extends CommonBase {
    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    @Test
    public void runTest() {
        Select select1 = new Select(driver.findElement(By.id("select-demo")));
        System.out.println(select1.isMultiple());
        select1.selectByValue("Friday");
        System.out.println(select1.getFirstSelectedOption().getText());

        Select select2 = new Select(driver.findElement(By.id("multi-select")));
        if (select2.isMultiple()) {
            select2.selectByIndex(1);
            select2.selectByVisibleText("Washington");
            select2.selectByValue("Ohio");
        }
        select2.getAllSelectedOptions().forEach(e -> {
            System.out.println(e.getAttribute("value"));
        });
        System.out.println(select2.getFirstSelectedOption().getText());

    }
}
