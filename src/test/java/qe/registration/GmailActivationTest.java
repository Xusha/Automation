package qe.registration;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qe.steps.serenity.AccountActivationPageUser;
import qe.steps.serenity.GmailPageUser;

import java.util.concurrent.TimeUnit;


@RunWith(SerenityRunner.class)
public class GmailActivationTest {

//    @Managed(uniqueSession = true)
//    public WebDriver webdriver;
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/oksana/Automation/chromedriver");
        webdriver = new ChromeDriver();
    }

    @Steps
    public GmailPageUser gmailPageUser;
    public String accountActivationLink;

    @Steps
    public AccountActivationPageUser accountActivationPageUser;

    @Test
    public  void  success_account_activation(){
        gmailPageUser.goesToGmailPage();
        gmailPageUser.entersUsername("testuser6tesuser6test0user6tes@gmail.com");
        gmailPageUser.clicksNext();
        gmailPageUser.entersPassword("steelkiwi12");
        gmailPageUser.clicksSignIn();
        webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        gmailPageUser.opensEmail();
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        accountActivationLink = gmailPageUser.getsActivationLink();
        System.out.println(accountActivationLink);
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        gmailPageUser.clicksOnLink();
        webdriver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

        webdriver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
        webdriver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

        webdriver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
        accountActivationPageUser.entersFirstPassword("test1234");
        accountActivationPageUser.entersSecondPassword("test1234");
        accountActivationPageUser.clicksActivate();
        webdriver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
    }

}
