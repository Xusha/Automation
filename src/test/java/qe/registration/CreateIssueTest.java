package qe.registration;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qe.steps.serenity.DashboardUser;
import qe.steps.serenity.LoginPageUser;

@RunWith(SerenityRunner.class)
public class CreateIssueTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginPageUser loginPageUser;

    @Steps
    public DashboardUser dashboardUser;

    @Test
    public  void  create_issue(){
        dashboardUser.cliksOnCreateNewIssue();
        dashboardUser.enterIssueType("Bug");
        dashboardUser.enterSummary("Ksusha summary");
        dashboardUser.clicksOnSubmit();
    }

    @Before
    public void setUp(){
        successfully_login();

    }

    public  void  successfully_login(){
        loginPageUser.goToLoginPage();
        loginPageUser.enterUserName("xusha.losen");
        loginPageUser.enterUserPassword("xusha.losen");
        loginPageUser.clickLogin();
        dashboardUser.verifyIsOnDashBoardPage();
    }

}
