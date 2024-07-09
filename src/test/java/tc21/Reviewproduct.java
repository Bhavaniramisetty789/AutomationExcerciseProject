package tc21;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Reviewproduct {
WebDriver driver;
	
	public Reviewproduct(WebDriver idriver)
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
	
	@FindBy (xpath="//ul[@class='nav navbar-nav']/li[2]/a") WebElement Products;
	@FindBy(xpath="//ul[@class='nav nav-pills nav-justified']/li/a[1]") WebElement ViewProduct;
	@FindBy(xpath="//ul[@class='nav nav-tabs']") WebElement Visible;
	@FindBy(id="name") WebElement Name;
	@FindBy(id="email") WebElement email;
	@FindBy(name="review") WebElement review;
	@FindBy(xpath="//button[@id='button-review']")WebElement Submit;
	
	public void products()
	{
		Products.click();
		ViewProduct.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
		System.out.println(Visible.getText());
		
	}
	public void Review(String nm,String em,String rv)
	{
		Name.sendKeys(nm);
		email.sendKeys(em);
		review.sendKeys(rv);
	}
	public void Submit()
	{
		Submit.click();
	}
	
	}

