package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.TechfiosPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	WebDriver driver;
	TechfiosPage techfios;

	public void beforeRun() {
		init();
		driver.get("https://techfios.com/test/107/index.php");
		techfios = PageFactory.initElements(driver, TechfiosPage.class);
	}

	@Given("{String} button exists")
	public void button_exists(String button) {

		if (button.equalsIgnoreCase("Set SkyBlue Background")) {
			techfios.clickOnSkyBlueButton();
		} else if (button.equalsIgnoreCase("Set White Background")) {
			techfios.clickOnSkyWhiteButton();
		} else {
			System.out.println("color change");

		}

	}

	@When("I click on the button")
	public void IClickOnTheButton() {
		techfios.clickOnSkyBlueButton();
		techfios.clickOnSkyWhiteButton();
	}

	@Then("the background color will change to sky blue")
	public void theBackgroundColorWillChangeToSkyBlue() {
		String expectedColor = "skyblue";
		String actualColor = techfios.getPageColor();
		Assert.assertEquals(actualColor, expectedColor);
	}

	@Then("the background color will change to sky white")
	public void theBackgroundColorWillChangeToSkyWhite() {
		String expectedColor = "white";
		String actualColor = techfios.getPageColor();
		Assert.assertEquals(actualColor, expectedColor);

	}
}
