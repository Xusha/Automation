package qe.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("http://winda-stg.steel.kiwi/login/")
public class LoginPage extends PageObject {

    @FindBy(id="login-form-username")
    private WebElementFacade userName;

    @FindBy(id="login-form-password")
    private WebElementFacade password;

    @FindBy(id="login-form-submit")
    private WebElementFacade login;

    public void enterUserName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void enterUserPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickLogin() {
        this.login.click();
    }

}
