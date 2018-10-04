package test.Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectRepository.SpiceJetHomePG;
import testBase.GetUrl;

public class OneWaySearch extends GetUrl {
	WebDriver driver;
	@BeforeClass
	public void StartApp() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://Spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void Search() throws InterruptedException{
	SpiceJetHomePG SHP= PageFactory.initElements(driver, SpiceJetHomePG.class);
	SHP.DepartureCityObj(driver).click();
	Thread.sleep(1000);
	SHP.AhmedabadObj(driver).click();
	Thread.sleep(1000);
	SHP.HyderabadObj(driver).click();
	Thread.sleep(1000);
	SHP.TwoOneObj(driver).click();
	Thread.sleep(1000);
	SHP.SearchObj(driver).click();
	String PgTitle=driver.getTitle();
	System.out.println(PgTitle);
	Assert.assertTrue(PgTitle.contains("Cheap Air"));
	
	}
	@AfterClass
	public void TearDown(){
		driver.close();
	}		
}