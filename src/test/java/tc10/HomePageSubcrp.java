package tc10;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageSubcrp {
	
	
	WebDriver driver;
	
	public HomePageSubcrp(WebDriver idriver)
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
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)", "");
	}
	
	
	@FindBy (xpath="//div[@class='col-sm-3 col-sm-offset-1']/div/h2") WebElement SubcriptionText;
	@FindBy (id="susbscribe_email") WebElement Email;
	@FindBy (id="subscribe") WebElement Submit;
	
	
	public void VerifySub() throws InterruptedException
	{
		System.out.println("================");
		System.out.println(SubcriptionText.getText());
		Thread.sleep(4000);
			
	}
	public void Enteremail(String eml) throws InterruptedException 
	{
		Email.sendKeys(eml);
		Thread.sleep(2000);
        Submit.click();
	}
	
	
}
