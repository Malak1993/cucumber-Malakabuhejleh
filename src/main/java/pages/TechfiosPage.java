package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/button[1]") WebElement BlueSkyButton_Element;
	@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/button[2]") WebElement WhiteSkyButton_Element;
	public TechfiosPage(WebDriver driver ) {
		this.driver=driver;
	}
	public void clickOnSkyBlueButton() {
		BlueSkyButton_Element.click();
		
	}
	public void clickOnSkyWhiteButton() {
		WhiteSkyButton_Element.click();
		
	}
	public String getPageColor() {
		return driver.getTitle();
	}

}
