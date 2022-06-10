package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLogo
{
	@FindBy(xpath="//b[text()='SkillRary']")
	private WebElement logo;
	
	public SkillaryLogo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogo() 
	{
		return logo;
	}
}
