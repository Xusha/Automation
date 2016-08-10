package qe.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://soft.it-hillel.com.ua:8080/secure/Dashboard.jspa")
public class DashboardPage extends PageObject {

    @FindBy(xpath = "//*[@class='aui-page-header-main']//h1")
    private WebElementFacade pageHeader;

    public  String isOnDashboardPage(){
        return  pageHeader.getText();
    }



}
