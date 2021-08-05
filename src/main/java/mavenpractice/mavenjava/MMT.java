package mavenpractice.mavenjava;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MMT {
	
	WebDriver driver;

public MMT(WebDriver driver) {
		this.driver = driver;
		
		}

@FindBy (xpath="//p[text()='Login/Signup for Best Prices']")
WebElement text;

@FindBy (xpath="//li[@data-cy='account']")
WebElement login;

@FindBy (xpath="//span[text()='Holiday Packages']")
WebElement holiday;

@FindBy (xpath="//span[text()='Destinations']")
//(css="span.hdlSubMenu__item--title.hdlSubMenu__item--title_active")
WebElement destination;

@FindBy (xpath="//li[@class='hdlRegion__list--item ']")
WebElement international;

@FindBy (xpath="//p[text()='Switzerland']")
WebElement swiss;	

@FindBy (xpath="//button[@class='skipBtn']")
WebElement skip;

@FindBy (xpath="//p[@class='closePopup']")
WebElement close;

@FindBy (xpath="//span[@class='holidaySprite exploreIcon']")
WebElement explore;

@FindBy (xpath="//h4[text()='Swiss Classic - 4 N Engelberg']")
WebElement hotel;

public boolean BestText()
{
if(text.isDisplayed()==true)
{
return true;
}
else
{
return false;
}
}

public void Log()
{
login.click();
}
	
public void Pack() 
{		
	holiday.click();
}

public void Dest()
{		
	destination.click();
}

public void Inter()
{
	international.click();
}

public void Swissz()
{
	swiss.click();
}

public void SkipBtn()
{
skip.click();

}

public void ClosePops()
{
close.click();
}

public void Expl()
{
explore.click();
}

public void BookHotel()
{
	hotel.click();
}

}