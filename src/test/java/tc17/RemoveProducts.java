package tc17;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RemoveProducts {
	
	WebDriver driver;
	
	public RemoveProducts(WebDriver idriver)
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
	@FindBy (xpath="//a[@class='btn btn-default add-to-cart']") WebElement AddtoCart;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement Continueshop;
    @FindBy (xpath="//ul[@class='nav navbar-nav']/li[3]") WebElement clickcart;
    @FindBy(xpath="//td/a[@class='cart_quantity_delete']") WebElement Deleteproduct;
    
    public void Addtocart()
    {
    	AddtoCart.click();
    	Continueshop.click();
    	clickcart.click();
    	Deleteproduct.click();
    }
}
