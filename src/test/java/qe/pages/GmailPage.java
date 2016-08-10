package qe.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://gmail.com/")
public class GmailPage extends PageObject {

    @FindBy(id="Email")
    private WebElementFacade username;

    @FindBy(id="next")
    private WebElementFacade next;

    @FindBy(id="Passwd")
    private WebElementFacade password;

    @FindBy(id="signIn")
    private WebElementFacade signIn;

    @FindBy(xpath="//div[@class = 'y6']/span[contains(., 'WINDA Delegate Account Activation')]")
    private WebElementFacade openEmail;

    @FindBy(partialLinkText="http://winda-stg.steel.kiwi/register/")
    private WebElementFacade registerLink;

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void clickNext() {this.next.click();}

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickSignIn() {
        this.signIn.click();
    }

    public void clickOpenEmail() {
        this.openEmail.click();
    }

    public String  getActivationLink() {
        String linkLocatin = registerLink.getAttribute("href");
        return linkLocatin;
    }

    public void clickOnLink() {
        this.registerLink.click();
           }


}
