package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;
	String driverPath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";


	@BeforeTest

	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://etherscan.io/register");
		driver.manage().window().maximize();


	}

	@AfterTest

	public void Closedriver() {

		driver.close();

	} 

}
