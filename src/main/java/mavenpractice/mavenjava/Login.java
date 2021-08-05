package mavenpractice.mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
/*
	@FindBy(id = "login-username")
	WebElement email;

	public void LoginEntry(String uname) {
		email.sendKeys(uname);

	}
*/
	
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="functional-submit-btn")
	WebElement login;
	
	public void Uname(String usernm) 
	{
		
		uname.sendKeys(usernm);
	
	}
	
	public void Pwd(String pass) 
	{
		
		pwd.sendKeys(pass);
	
	}
	
	public void Lgsubmit() 
	{
		
		login.click();
	
	}	
	
}
