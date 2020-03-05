package sumitPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {

	
	@Test
	public void testing() {
		// TODO Auto-generated method stub

		System.out.println("Hello world");
		
		test t = new test();
		t.testMethod();
		String path = "C:\\Users\\SumitKumar\\git\\TestGIT\\TestGIT\\Driver\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	
	public void testMethod()
	{
		System.out.println("Hello again");
	}

}
