package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utils.Constant;

public class PageScroll {
    protected WebDriver driver;

    public PageScroll(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/scroll");
    }

    @After
    public void teardown(){
        System.out.println("test done!");
        driver.quit();
    }

    @Test
    public void TestPageWithScroll() throws InterruptedException {
        WebElement name = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("PhuongNguyen");
        actions.moveToElement(date);
        date.sendKeys("05/12/1975");

    }
}
