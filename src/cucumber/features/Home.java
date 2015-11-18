package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Home {
	
	@Given("^I navigate to backpacking\\.vn site$")
	public void navigateToBackpacking() throws Throwable {
		System.out.println("Executed the navigate to the backpacking.vn");
	}

	@When("^Click Home on menu$")
	public void clickOnHome() throws Throwable {
	    System.out.println("Click Home on menu");
	}
	
}
