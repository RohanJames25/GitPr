package mavenpractice.mavenjava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MMTFlow {

static WebDriver driver;

@Test
public static void RunTest () throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:/Softwares/Eclipse Jars/chromedriver.exe");  
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	MMT mmt = PageFactory.initElements(driver, MMT.class);
	
	if(mmt.BestText()==true)
	{
	mmt.Log();
	mmt.Pack();
	}

	else
	{
		mmt.Pack();
	}
	
	Thread.sleep(3000);
	mmt.Dest();
	mmt.Inter();
	Thread.sleep(3000);
	mmt.Swissz();
	
	//ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
    //driver.switchTo().window(tab.get(0));
	String currentHandle= driver.getWindowHandle();
	Set<String> tabs = driver.getWindowHandles();
	for (String tab : tabs)
	{
	if(tab.equals(currentHandle))
	{
		System.out.println("Window 1:" + tab + driver.getTitle());
		
	}
	else {
		driver.switchTo().window(tab);
		//System.out.println(driver.getTitle());
		System.out.println("Window 2:" + tab + driver.getTitle());
		}		
	}
		
	Thread.sleep(5000);
	mmt.SkipBtn();
	//MMT.ClosePops();
	Thread.sleep(3000);
	mmt.Expl();

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");

	//driver.switchTo().window(currentHandle);

		
		
	}
	
    
   }

	
	  

	