package tc1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAcc {
	

	WebDriver driver;
	
	
	public CreateAcc(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (name="name") WebElement nme;
	@FindBy (xpath="//form[@action='/signup']/input[3]") WebElement eml;
	@FindBy (xpath="//form[@action='/signup']/button") WebElement Signup;
	@FindBy (id="id_gender2") WebElement MrsradioBtn;
	@FindBy (name="password") WebElement pwd;
	@FindBy (id="days") WebElement Day;
	@FindBy (id="months") WebElement Months;
	@FindBy (name="years") WebElement Years;
	@FindBy (name="newsletter") WebElement newsletter;
	@FindBy (id="optin") WebElement optin;
	@FindBy (name="first_name") WebElement Fname;
	@FindBy (name="last_name") WebElement lname;
	@FindBy (id="company") WebElement cmp;
	@FindBy (id="address1") WebElement Ad1;
	@FindBy (id="address2") WebElement Ad2;
	@FindBy (name="country") WebElement cntry;
	@FindBy (name="state") WebElement ste;
	@FindBy (name="city") WebElement cty;
	@FindBy (id="zipcode") WebElement zpc;
	@FindBy (id="mobile_number") WebElement mbn;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button") WebElement CreateAcct;
	@FindBy (linkText="Continue") WebElement ContinueBtn;
   //@FindBy (xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a") WebElement Logout;
	@FindBy (linkText="Delete Account") WebElement DeleteAccount;
	
	public void reguser() {
		
		//To verify home page is visible successfully
		
		String isPageVisible = driver.getCurrentUrl();
		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
		System.out.println("Page is Visible");
		Signup.click();

}
	
	
	//launch Url
	 
	 public void LaunchUrl() throws InterruptedException
	{
		 driver.get("https://automationexercise.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		 Thread.sleep(2000);
	}
	
	public void enterName(String nm)
	{
		nme.sendKeys(nm);
	}
	public void enterEmail1(String em)
	{
		eml.sendKeys(em);
	}
	 public void clickOnSignup()
	 {
		 Signup.click();
	 }
	 public void SelectRadioBtn()
	 {
		 MrsradioBtn.click();
	 }
	 public void enterpassword(String pw)
	 {
		 pwd.sendKeys(pw);
	 }
	 public void SelectDay(String day)
	 {
		    Select sel = new Select(Day);
			sel.selectByVisibleText("21");
			
	 }
	 public void SelectMonth(String month)
	 {
		    Select sel = new Select(Months);
			sel.selectByVisibleText("February");
	 }
	 public void SelectYear(String Year)
	 {
		    Select sel = new Select(Years);
			sel.selectByVisibleText("1990");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)", "");
	 }
	 public void selectCheckbox()
	 {
		 newsletter.click();
	 }
	 public void SelectreceiveLetter()
	 {
		 optin.click();
	 }
	 public void Enteraddress(String fn,String ln,String cm,String ads1,String ads2,String ctry,String st, String ct,String zc,String mb) throws InterruptedException 
	 {
		 Fname.sendKeys(fn);
		 lname.sendKeys(ln);
		 cmp.sendKeys(cm);
		 Ad1.sendKeys(ads1);
		 Ad2.sendKeys(ads2);
		 cntry.sendKeys(ctry);
		 ste.sendKeys(st);
		 cty.sendKeys(ct);
		 zpc.sendKeys(zc);
		 mbn.sendKeys(mb);
		 CreateAcct.click();
		 Thread.sleep(2000);
		 
	 
		    
	 }
	 //Click on continue
	 public void ClickonContinue()
	 {
		 ContinueBtn.click();
	 }
	// after CreateAccount Logout
	 
	//public void ClickonLogout()
	 {
		//Logout.click();
	 }

	
	 
	 public void DeleteAccount()
	 {
		DeleteAccount.click();
	 }
	
	
}

	
	
	
	



