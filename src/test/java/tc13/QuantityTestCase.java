package tc13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class QuantityTestCase {
WebDriver driver;
	
	public QuantityTestCase(WebDriver idriver)
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
	  @FindBy (xpath="//ul[@class='nav nav-pills nav-justified']/li") WebElement ViewProduct;
	  @FindBy (xpath="//div[@class='product-details']") WebElement Productdetails;
	  @FindBy  (id="quantity") WebElement Quantity;
	  @FindBy (xpath="//span//button[@class='btn btn-default cart']") WebElement Addtocart;
	  @FindBy (linkText="View Cart") WebElement ViewCart;
	  @FindBy (xpath="//tr//button[@class='disabled']") WebElement QntCheck;
	  
	  
	  public void ViewProduct() throws InterruptedException
	  {
		  ViewProduct.click();
		  Thread.sleep(3000);
	  }
	  
	  //To display Products details Page
		 public void Productdetails() {
			 if(Productdetails.isDisplayed()) {
				 System.out.println("Productdetails Opened");
			 }
			 else {
				 System.out.println("Not Opened");
			 }
		 }
		 
		 public void Quantity() throws InterruptedException
		 {
			 WebElement quantityInput = driver.findElement(By.id("quantity"));

		        // Read the current quantity
		        String currentQuantity = quantityInput.getAttribute("value");
		        int currentQuantityInt = Integer.parseInt(currentQuantity);

		        // Increment the quantity
		        int newQuantity = currentQuantityInt + 3;

		        // Enter the new quantity
		         quantityInput.clear();
		         quantityInput.sendKeys(String.valueOf(newQuantity));
			     Addtocart.click();
			     ViewCart.click();
		 }
		 //To display the Quantity as 4
		 
		 public void QntCheck() {
			 if(QntCheck.isDisplayed()) {
				 System.out.println("Quantity is Increased");
			 }
			 else {
				 System.out.println("Not Increased");
			 }
		 }
		 public void closeBrowser() throws InterruptedException
		 {
			 Thread.sleep(4000);
			 driver.close();
			 
		 }
		 

}
