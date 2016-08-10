package qe.registration;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qe.steps.serenity.DelegateRegisterPageUser;

import java.util.concurrent.TimeUnit;


@RunWith(SerenityRunner.class)
public class DelegateRegisterTest {

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/oksana/Automation/chromedriver");
        webdriver = new ChromeDriver();
    }

    @Steps
    public DelegateRegisterPageUser delegateRegisterPageUser;

    @Test
    public  void  success_create_delegateUser(){
        delegateRegisterPageUser.goToDelegateRegisterPage();
        delegateRegisterPageUser.entersFirstName("FirstName");
        delegateRegisterPageUser.entersSecondName("SecondName");
        delegateRegisterPageUser.entersEmail("testuser6tesuser6test0user6tes@gmail.com");

        webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        delegateRegisterPageUser.ticksTerms();
        delegateRegisterPageUser.ticksPrivacy();
        delegateRegisterPageUser.clicksRegister();

        webdriver.close();
    }
}
