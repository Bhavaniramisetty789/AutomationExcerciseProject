package login;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

	public class LoginwithCorrectEmail {
		
	    WebDriver driver;
		
		
		public LoginwithCorrectEmail(WebDriver idriver)
		{
			driver = idriver;
			PageFactory.initElements(driver,this);
		}
		 
		
		 @FindBy (xpath="//input[2][@name='email']") WebElement Email;
		 @FindBy (name="password") WebElement password;
		 @FindBy (xpath="//button[starts-with(@class,'btn btn-default')]") WebElement Login;
	     @FindBy (xpath="//ul[@class='nav navbar-nav']//li[4]")  WebElement Logout;
	     
	   
	    
	    public void LaunchUrl() throws InterruptedException
	   	{
	   		 driver.get("https://automationexercise.com/");
	   		 driver.manage().window().maximize();
	   		 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	   		 Thread.sleep(2000);
	   	}
	    
	    
	    public void enterEmail(String eml) throws InterruptedException
		{
			Email.sendKeys(eml);
			Thread.sleep(2000);
		}
		public void enterPassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		 public void clickOnLoginBtn() throws InterruptedException
		 {
			 Login.click();
			 Thread.sleep(2000);
		 }
		 public void clickOnLogout()
		 {
			 Logout.click();
		 }
	}



