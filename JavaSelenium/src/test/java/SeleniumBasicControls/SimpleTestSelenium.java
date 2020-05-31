package SeleniumBasicControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class SimpleTestSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("http://wwww.google.com");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("selenium");
        search.submit();

        driver.close();
    }
}
