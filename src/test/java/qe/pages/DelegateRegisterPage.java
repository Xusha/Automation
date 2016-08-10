package qe.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://winda-stg.steel.kiwi/register/delegate/")
public class DelegateRegisterPage extends PageObject {

    @FindBy(id="id_first_name")
    private WebElementFacade firstName;

    @FindBy(id="id_last_name")
    private WebElementFacade secondName;

    @FindBy(id="id_email")
    private WebElementFacade email;

    @FindBy(xpath="//*[@id='id_terms']/following-sibling::span")
    private WebElementFacade terms;

    @FindBy(xpath="//*[@id='id_policy']/following-sibling::span")
    private WebElementFacade privacy;

    @FindBy(xpath="html/body/main/div/div/form/div[2]/button")
    private WebElementFacade register;

    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterSecondName(String secondName) {
        this.secondName.sendKeys(secondName);
    }

    public void enterEmail(String email) {
        this.email.sendKeys(email);
    }

    public void tickTerms() {
            this.terms.click();
    }

    public void tickPrivacy() {
        this.privacy.click();
    }

    public void clickRegister() {
        this.register.click();
    }

}
