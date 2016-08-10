package qe.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("http://soft.it-hillel.com.ua:8080/secure/Dashboard.jspa")
public class CreateIssuePage extends PageObject {

    @FindBy(id="issuetype-field")
    private WebElementFacade issueType;

    @FindBy(id="summary")
    private WebElementFacade summary;

    @FindBy(id="create-issue-submit")
    private WebElementFacade createIssue;


    public void enterIssueType(String issueType) {
        this.issueType.type(issueType).sendKeys(Keys.RETURN);
    }

    public void enterIssueSummary(String issueSummary) {
        this.summary.type(issueSummary);
    }

    public void clickOnCreateIssue () {
        createIssue.click();
    }


}
