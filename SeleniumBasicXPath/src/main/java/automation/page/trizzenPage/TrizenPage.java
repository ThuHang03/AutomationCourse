package automation.page.trizzenPage;

import automation.common.CommonBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrizenPage extends CommonBase {

    WebDriver driver;

    @FindBy(xpath = "//div[@id='one-way']//input[@name='daterange-single']")
    WebElement textDepartingDate;

    @FindBy(xpath = "//div[@id='one-way']//label[text()='Passengers']//following-sibling::div//a[@data-toggle='dropdown']")
    WebElement dropPassengers;

    @FindBy(xpath = "//div[@id='one-way']//label[text()='Adults']//following-sibling::div//i[@class='la la-plus']")
    WebElement addAdult;

    public TrizenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void handleDateTimeAndDropdownList(){
        //TODO : remove read only
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('readonly')",textDepartingDate);
        textDepartingDate.clear();
        textDepartingDate.sendKeys("14012024");
        textDepartingDate.sendKeys(Keys.TAB);

        pausePage(1000);
        dropPassengers.click();
        addAdult.click();
    }
}
