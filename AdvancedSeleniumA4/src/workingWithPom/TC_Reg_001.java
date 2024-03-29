package workingWithPom;

import org.testng.annotations.Test;

public class TC_Reg_001 extends BaseClass {

	@Test
	public void register() {
		RegisterPage rp = new RegisterPage(driver);
		rp.getRegisterLink().click();
		rp.getFemaleRadioButton().click();
		rp.getFirstNameTextBox().sendKeys("Vidya");
		rp.getLastNameTextBox().sendKeys("Mysore");
		rp.getEmail().sendKeys("vidya@123");
		rp.getPasswordTextBox().sendKeys("123456");
		rp.getConfirmPasswordTextBox().sendKeys("123456");
		rp.getRegisterButton().click();
	}

}
