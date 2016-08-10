package qe.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import qe.pages.CreateIssuePage;
import qe.pages.DashboardPage;
import qe.pages.HeaderPage;

import static org.junit.Assert.assertEquals;

public class DashboardUser extends ScenarioSteps {

    DashboardPage dashboardPage;

    HeaderPage headerPage;

    CreateIssuePage createIssuePage;

    @Step
    public void verifyIsOnDashBoardPage(){
      assertEquals(dashboardPage.isOnDashboardPage(), "System Dashboard");

    }

    @Step
    public void  cliksOnCreateNewIssue() {
        headerPage.clickCreate();
    }

    @Step
    public  void  enterIssueType(String issueType){
        createIssuePage.enterIssueType(issueType);
    }

    @Step
    public void  enterSummary(String issueSummary){
        createIssuePage.enterIssueSummary(issueSummary);
    }

    @Step
    public void  clicksOnSubmit() {
        createIssuePage.clickOnCreateIssue();
    }
}
