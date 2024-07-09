package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver driver;
	
	public Logout(WebDriver idriver)
	{
	
	driver =idriver;
	PageFactory.initElements(idriver, this);
	
	}
	 @FindBy (xpath="//ul[@class='nav navbar-nav']//li[4]") WebElement SignupLogin;
	 @FindBy (xpath="//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]") WebElement Email;
	 @FindBy (name="password") WebElement password;
	 @FindBy (xpath="//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button") WebElement Login;
	 @FindBy (linkText="Logout") WebElement Logout;
	
     //Launch url
	 public void URL()
	 {
		 driver.get("https://automationexercise.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	 }
	 
	 
	public void EnterEmail(String em)
	 {
	  Email.sendKeys(em);

	 }
      public void Enterpassword(String pw)
      {
    	   password.sendKeys(pw);
      } 
      public void Login()
      {
    	  Login.click();
      }
      public void Logout()
      {
    	  Logout.click();
      }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    
}
