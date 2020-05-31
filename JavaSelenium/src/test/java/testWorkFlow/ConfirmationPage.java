package testWorkFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    public static String getSubmittedMessage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        WebElement submittedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
        return submittedMessage.getText();
    }
}
