package mavenpractice.mavenjava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	static WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//**********************************************************
	//Convert to text
	
	@FindBy(id = "fileUploadButton")
	WebElement uploadbtn;

	public void Fup() 
	{
		
		uploadbtn.click();
	
	}
	
	@FindBy(css = "button.btn.btn-default.deletebutton")
	WebElement deletebtn;

	public void Del() 
	{
		
		deletebtn.click();
	
	}
	

	@FindBy(css = "button.btn.btn-lg.submit-btn")
	WebElement strt;

	public void Start() 
	{
		
		strt.click();
	
	}
	
	@FindBy(id = "login-btn")
	WebElement lg;

	public void Lgoption() 
	{
		
		lg.click();
	
	}
	
	
	/*
	 //**********************************************************
	// yahoo homempage

	@FindBy(css = "a._yb_y9ww9 ")
	WebElement mail;

	public void Mailclick() {
		mail.click();
	}
	
	//**********************************************************
	// mytnra homepage
	@FindBy(xpath = "//*[@data-reactid = '20']")
	WebElement mens;

	public void Mensoption() {
		Actions action = new Actions(driver);
		//Actions hover = action.moveToElement(mens);
		action.moveToElement(mens).build().perform();
		//hover.build().perform();
	}
	
	//@FindBy(xpath = "//*[@data-reactId = '25']")
	@FindBy(xpath = "//li[contains (@href,'/men')]")
	static
	WebElement menuoption;
	
	
	public static void Arraymenu() {
		
		int i;
		
		//ArrayList<WebElement> al = new ArrayList<WebElement> ();
		
		
		List<WebElement> al = driver.findElements(menuoption)
		for (i=0; i<=6;i++)
		{
			al.add(menuoption);
			System.out.println(menuoption);
		}
	}
	
	public static void main (String[] args) {
		
	Homepage.Arraymenu();
		*/
		
		
	}
	
	

