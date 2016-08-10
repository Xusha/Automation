package qe.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import qe.pages.DelegateRegisterPage;


public class DelegateRegisterPageUser extends ScenarioSteps {

    DelegateRegisterPage delegateRegisterPage;

    @Step
    public void goToDelegateRegisterPage(){
        delegateRegisterPage.open();
    }

    @Step
    public void entersFirstName(String firstName) {
        delegateRegisterPage.enterFirstName(firstName);
    }

    @Step
    public void entersSecondName(String secondtName) {
        delegateRegisterPage.enterSecondName(secondtName);
    }

    @Step
    public void entersEmail(String email) {
        delegateRegisterPage.enterEmail(email);
    }

    @Step
    public  void  ticksPrivacy() {
        delegateRegisterPage.tickPrivacy();
    }


    @Step
    public  void  ticksTerms() {
        delegateRegisterPage.tickTerms();
    }

    @Step
    public  void  clicksRegister() {
        delegateRegisterPage.clickRegister();
    }

}
