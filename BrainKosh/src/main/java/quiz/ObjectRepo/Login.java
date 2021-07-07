package quiz.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import quiz.GenericLib.Constants;


public class Login {
	@FindBy(xpath="//input[@name='login']")
	private WebElement LoginEdit;
	@FindBy(xpath="//input[@name='password']")
	private WebElement PasswordEdit;
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement LoginBtn;
public void Login4Quiz()
{
	LoginEdit.sendKeys(Constants.UserName);
	PasswordEdit.sendKeys(Constants.Password);
	LoginBtn.click();
	
}

}
