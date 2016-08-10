package qe.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://winda-stg.steel.kiwi/register/training-provider/")
public class TraidingProviderRegisterPage extends PageObject {

    @FindBy(id="")
    private WebElementFacade firstName;

    @FindBy(id="")
    private WebElementFacade secondName;

    @FindBy(id="")
    private WebElementFacade workEmail;

    @FindBy(id="")
    private WebElementFacade workPnoneNumber;

    @FindBy(id="")
    private WebElementFacade trainingProviderName;

    @FindBy(id="")
    private WebElementFacade streetLine1;

    @FindBy(id="")
    private WebElementFacade streetLine2;

    @FindBy(id="")
    private WebElementFacade city;

    @FindBy(id="")
    private WebElementFacade postalCode;

    @FindBy(id="")
    private WebElementFacade country;

    @FindBy(id="")
    private WebElementFacade chooseFile;

    @FindBy(id="")
    private WebElementFacade certificateNumber;

    @FindBy(id="")
    private WebElementFacade validFrom;

    @FindBy(id="")
    private WebElementFacade validUntil;

    @FindBy(id="")
    private WebElementFacade course;

    @FindBy(id="")
    private WebElementFacade terms;

    @FindBy(id="")
    private WebElementFacade privacy;

    @FindBy(id="")
    private WebElementFacade levelAgreement;

    @FindBy(id="")
    private WebElementFacade register;


    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterSecondName(String secondName) {
        this.secondName.sendKeys(secondName);
    }

    public void enterEmail(String workEmail) {
        this.workEmail.sendKeys(workEmail);
    }

    public void enterWorkPnoneNumber(String workPnoneNumber) {
        this.workEmail.sendKeys(workPnoneNumber);
    }

    public void enterTrainingProviderName(String trainingProviderName) {
        this.trainingProviderName.sendKeys(trainingProviderName);
    }

    public void enterStreetLine1(String streetLine1) {
        this.streetLine1.sendKeys(streetLine1);
    }

    public void enterStreetLine2(String streetLine2) {
        this.streetLine2.sendKeys(streetLine2);
    }

    public void enterCity(String city) {
        this.city.sendKeys(city);
    }

    public void enterPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
    }

    public void enterCountry(String country) {
        this.country.sendKeys(country);
    }

    public void enterChooseFile(String absolutePathToMyFile) {
        this.country.sendKeys(absolutePathToMyFile);
    }

    public void tickTerms() {
       this.terms.click();
    }

    public void tickPrivacy() {
        this.privacy.click();
    }

    public void tickLevelAgreement() {
        this.privacy.click();
    }

    public void clickRegister() {
        this.register.click();
    }

}
