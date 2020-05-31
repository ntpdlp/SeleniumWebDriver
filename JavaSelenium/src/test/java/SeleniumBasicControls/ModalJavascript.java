package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class ModalJavascript {

    protected WebDriver driver;

    public ModalJavascript(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/modal");
    }

    @After
    public void teardown(){
        System.out.println("test done");
        driver.quit();
    }

    @Test
    public void TC_UseJavaScriptModal() throws InterruptedException {
        WebElement btnModal = driver.findElement(By.id("modal-button"));
        btnModal.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement closeButton = driver.findElement(By.id("close-button"));
        Thread.sleep(1000);
        jse.executeScript("arguments[0].click();",closeButton);
    }
}
