package quiz.GenericLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	//@Parameters("MYBROWSER")    /*To execute scripts in different browser */
	public void OpenBrowser()
	{
		if(Constants.Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ProjectWork\\Eclipse Workspace\\BrainKosh\\Resources\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(Constants.Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Oxygen\\MavenPro\\Resource\\geckodriver-v0.20.1-win32.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		/*
		 * Wait for every webelement in one TestScripts
		 */
	  WebcLib wlib=new WebcLib();
		wlib.PageToLoad();
	}
	@AfterClass
	public void CloseBrowser()
	{
	driver.quit();	
	}
	@BeforeMethod
	public void LoginToApp()
	{
		//Login lpage=PageFactory.initElements(driver, Login.class);
		//lpage.LoginToApp();
	}
	@AfterMethod
	public void LogoutFromApp()
	{
//		Logout lg=PageFactory.initElements(driver, Logout.class);
//		lg.LoggingOut();	
	}
}
