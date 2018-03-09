package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import stepdefinations.serenity.Employer;

public class First {
	
	
	@Steps
    Employer emp;
	
	@Given("^I open url$")
	public void i_open_url() throws Exception {
	    emp.opens_google_page();
	}
	
	@When("^I enter search keyword$")
	public void i_enter_search_keyword() throws Exception {
	   
	}

	@When("^I press enter$")
	public void i_press_enter() throws Exception {
	    
	}

	@Then("^I should see results populated$")
	public void i_should_see_results_populated() throws Exception {
	   
	}


}
