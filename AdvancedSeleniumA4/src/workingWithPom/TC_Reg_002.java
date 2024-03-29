package workingWithPom;

import org.testng.annotations.Test;

public class TC_Reg_002 extends BaseClass {

	@Test
	public void login() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmail().sendKeys("vardhangowda@gmail.com");
		lp.getPassword().sendKeys("Vardhan123");
		lp.getRememberMeCheckBox().click();
		lp.getLoginButton().click();

	}

}
