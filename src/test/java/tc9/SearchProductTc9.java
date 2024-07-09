package tc9;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProductTc9 {
	
	WebDriver driver;
		
		public  SearchProductTc9(WebDriver idriver)
		{
			driver=idriver;
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
		@FindBy(xpath="//h2[@class='title text-center']") WebElement AllProductsList;
		@FindBy(name="search") WebElement SearchProduct;
		@FindBy(id="submit_search") WebElement SubmitSearch;
		@FindBy(xpath="//div[@class='productinfo text-center']") WebElement ProductVisible;

		public void Search()
		{
			Products.click();
			String Allproducts = driver.getCurrentUrl();
			 Assert.assertEquals(Allproducts, "https://automationexercise.com/products");
		     System.out.println("=======================");
			 System.out.println("Navigated to Allproducts page");
			 SearchProduct.sendKeys("Winter Top");
			 SubmitSearch.click();
			 JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)", "");
			 System.out.println("================");
			 System.out.println(ProductVisible.getText());
				
			 
			
		}
}
