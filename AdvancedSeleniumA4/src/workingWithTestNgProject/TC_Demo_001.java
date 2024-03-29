package workingWithTestNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_001 extends BaseClass {

	// functionality TC //
	@Test
	public void validate_that_user_is_able_to_click_on_wishlist_link() {
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Reporter.log("User is able to click on wishlist");

	}

}
