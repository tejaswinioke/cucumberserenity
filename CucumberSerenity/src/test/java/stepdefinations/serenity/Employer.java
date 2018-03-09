package stepdefinations.serenity;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class Employer {

	HomePage homePage;  
	
	
	@Step
	 public void opens_google_page() {
	        homePage.open();
	 }
	
	
}
