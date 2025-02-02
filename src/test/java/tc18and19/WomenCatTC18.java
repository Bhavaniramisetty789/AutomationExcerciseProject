package tc18and19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WomenCatTC18 {
WebDriver driver;
	
	public WomenCatTC18(WebDriver idriver)
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
	
	@FindBy(xpath="//div[@class='left-sidebar']/div") WebElement categories;
	@FindBy(xpath="//div[@class='panel-group category-products']/div[1]/div/h4/a") WebElement Women;
	@FindBy(xpath="//div[@class='left-sidebar']/div[1]/div[1]/div[2]/div/ul/li[2]/a") WebElement Tops;
	@FindBy(xpath="//h2[@class='title text-center']") WebElement TextConfirm;
	@FindBy(xpath="//div[@class='panel-group category-products']/div[2]/div/h4/a") WebElement Men;
	@FindBy(xpath="//div[@class='left-sidebar']/div[1]/div[2]/div[2]/div/ul/li[2]/a") WebElement Jeans;
		
	
public void viewCategory() throws InterruptedException 
{
		
		System.out.println(categories.getText());
		Women.click();
		Tops.click();
		
		Thread.sleep(3000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://automationexercise.com/category_products/2");
		System.out.println("Category Page is displayed.");
		
		System.out.println(TextConfirm.getText());
		
	}
	
	public void subCategory() {
		
		Men.click();
		Jeans.click();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://automationexercise.com/category_products/6");
		System.out.println("Mens- Jeans Category Page is displayed.");
		
	}
	
	public void closeBrowser() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.close();
	 }

}
	

