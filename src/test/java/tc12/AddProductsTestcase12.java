package tc12;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


	public class AddProductsTestcase12 {
WebDriver driver;
	
	public AddProductsTestcase12(WebDriver idriver)
	{
		driver = idriver;
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
	@FindBy (xpath="//ul[@class='nav navbar-nav']/li[2]/a") WebElement Products;
	@FindBy (xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a") WebElement AddCart;
	@FindBy (xpath="//div//button[@class='btn btn-success close-modal btn-block']") WebElement Continueshop;
	@FindBy (xpath="/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a") WebElement AddCart2;
	@FindBy (linkText="View Cart") WebElement ViewCart;
	

	 //Add To cart
	public void AddtoCart() throws InterruptedException
	{
		Products.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		AddCart.click();
		Thread.sleep(3000);
		Continueshop.click();
		AddCart2.click();
		Thread.sleep(4000);
		ViewCart.click();
	}
   
}
