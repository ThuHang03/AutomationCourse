package automation.page.aladaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;

    @FindBy(xpath = "//button[text()='ĐĂNG KÝ' and @type='submit']")
    WebElement btn_register;

    @FindBy(id = "txtFirstname")
    WebElement text_name;

    @FindBy(id = "txtEmail")
    WebElement text_email;

    @FindBy(id = "txtCEmail")
    WebElement text_emailAgain;

    @FindBy(id = "txtPassword")
    WebElement text_pass;

    @FindBy(id = "txtCPassword")
    WebElement text_passAgain;

    @FindBy(id = "txtPhone")
    WebElement text_phone;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void registerFunction(String name, String email, String pass, String phone) {
        text_name.sendKeys(name);
        text_email.sendKeys(email);
        text_emailAgain.sendKeys(email);
        text_pass.sendKeys(pass);
        text_passAgain.sendKeys(pass);
        text_phone.sendKeys(phone);
        btn_register.click();
    }
}
