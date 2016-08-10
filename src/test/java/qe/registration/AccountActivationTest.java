package qe.registration;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qe.steps.serenity.AccountActivationPageUser;

import java.util.concurrent.TimeUnit;


@RunWith(SerenityRunner.class)
public class AccountActivationTest {

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/oksana/Automation/chromedriver");
        webdriver = new ChromeDriver();
//        GmailActivationTest gmailActivationTest;
//        String accountActivationLink = gmailActivationTest.success_account_activation();
//        webdriver.get("http://winda-stg.steel.kiwi/register/delegate-confirm-email/d1ad0e05-4178-47c3-a1a8-5fa79bed412f/");
       }

    @Steps
    public AccountActivationPageUser accountActivationPageUser;

    @Steps
    public GmailActivationTest gmailActivationTest;
  //  public String activationLink = gmailActivationTest.success_account_activation();



    @Test
    public  void  success_account_activation(){
   //     webdriver.get(activationLink);
        //accountActivationPageUser.goesToAccountActivationPage();
        webdriver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
        accountActivationPageUser.entersFirstPassword("test1234");
        accountActivationPageUser.entersSecondPassword("test1234");
        accountActivationPageUser.clicksActivate();
        webdriver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
    }
}
