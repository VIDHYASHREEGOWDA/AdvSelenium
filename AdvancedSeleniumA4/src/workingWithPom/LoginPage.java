package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement LoginLink;

	@FindBy(id = "Email")
	private WebElement Email;

	@FindBy(id = "Password")
	private WebElement Password;

	@FindBy(id = "RememberMe")
	private WebElement RememberMeCheckBox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;;

	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getRememberMeCheckBox() {
		return RememberMeCheckBox;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

}
