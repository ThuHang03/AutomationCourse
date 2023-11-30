package automation.page.risePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Factory {

    private WebDriver driver;

    @FindBy(id = "email")
    WebElement textEmail;

    @FindBy(id = "password")
    WebElement textPass;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement btn_SignIn;

    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement btn_LogOut;

    @FindBy(id = "user-dropdown")
    WebElement linkAvatar;

    public LoginPage_Factory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginFunction(String email, String pass) {
        textEmail.clear();
        textEmail.sendKeys(email);

        textPass.clear();
        textPass.sendKeys(pass);

        btn_SignIn.click();
    }

    public void logoutFunction(String email, String pass) {
        if (textEmail.isDisplayed()) {
            loginFunction(email, pass);
        }

        linkAvatar.click();
        btn_LogOut.click();
    }
}
