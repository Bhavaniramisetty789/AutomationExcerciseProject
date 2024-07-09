package tc5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC5RegwithexistuserId {
	
	
WebDriver driver;
	
	
	public TC5RegwithexistuserId(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//ul[@class='nav navbar-nav']/li[4]") WebElement  SignupLogin;
	@FindBy (name="name") WebElement nme;
	@FindBy (xpath="//form[@action='/signup']/input[3]") WebElement eml;
	@FindBy(xpath="//form[@action='/signup']/button") WebElement signUp;
	
	
	
	
	public void Launchurl()
	{
		driver.get("https://automationexercise.com");
	}
	
   public void reguser() 
   {
		
		//To verify home page is visible successfully
		
		String isPageVisible = driver.getCurrentUrl();
		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
		System.out.println("Page is Visible");
		SignupLogin.click();

      }
	
	public void SignupLogin()
	{
		SignupLogin.click();
	}
	
	  public void entername(String nm)
	{
		nme.sendKeys(nm);
	}
	  public void enterEmail(String em) 
	{
		eml.sendKeys(em);
    }
	public void signUp()
	{
		signUp.click();
	}
	
	
}