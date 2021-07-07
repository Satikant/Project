package quiz.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import quiz.GenericLib.BaseClass;
import quiz.GenericLib.Constants;
import quiz.GenericLib.WebcLib;

public class Homepage{
	@FindBy(xpath="//a[contains(text(),'More')]")
	private WebElement MoreDropdown;
	@FindBy(xpath="//a[@class='dropdown-item' and text()='Login']")
	private WebElement LoginMenu;
public void Homepageredirect()
{
	BaseClass.driver.get(Constants.URL);
	MoreDropdown.click();
	 WebcLib wlib=new WebcLib();
		wlib.PageToLoad();
	LoginMenu.click();
	
}


}
