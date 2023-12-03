package automation.constant.risePage;

import org.openqa.selenium.By;

public class CT_Account {
    public static String RISE_URL = "https://rise.fairsketch.com/signin";
    public static By TEXTBOX_EMAIL = By.id("email");
    public static By TEXTBOX_PASS = By.id("password");
    public static By BTN_SIGNING = By.xpath("//button[normalize-space()='Sign in']");
    public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard']");
    public static By STATUS_LOGIN = By.xpath("//div[@role='alert']");
    public static By USER_DROPDOWN = By.id("user-dropdown");
    public static By BTN_LOGOUT = By.xpath("//a[normalize-space()='Sign Out']");
}
