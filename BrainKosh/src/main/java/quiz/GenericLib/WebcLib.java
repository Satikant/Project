package quiz.GenericLib;

import java.util.concurrent.TimeUnit;
import org.testng.asserts.SoftAssert;

public class WebcLib {
	public void PageToLoad()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
    
}
