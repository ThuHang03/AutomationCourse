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

    @FindBy(xpath = "//div[@id='one-way']//label[text()='Flying from']//following-sibling::div//input[@placeholder='City or airport']")
    WebElement textBoxFlyingFrom;

    @FindBy(xpath = "//div[@id='one-way']//label[text()='Flying to']//following-sibling::div//input[@placeholder='City or airport']")
    WebElement textBoxFlyingTo;

    @FindBy(xpath = "//div[@id='one-way']//input[@name='daterange-single']")
    WebElement textDepartingDate;

    @FindBy(xpath = "//div[@id='one-way']//label[text()='Passengers']//following-sibling::div//a[@data-toggle='dropdown']")
    WebElement dropPassengers;

    @FindBy(xpath = "//div[@id='one-way']//label[text()='Adults']//following-sibling::div//i[@class='la la-plus']")
    WebElement addAdult;

    @FindBy(xpath = "//div[@id='one-way']//button[@title='Economy']")
    WebElement dropdownCoach;

    @FindBy(xpath = "//a[@id='bs-select-3-1']")
    WebElement valueCoach;

    @FindBy(xpath = "//div[@id='one-way']//a[text()='Search Now']")
    WebElement btnSearchNow;

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
    }

    public void insertFlying(String flyingFrom , String flyingTo){
        textBoxFlyingFrom.sendKeys(flyingFrom);
        textBoxFlyingTo.sendKeys(flyingTo);
    }

    public void choosePassengers(){
        dropPassengers.click();
        addAdult.click();

    }

    public void chooseCoach(){
        dropdownCoach.click();
        valueCoach.click();
    }

    public void searchFlights(String flyingFrom , String flyingTo){
        insertFlying(flyingFrom,flyingTo);
        handleDateTimeAndDropdownList();
        pause(1000);
        choosePassengers();
        chooseCoach();
        btnSearchNow.click();
    }
}
