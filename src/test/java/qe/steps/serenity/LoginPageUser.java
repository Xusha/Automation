package qe.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import qe.pages.LoginPage;


public class LoginPageUser extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void goToLoginPage(){
        loginPage.open();
    }

    @Step
    public void enterUserName(String userName) {
        loginPage.enterUserName(userName);
    }

    @Step
    public  void enterUserPassword(String password){
        loginPage.enterUserPassword(password);
    }

    @Step
    public  void  clickLogin() {
        loginPage.clickLogin();
    }

}
