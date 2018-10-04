package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrl extends MaximizeWindow{
	WebDriver driver;
	
	public void URL(){
		driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		}

}
