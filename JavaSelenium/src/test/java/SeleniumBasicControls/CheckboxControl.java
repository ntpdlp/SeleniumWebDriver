package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class CheckboxControl {
    private WebDriver driver;

    public CheckboxControl(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void TC_01_Checkbox() throws InterruptedException {
        WebElement checkbox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        checkbox1.click();
        Thread.sleep(1000);

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        Thread.sleep(1000);

        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();
        Thread.sleep(1000);
    }
}
