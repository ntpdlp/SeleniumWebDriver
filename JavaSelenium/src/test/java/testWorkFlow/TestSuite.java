package testWorkFlow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestSuite {
    private WebDriver driver;
    protected FormPage formpage;

    public TestSuite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/form");
    }

    @After
    public void teardown(){
        System.out.println("test done");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void TC_01_CreateAccount(){
        formpage = new FormPage(driver);
        formpage.enterForm(driver);

        String submittedMsg = ConfirmationPage.getSubmittedMessage(driver);
        assertEquals("The form was successfully submitted!",submittedMsg);
    }
}
