package automation.page.aladaPage;

import automation.common.CommonBase;
import automation.constant.alada.CT_Account;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonBase {
    @FindBy(xpath = "//div[@class='avatar2']")
    WebElement avatar;

    @FindBy(xpath = "//a[contains(text(),'Chỉnh sửa thông tin')]")
    WebElement editInformation;

    @FindBy(id = "txtpassword")
    WebElement text_passwordPresent;

    @FindBy(id = "txtnewpass")
    WebElement text_newPassword;

    @FindBy(id = "txtrenewpass")
    WebElement text_passwordAgain;

    @FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
    WebElement btn_savePassword;

    @FindBy(xpath = "//a[text()='Thoát']")
    WebElement btn_logout;

    public boolean IsHomePage() {
        return isElementPresent(avatar);
    }

    public void openEditInformationUser() {
        avatar.click();
        editInformation.click();
    }

    public void changePass(String newPassword) {

        openEditInformationUser();

        text_passwordPresent.sendKeys(CT_Account.pass);
        text_newPassword.sendKeys(newPassword);
        CT_Account.pass = newPassword;
        text_passwordAgain.sendKeys(CT_Account.pass);

        btn_savePassword.click();
    }

    public void logout() {
        avatar.click();
        btn_logout.click();
    }
}
