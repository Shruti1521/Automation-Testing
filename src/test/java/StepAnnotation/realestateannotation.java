package StepAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class realestateannotation {
	public static WebDriver driver;
	@Before
  public void initialization()
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K Patil\\workspace\\Capg1\\driver\\chromedriver.exe");
      driver=new ChromeDriver();
		driver.get("http://realty-real-estatem1.upskills.in/my-profile/");
  }
	@After
  
  public void close()
  {
	  //driver.quit();
  }
}




