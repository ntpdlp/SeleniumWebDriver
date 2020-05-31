package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class AutoCompleteFields {
    private WebDriver driver;

    public AutoCompleteFields(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setUp(){
        driver.get("https://formy-project.herokuapp.com/autocomplete");
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void testAutoCompleteField() throws InterruptedException {
        WebElement  autocompleteField = driver.findElement(By.id("autocomplete"));
        autocompleteField.sendKeys("2000 N Court Street");

        //instead of using Thread.sleep(1000);
        // Solution1: implicit wait
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//        WebElement pac = driver.findElement(By.className("pac-item"));
//        // Solution2: explicit wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement pac2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));


        pac2.click();

        assertThat(driver.getTitle(),containsString("Formy"));
        Thread.sleep(2000);

    }

}
