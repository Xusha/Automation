package qe.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import qe.pages.GmailPage;


public class GmailPageUser extends ScenarioSteps {

    GmailPage gmailPage;

    @Step
    public void goesToGmailPage(){
        gmailPage.open();
    }

    @Step
    public void entersUsername(String username) {
        gmailPage.enterUsername(username);
    }

    @Step
    public void clicksNext() {
        gmailPage.clickNext();
    }

    @Step
    public void entersPassword(String password) {
        gmailPage.enterPassword(password);
    }

    @Step
    public void clicksSignIn() {
        gmailPage.clickSignIn();
    }

    @Step
    public void opensEmail() {
        gmailPage.clickOpenEmail();
    }

    @Step
    public void clicksOnLink() {
        gmailPage.clickOnLink();
    }

    @Step
    public String getsActivationLink() {
        return gmailPage.getActivationLink();
    }

}
