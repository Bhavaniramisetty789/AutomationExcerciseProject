package tc11;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartSubTC11 {
	
WebDriver driver;
	
	public CartSubTC11(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(idriver,this);
	}
	public void URL()
	{

		driver.get("https://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String isPageVisible = driver.getCurrentUrl();
		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
		System.out.println("Page is Visible");
		
	}
	
	  @FindBy (xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a") WebElement AddCart;
	  @FindBy (linkText="View Cart") WebElement ViewCart;
	  @FindBy (xpath="//div[@class='col-sm-3 col-sm-offset-1']/div/h2") WebElement SubcriptionText;
	  @FindBy (id="susbscribe_email") WebElement Email;
	  @FindBy (id="subscribe") WebElement Submit;
	  
	  
	  public void VerifySub() throws InterruptedException
		{
			System.out.println("================");
			System.out.println(SubcriptionText.getText());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		}
		public void Enteremail(String eml) throws InterruptedException 
		{   
			AddCart.click();
			ViewCart.click();
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			Email.sendKeys(eml);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        Submit.click();
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
