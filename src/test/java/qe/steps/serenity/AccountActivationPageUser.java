package qe.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import qe.pages.AccountActivationPage;


public class AccountActivationPageUser extends ScenarioSteps {

    AccountActivationPage accountActivationPage;
//
//    @Step
//    public void goesToAccountActivationPage(){
//        accountActivationPage.open();
//    }

    @Step
    public void entersFirstPassword(String firstPassword) {
        accountActivationPage.enterFirstPassword(firstPassword);
    }

    @Step
    public void entersSecondPassword(String secondPassword) {
        accountActivationPage.enterSecondPassword(secondPassword);
    }

    @Step
    public  void  clicksActivate() {
        accountActivationPage.clickActivate();
    }

}
