package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class DatePickerControl {
    private WebDriver driver;

    public DatePickerControl(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/datepicker");
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void TC_01_DatePicker() throws InterruptedException {
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("06/30/2020");
        datePicker.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }
}
