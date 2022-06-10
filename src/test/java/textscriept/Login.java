package textscriept;


import org.testng.annotations.Test;

import genericlib.BaseClass;
import pom.SkillaryLogo;
import pom.SkillraryLogin;

public class Login extends BaseClass
{
	@Test
	public  void test() throws InterruptedException 
	{
		
		
		
		SkillraryLogin s=new SkillraryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.log();
		
		
		SkillaryLogo logo=new SkillaryLogo(driver);
		web.mouseHover(logo.getLogo(), driver);
		Thread.sleep(4000);
		
		
	}

}
