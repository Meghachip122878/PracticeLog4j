package practiceLog4j;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class doLogin {
	
	
	@Test
	public void login() {
		
		Reporter.log("login failed");
		Assert.fail();
		
		
	}

}
