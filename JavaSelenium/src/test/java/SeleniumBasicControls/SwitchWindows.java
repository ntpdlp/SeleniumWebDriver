package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;


public class SwitchWindows {


    protected WebDriver driver;

    public SwitchWindows(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/switch-window");
    }

    @After
    public void teardown(){
        System.out.println("test done!");
        driver.quit();
    }

    @Test
    public void openNewWindowTab() throws InterruptedException {
        WebElement openNewTab = driver.findElement(By.id("new-tab-button"));
        openNewTab.click();

        String currentWindow = driver.getWindowHandle();
        //switch windows
        for(String handle:driver.getWindowHandles()){
            driver.switchTo().window(handle);
            Thread.sleep(500);
            System.out.println("staying on window: " + handle);
        }
        //back to origin windows
        driver.switchTo().window(currentWindow);

    }

    @Test
    public void openAlertDialog() throws InterruptedException {
        WebElement openAlert = driver.findElement(By.id("alert-button"));
        openAlert.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);

    }

}
