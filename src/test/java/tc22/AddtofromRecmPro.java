package tc22;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddtofromRecmPro {
WebDriver driver;
	
	public AddtofromRecmPro(WebDriver idriver)
	{
		driver= idriver;
		PageFactory.initElements(idriver,this);
	}
	public void url()
	{
		driver.get("https://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String isPageVisible = driver.getCurrentUrl();
		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
		System.out.println("Page is Visible");
	}
	 
	@FindBy (xpath="//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a") WebElement AddtoCart;
	@FindBy (xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a") WebElement ViewCart;
	
	public void Addtocart()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		AddtoCart.click();
		ViewCart.click();
	}
}
