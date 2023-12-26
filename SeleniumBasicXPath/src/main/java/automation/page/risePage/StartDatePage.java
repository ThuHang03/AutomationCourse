package automation.page.risePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class StartDatePage {
    private WebDriver driver;

    //    public By leftMenu_Projects = By.xpath("//span[@class='menu-text ' and text()='Projects']");
//    public By btn_showMoreFilter = By.xpath("//button[@class='btn btn-default show-filter-form-button']");
//    public By dropdown_startDate = By.xpath("//div[@class='dropdown-toggle' and text()='Start date']");
//    public By optional_thisMonth = By.xpath("//a[@data-range='this_month']");
    public By getDateInTable = By.xpath("//table[@id='project-table']//tbody//tr//td[5]"); //get text -> 16-12-2023

    @FindBy(xpath = "//span[@class='menu-text ' and text()='Projects']")
    WebElement projectsMenu;

    @FindBy(xpath = "//button[@class='btn btn-default show-filter-form-button']")
    WebElement showMoreFiltersButton;

    @FindBy(xpath = "//div[@class='dropdown-toggle' and text()='Start date']")
    WebElement startDateDropdown;

    @FindBy(xpath = "//a[@data-range='this_month']")
    WebElement thisMonthOption;
    @FindBy(xpath = "//a[@data-range='last_month']")
    WebElement lastMonthOption;
    @FindBy(xpath = "//a[@data-range='this_year']")
    WebElement thisYearOption;
    @FindBy(xpath = "//a[@data-range='last_year']")
    WebElement lastYearOption;
    @FindBy(xpath = "//a[@data-range='next_month']")
    WebElement nextMonthOption;
    @FindBy(xpath = "//a[@data-range='next_7_days']")
    WebElement next7dayOption;

//    @FindBy(xpath = "//table[@id='project-table']//tbody//tr//td[5]")
//    WebElement dataDateInTable;


    public StartDatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void actionOpenFilter(FilterStartDate filterStartDate) {
        //click -> leftMenu : Projects
        projectsMenu.click();
        //click -> btn : (+) showMoreFilter
        showMoreFiltersButton.click();
        //click -> dropdown : startDate
        startDateDropdown.click();
        //chooseFilter(FilterStartDate)
        chooseFilter(filterStartDate);
    }

    public void chooseFilter(FilterStartDate filterStartDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        switch (filterStartDate) {
            case last_month:
                lastMonthOption.click();
                break;
            case this_year:
                thisYearOption.click();
                break;
            case last_year:
                lastYearOption.click();
                break;
            case next_7_days:
                next7dayOption.click();
                break;
            case next_month:
                nextMonthOption.click();
                break;
            default:
                thisMonthOption.click();
                break;
        }
        //check date
        List<WebElement> dataStartDate = driver.findElements(getDateInTable);

        if (!dataStartDate.isEmpty()) {
            for (WebElement s : dataStartDate
            ) {
                System.out.println("  check " + checkDate(s.getText(), filterStartDate));
//                Assert.assertTrue(checkDate(s.getText(), filterStartDate));
            }
        } else {
            System.out.println("There is no data in option");
        }
    }

    public boolean checkDate(String dateString, FilterStartDate filterStartDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dateActual = LocalDate.parse(dateString, formatter);
            System.out.print(dateActual);

            LocalDate currentDate = LocalDate.now();

            switch (filterStartDate) {
                case this_month:
                    return dateActual.getMonth() == currentDate.getMonth() && dateActual.getYear() == currentDate.getYear();
                case last_month:
                    return dateActual.getMonth() == currentDate.minusMonths(1).getMonth() && dateActual.getYear() == currentDate.getYear();
                case this_year:
                    return dateActual.getYear() == currentDate.getYear();
                case last_year:
                    return dateActual.getYear() == currentDate.minusYears(1).getYear();
                case next_7_days:
                    return !dateActual.isBefore(currentDate) && !dateActual.isAfter(currentDate.plusDays(7));
                case next_month:
                    return dateActual.getMonth() == currentDate.getMonth().plus(1) && dateActual.getYear() == currentDate.getYear();
                default:
                    return dateActual.getMonth() == currentDate.getMonth() && dateActual.getYear() == currentDate.getYear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
