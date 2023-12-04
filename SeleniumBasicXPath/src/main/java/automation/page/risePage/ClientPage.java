package automation.page.risePage;

import automation.common.CommonBase;
import automation.page.trizzenPage.Client;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(id = "address")
    WebElement textBoxAddress;

    @FindBy(id = "city")
    WebElement textBoxCity;

    @FindBy(id = "state")
    WebElement textBoxState;

    @FindBy(id = "zip")
    WebElement textBoxZip;

    @FindBy(id = "country")
    WebElement textBoxCountry;

    @FindBy(id = "phone")
    WebElement textBoxPhone;

    @FindBy(id = "website")
    WebElement textBoxWebsite;

    @FindBy(id = "vat_number")
    WebElement textBoxVAT;

    @FindBy(id = "gst_number")
    WebElement textBoxGST;

    @FindBy(id = "s2id_autogen2")
    WebElement dropdownBoxClientGroup;

    @FindBy(xpath = "//div[@id='select2-drop']//li[2]")
    WebElement valueClientGroup; //VIP

    @FindBy(id = "select2-chosen-1")
    WebElement dropdownCurrency;

    @FindBy(xpath = "//ul[@id='select2-results-1']//li[5]")
    WebElement valueCurrency; //AMD

    @FindBy(id = "currency_symbol")
    WebElement textBoxCurrencySymbol;

    @FindBy(id = "s2id_autogen4")
    WebElement dropDownLabels;

    @FindBy(xpath = "//div[@id='select2-drop']//li[5]")
    WebElement valueLabels; //corporate

    @FindBy(id = "disable_online_payment")
    WebElement checkboxDisableOnlinePayment;

    public ClientPage(WebDriver driver) {
        this.driver = driver;
        //TODO nullPointer
        PageFactory.initElements(driver, this);
    }

    public void addClientFunction(Client client) {
        //Pre-condition : Login
        eventClickClientsInDashboardThenClickAddClient();
        addDataClient(client);
        searchNewValueInClientsTab(client.getCompanyName());
    }

    public void addDataClient(Client client) {
         radioPerson.click();
        textClientName.sendKeys(client.getCompanyName());
        ownerDropdowns.click(); //Sara Ann
        itemOwner.click();
        textBoxAddress.sendKeys(client.getAddress());
        textBoxCity.sendKeys(client.getCity());
        textBoxState.sendKeys(client.getState());
        textBoxZip.sendKeys(client.getZip());
        textBoxCountry.sendKeys(client.getCountry());
        textBoxPhone.sendKeys(client.getPhone());
        textBoxWebsite.sendKeys(client.getWebsite());
        textBoxVAT.sendKeys(client.getVAT());
        textBoxGST.sendKeys(client.getGST());
        dropdownBoxClientGroup.click();
        pausePage(1000);
        valueClientGroup.click();
        dropdownCurrency.click();
        pausePage(1000);
        valueCurrency.click();
        textBoxCurrencySymbol.sendKeys(client.getCurrencySymbol());
        dropDownLabels.click();
        pausePage(1000);
        valueLabels.click();
        checkboxDisableOnlinePayment.click();
        pausePage(1000);
        btnSave.click();
    }

    public void eventClickClientsInDashboardThenClickAddClient() {
        clientLinks.click();
        btnAddClient.click();
    }

    public void searchNewValueInClientsTab(String companyName) {
        //TODO ElementClickInterceptedException
//        clientsTab.click();//ElementClickInterceptedException
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clientsTab);

        pausePage(2000);
        textBoxSearch.sendKeys(companyName);

    }
}
