package register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationResultPage {
	protected WebDriver driver;

	public RegistrationResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")
    private WebElement registrationResult;

    public String getRegistrationResult(){
        return registrationResult.getText();
    }


}
