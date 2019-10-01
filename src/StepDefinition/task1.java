package StepDefinition;

import Framework.SeleniumImplementation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class task1 extends SeleniumImplementation{

	@Given("^Navigate to goDiscovery application$")
	public void navigate_to_goDiscovery_application()  
	{
		launchBrowser();
		navigateUrl();
	}

	@When("^Select See All Shows available in Shows tab$")
	public void select_See_All_Shows_available_in_Shows_tab()  {
	    
	}

	@When("^Wait till the page loads and then select the shows which contain APOLLO$")
	public void wait_till_the_page_loads_and_then_select_the_shows_which_contain_APOLLO()  {
	    
	}

	@Then("^Verify the Favorites status$")
	public void verify_the_Favorites_status() {
	  
	}

	@When("^If status is set or not then icon should change accordingly$")
	public void if_status_is_set_or_not_then_icon_should_change_accordingly()  {
	   
	}

	@Then("^Store all the favorite or unfavorite done titles in list$")
	public void store_all_the_favorite_or_unfavorite_done_titles_in_list()  {
	   
	}

	@When("^Once favorite or unfavorite is done goto My Videos$")
	public void once_favorite_or_unfavorite_is_done_goto_My_Videos()  {
	   
	}

	@Then("^Validate the favorite or unfavorite titles under FAVORITE SHOWS$")
	public void validate_the_favorite_or_unfavorite_titles_under_FAVORITE_SHOWS()  {
	
	}

}