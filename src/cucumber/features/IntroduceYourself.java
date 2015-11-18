package cucumber.features;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IntroduceYourself {
	
	@When("^Click introduce yourself on menu$")
	public void clickOnIntroduceYourself() throws Throwable {
	    System.out.println("Click on introduce yourself on menu");
	}

	@Then("^Check to see there is any introductions$")
	public void checkAnyIntroduction() throws Throwable {
	    System.out.println("Check to see any introductions");
	}
	
}
