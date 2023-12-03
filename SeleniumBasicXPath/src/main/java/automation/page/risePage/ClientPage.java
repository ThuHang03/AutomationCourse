package automation.page.risePage;

import automation.common.CommonBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage extends CommonBase {
    WebDriver driver;

    @FindBy(xpath = "//span[text()='Clients']")
    WebElement clientLinks;

    @FindBy(xpath = "//a[@data-title='Add client']")
    WebElement btnAddClient;

    @FindBy(id = "type_person")
    WebElement radioPerson;

    @FindBy(id = "company_name")
    WebElement textClientName;

    @FindBy(xpath = "//span[@id='select2-chosen-3']")
    WebElement ownerDropdowns;

    @FindBy(id = "select2-result-label-7")
    WebElement itemOwner; //senKeys : "Sara Ann"

    @FindBy(xpath = "//button[@type='submit' and normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(xpath = "//a[text()='Clients']")
    WebElement clientsTab;


    @FindBy(xpath = "//input[@type='search']")
    WebElement textBoxSearch;


    public ClientPage(WebDriver driver) {
        this.driver = driver;
        //TODO nullPointer
        PageFactory.initElements(driver, this);
    }

    public void addClientFunction(String companyName, String owner) {
        //Pre-condition : Login
        clientLinks.click();
        btnAddClient.click();

        radioPerson.click();
        textClientName.sendKeys(companyName);

        ownerDropdowns.click();
        itemOwner.click();

        btnSave.click();
        //TODO ElementClickInterceptedException
//        clientsTab.click();//ElementClickInterceptedException
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clientsTab);

        pausePage(2000);
        textBoxSearch.sendKeys(companyName);

    }
}
