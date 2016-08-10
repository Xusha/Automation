package qe.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

//@DefaultUrl("http://winda-stg.steel.kiwi/register/delegate-confirm-email/d1ad0e05-4178-47c3-a1a8-5fa79bed412f/")
public class AccountActivationPage extends PageObject {

    @FindBy(id="id_password1")
    private WebElementFacade firstPassword;

    @FindBy(id="id_password2")
    private WebElementFacade secondPassword;

    @FindBy(xpath="//button[@type='submit'  and contains(text(), 'Activate and Login')]")
    private WebElementFacade activate;

    public void enterFirstPassword(String firstPassword) {
        this.firstPassword.sendKeys(firstPassword);
    }

    public void enterSecondPassword(String secondPassword) {
        this.secondPassword.sendKeys(secondPassword);
    }

    public void clickActivate() {
        this.activate.click();
    }

}
