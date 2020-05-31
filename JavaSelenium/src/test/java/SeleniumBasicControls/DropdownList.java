package SeleniumBasicControls;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

public class DropdownList {
    private WebDriver driver;

    public DropdownList(){
        System.setProperty("webdriver.chrome.driver", Constant.DRIVE_PATH);
        driver = new ChromeDriver();
    }

    @Before
    public void setup(){
        driver.get("https://formy-project.herokuapp.com/dropdown");
    }

    @After
    public void teardown(){
        System.out.println("test done");
        driver.quit();
    }

    @Test
    public void TC_Dropdown() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();

        Thread.sleep(1000);

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
    }
}
