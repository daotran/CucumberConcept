package cucumber.features;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GroupDiary {
	
	@When("^Click group diary on menu$")
	public void clickOnGroupDiary() throws Throwable {
	    System.out.println("Click on introduce yourself on menu");
	}

	@Then("^Check to see there is any messages in group diary$")
	public void checkMessageGroupDiary() throws Throwable {
	    System.out.println("Check to see any messages in group diary");
	}
}
