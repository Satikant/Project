package quiz.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;


public class Quizindex {
	@FindBy(xpath="//h4[contains(text(),'\"GENERAL KNOWLEDGE QUIZ 1\"')]")
	private WebElement index;
	
	@FindBy(xpath="//span[contains(text(),'Active Participants')]")
	private WebElement participants;
	@FindBy(xpath="//span[contains(text(),'Active Participants')]/span")
	private WebElement NumOfParticipants;
	//First Questions
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement FirstQuestion;
	
	@FindBy(xpath="//div[contains(text(),' Potassium dichromatic - sulphuric acid')]")
	private WebElement FirstAnswer;
	
	//Second Questions
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement SecondQuestion;
	@FindBy(xpath="//div[contains(text(),\" COPAL- 19\")]")
	private WebElement secondAnswer;
	//Third Question
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement ThrirdQuestion;
	@FindBy(xpath="//div[contains(text(),'Sweden and Africa')]")
	private WebElement ThrirdAnswer;
	
	//Fourth Question
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement FourthQuestion;
	@FindBy(xpath="//div[contains(text(),'21')]")
	private WebElement FourthAnswer;
	//Fifth Question
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement FifthQuestion;
	@FindBy(xpath="//div[contains(text(),'United Provinces of Agra and Oudh')]")
	private WebElement FifthAnswer;
	
public void Playquizindex() throws Throwable
{
SoftAssert verify= new SoftAssert();
String actheadertext=index.getText();
String expheadertext="\"GENERAL KNOWLEDGE QUIZ 1\"";
verify.assertEquals(actheadertext, expheadertext);
System.out.println("Header Verify " + verify);
Reporter.log(actheadertext, true);

Thread.sleep(30000);

//String actquiztext=participants.getText();
//String expquiztext="Active Participants";
//verify.assertEquals(actquiztext, expquiztext);
//System.out.println("Partcipants Verify " + verify);
//Reporter.log("Verify Partcipants", true);

//Action on question
String printfirst=FirstQuestion.getText();
Reporter.log(printfirst, true);
FirstAnswer.click();

Thread.sleep(30000);
String printsecond=SecondQuestion.getText();
Reporter.log(printsecond, true);
secondAnswer.click();

//3rd			
Thread.sleep(30000);
String printthird=ThrirdQuestion.getText();
Reporter.log(printthird, true);
ThrirdAnswer.click();
//4th
Thread.sleep(30000);
String printfourth=FourthQuestion.getText();
Reporter.log(printfourth, true);
FourthAnswer.click();

Thread.sleep(30000);
String printfifth=FifthQuestion.getText();
Reporter.log(printfifth, true);
FifthAnswer.click();
verify.assertAll();
	
}
}
