package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpiceJetHomePG {

	@FindBy(xpath=".//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[1]/label")
	WebElement OneWay;
	public WebElement OneWayObj(WebDriver driver){
		return(OneWay);
}

	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement DepartureCity;
	public WebElement DepartureCityObj(WebDriver driver){
		return(DepartureCity);
}

	@FindBy(partialLinkText="Ahmedabad (AMD)")
	WebElement Ahmedabad;
	public WebElement AhmedabadObj(WebDriver driver){
		return(Ahmedabad);
}

	@FindBy(id="ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement ArrivalCity;
	public WebElement ArrivalCityObj(WebDriver driver){
		return(ArrivalCity);
}
	@FindBy(partialLinkText="Hyderabad (HYD)")
	WebElement Hyderabad;
	public WebElement HyderabadObj(WebDriver driver){
		return(Hyderabad);
}

	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[3]/a")
	WebElement TwoOne;
	public WebElement TwoOneObj(WebDriver driver){
		return(TwoOne);
}


	@FindBy(id="ctl00_mainContent_btn_FindFlights")
	WebElement Search;
	public WebElement SearchObj(WebDriver driver){
		return(Search);
}

	
}
