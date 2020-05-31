package SeleniumBasicControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement fullName = driver.findElement(By.id("name"));
        WebElement button = driver.findElement(By.id("button"));

        fullName.sendKeys("helloSenenium");
        button.click();

        driver.quit();

    }
}
