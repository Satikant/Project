package quiz.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import quiz.GenericLib.WebcLib;


public class Upcoming {
	@FindBy(xpath="//li[@class='nav-item']/a[@class='nav-link']")
	private WebElement UpcomingQuiz;
	
public void NewQuiz()
{
	
	UpcomingQuiz.click();
	  WebcLib wlib=new WebcLib();
			wlib.PageToLoad();
	
}
}
