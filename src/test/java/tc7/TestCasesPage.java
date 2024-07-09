package tc7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCasesPage {
	
	WebDriver driver;
	
	public TestCasesPage(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	public void url()
	{
		driver.get("https://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String isPageVisible = driver.getCurrentUrl();
		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
		System.out.println("Page is Visible");
	}

	
	@FindBy (xpath="//ul[@class='nav navbar-nav']/li[5]/a") WebElement TestCases;
	
	public void Testcases()
	{
		TestCases.click();
	}
	
	//To verify user navigated to home page
	public void NavigateTcpage()
	{
	 
	 String TestcasesUrl = driver.getCurrentUrl();
	 Assert.assertEquals(TestcasesUrl,"https://automationexercise.com/test_cases");
	 System.out.println("=======================");
	 System.out.println("Navigated to Testcasespage");
	}
	
	
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
	
	
	
	

