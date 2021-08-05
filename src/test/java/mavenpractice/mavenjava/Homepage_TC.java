package mavenpractice.mavenjava;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Homepage_TC {
	
	static WebDriver driver;
	
	@Test
	
	public static void Execution () throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "D:/Softwares/Eclipse Jars/chromedriver.exe");  
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://in.yahoo.com/");
	driver.get("https://www.ocr2edit.com/convert-to-txt");
	Homepage Homepg = PageFactory.initElements(driver, Homepage.class); 
	Login Loginpg = PageFactory.initElements(driver, Login.class);
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	
	//Homepg.Lgoption();
	//Loginpg.Uname("automatesoftware02@gmail.com");
	//Loginpg.Pwd("Auto@123");
	//Loginpg.Lgsubmit();
	
	
	Homepg.Fup();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(5000);
	Runtime.getRuntime().exec("E:\\Games\\AutoIT\\FileUpload.exe");
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn-default.deletebutton")));
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//Thread.sleep(5000);
	Homepg.Start();
	
	
	
	//Homepg.Mensoption();
	//Homepg.Mailclick();
	//Loginpg.LoginEntry("rohanjames88@gmail.com");
	  

	
	 /* public static void main (String[] args) {
	
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize(); driver.get("www.yahoo.com");
	  
	  Homepage Homepg = PageFactory.initElements(driver, Homepage.class); Login
	  Loginpg = PageFactory.initElements(driver, Login.class);
	  
	 Homepg.mail.click(); Loginpg.email.sendKeys("rohanjames88@gmail.com"); }
	 */
	}
	
	
	
	
}
