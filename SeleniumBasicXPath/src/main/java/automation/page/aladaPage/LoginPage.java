package automation.page.aladaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HomePage{
    private WebDriver driver;

    @FindBy(id = "txtLoginUsername")
    WebElement text_email;

    @FindBy(id = "txtLoginPassword")
    WebElement text_pass;

    @FindBy(xpath = "//button[@type='submit' and text()='ĐĂNG NHẬP']")
    WebElement btn_login;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginFunction(String mail, String pass) {
        text_email.sendKeys(mail);
        text_pass.sendKeys(pass);
        btn_login.click();
    }
}
