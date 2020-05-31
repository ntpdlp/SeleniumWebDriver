package testWorkFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
    protected WebDriver driver;

    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id="last-name")
    private WebElement lastName;

    FormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void enterForm(WebDriver driver){
        this.firstName.sendKeys("Vo");
        this.lastName.sendKeys("Nguyen");
        driver.findElement(By.id("job-title")).sendKeys("Nguyen");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();

        Select drpYears = new Select(driver.findElement(By.id("select-menu")));
        drpYears.selectByVisibleText("2-4");

        driver.findElement(By.id("datepicker")).sendKeys("05/30/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
