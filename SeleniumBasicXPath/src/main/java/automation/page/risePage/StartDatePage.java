package automation.page.risePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.LocalDate;

enum FilterStartDate {
    this_month, last_month, this_year, last_year, next_7_days, next_month
}

public class StartDatePage {
    private WebDriver driver;

//    public By leftMenu_Projects = By.xpath("//span[@class='menu-text ' and text()='Projects']");
//    public By btn_showMoreFilter = By.xpath("//button[@class='btn btn-default show-filter-form-button']");
//    public By dropdown_startDate = By.xpath("//div[@class='dropdown-toggle' and text()='Start date']");
//    public By optional_thisMonth = By.xpath("//a[@data-range='this_month']");
//    public By getDateInTable = By.xpath("//table[@id='project-table']//tbody//tr//td[5]"); //get text -> 16-12-2023

    @FindBy(xpath = "//span[@class='menu-text ' and text()='Projects']")
    WebElement projectsMenu;

    @FindBy(xpath = "//button[@class='btn btn-default show-filter-form-button']")
    WebElement showMoreFiltersButton;

    @FindBy(xpath = "//div[@class='dropdown-toggle' and text()='Start date']")
    WebElement startDateDropdown;

    @FindBy(xpath = "//a[@data-range='this_month']")
    WebElement thisMonthOption;

    @FindBy(xpath = "//table[@id='project-table']//tbody//tr//td[5]")
    WebElement dataDateInTable;


    public StartDatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void filterThisMonth() {
        //click -> leftMenu_Projects
        projectsMenu.click();
        //click -> btn_showMoreFilter
        showMoreFiltersButton.click();
        //click -> dropdown_startDate
        startDateDropdown.click();
        //chooseFilter(FilterStartDate)
        chooseFilter(FilterStartDate.this_month);
    }

    public void chooseFilter(FilterStartDate filterStartDate) {
        LocalDate currentDate = LocalDate.now();
        switch (filterStartDate) {
            case this_month:
                //click -> //a[@data-range='this_month']
                thisMonthOption.click();
                //get curren month
                //cut month in getDateInTable
                checkDate(String dateActual, currentDate.getMonth());

                break;
            case last_month:
                // Handle last_month case
                break;
            case this_year:
                // Handle this_year case
                break;
            case last_year:
                // Handle last_year case
                break;
            case next_7_days:
                // Handle next_7_days case
                break;
            case next_month:
                // Handle next_month case
                break;
            default:
                // Handle default case (optional)
                break;
        }
    }

    public void checkDate(String dateActual, String dateExpected) {
        Assert.assertEquals(dateActual, dateExpected);
    }

    public String getDate(String date,int index){
        return date.split("-")[index].trim();
    }
}
