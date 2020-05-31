package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class RadioButton {
    WebDriver driver;

    public RadioButton(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/radiobutton");
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void TC_Radio() throws InterruptedException {
        WebElement radioButton1 = driver.findElement(By.cssSelector("#radio-button-1")); //#id
        radioButton1.click();
        Thread.sleep(1000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(1000);

        //body > div > div:nth-child(8) > input
        ///html/body/div/div[3]/input
        WebElement radioButton3 = driver.findElement(By.xpath("html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(1000);

    }
}
