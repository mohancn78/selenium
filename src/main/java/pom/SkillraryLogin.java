package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * pom login page
 * @author hp
 * 
 */

public class SkillraryLogin
{
	/**
	 * skillaryLogin page
	 * pom
	 * declaration
	 */
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	/**
	 * skillaryLogin page
	 * pom
	 * initialization
	 */
	public SkillraryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		/**
		 * pom
		 * utilisation
		 */
	}
	public void un(String user)
	{
		userName.sendKeys(user);
	}
	public void pw(String password)
	{
		passWord.sendKeys("admin");
	}
	public void log()
	{
		loginButton.click();
	}
	 
}
