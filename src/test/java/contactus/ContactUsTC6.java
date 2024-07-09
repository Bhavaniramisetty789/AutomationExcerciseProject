package contactus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsTC6 {

	
     WebDriver driver;
	
	
	public ContactUsTC6(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//ul[@class='nav navbar-nav']//li[8]/a") WebElement ContactUs;
	@FindBy(xpath="//div[@class='contact-form']/h2") WebElement GetIn;
    @FindBy (name="name") WebElement nme;
    @FindBy (name="email") WebElement eml;
    @FindBy (name="subject") WebElement sub;
    @FindBy (id="message") WebElement msg;
    @FindBy(name="upload_file") WebElement Uploadfile;
    @FindBy(name="submit") WebElement submit;
    @FindBy(xpath="//div[@class='status alert alert-success']") WebElement successMsg;
    @FindBy(xpath="//div[@id='form-section']/a") WebElement Home;
	
    
    //To launch browser
    public void LaunchBrowser()
    {
    	driver.get("http://automationexercise.com");
    }
  //To verify home page is visible successfully
    
    public void VerifyHomepage() 
    {
 		String isPageVisible = driver.getCurrentUrl();
 		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
 		System.out.println("Page is Visible");
 	 }
    
    //To Click on ContactUs
    public void clickonContactUs()
    {
    	ContactUs.click();
    }
    //Verify Get In Touch is visible or not
   
      public void GetIn() 
    {
   		 System.out.println(msg);
   		 GetIn.click();
   		System.out.println("================");
		System.out.println( GetIn.getText());
		
     }
       
       //To enter the Name
       public void entername(String nm)
       {
    	   nme.sendKeys(nm);
       }
      //To enter the Email
       public void Email(String em)
       {
    	   eml.sendKeys(em);
       }
          //To enter the subject
       public void EnterSubject(String sbj)
       {
    	   sub.sendKeys(sbj);
       }
       //To Enter the msg
       public void EnterMessage(String mg) throws InterruptedException 
       {
    	   msg.sendKeys(mg);
    	   Thread.sleep(2000);
    	   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,200)", "");
       }
       //To Uploadfile
         public void Uploadfile() throws InterruptedException
       {
    	   Uploadfile.sendKeys("D:\\Selenium\\Contactusform.docx");
    	   submit.click();
    	  
    	   Alert a = driver.switchTo().alert();
    	   a.accept();
    	   System.out.println("================");
   		   System.out.println(successMsg.getText());
    	   Thread.sleep(5000);
    	  
    	   Home.click();
    	  
   		//To verify user navigated to home page
   		 
   		 String homeURL = driver.getCurrentUrl();
   		 Assert.assertEquals(homeURL, "https://automationexercise.com/");
   		 System.out.println("=======================");
   		 System.out.println("Navigated to Home Page");
   	 
   	}
      // To Close the Browser
 		public void closeBrowser() throws InterruptedException {
 			Thread.sleep(5000);
 			driver.close();
 		}
   	
    	   
       
      
       
      
	
}
     