package tc8;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Productspage {
	
	WebDriver driver;
	
	public Productspage(WebDriver idriver)
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
	@FindBy(xpath="//ul[@class='nav nav-pills nav-justified']//li[a]") WebElement ViewProduct;
	@FindBy(xpath="//div[@class='product-details']") WebElement Productdetailspage;
	
	//Verify Productspage
	public void Productspage()
	{
		 Products.click();
		 String Allproducts = driver.getCurrentUrl();
		 Assert.assertEquals(Allproducts, "https://automationexercise.com/products");
	     System.out.println("=======================");
		 System.out.println("Navigated to Allproducts page");
		 System.out.println("================");
	     System.out.println(AllProductsList.getText());
	     ViewProduct.click();
	     System.out.println("================");
		 System.out.println(Productdetailspage.getText());
			
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
