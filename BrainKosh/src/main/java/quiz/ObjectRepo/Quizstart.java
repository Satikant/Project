package quiz.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quizstart {
	@FindBy(xpath="//a[@class='nav-link' and text()='start']")
	private WebElement startLink;
	
public void PlayQuiz()
{	
	startLink.click();
	System.out.println("Quiz started");
}
}