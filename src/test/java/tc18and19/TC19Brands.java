package tc18and19;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC19Brands {
WebDriver driver;
	
	public TC19Brands(WebDriver idriver)
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
	
	@FindBy (xpath="//div[@class='left-sidebar']/div/h2") WebElement Catgories;
	@FindBy (xpath="//ul[@class='nav nav-pills nav-stacked']/li[5]") WebElement Brand;
	@FindBy(xpath="//ul[@class='nav nav-pills nav-stacked']/li[5]") WebElement TextConfirm;
	
	public void Brands()
	{
		Catgories.click();
		Brand.click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://automationexercise.com/brand_products/Babyhug");
		System.out.println("Babyhug Brand Page is displayed.");
	}
}
