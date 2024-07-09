package tc23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VerifyaddressinCheckout {
WebDriver driver;
	
	
	public VerifyaddressinCheckout(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	public void url()
	{
		driver.get("https://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String isPageVisible = driver.getCurrentUrl();
		Assert.assertEquals(isPageVisible,"https://automationexercise.com/");
		System.out.println("Page is Visible");
	}
	
	@FindBy (xpath="//ul[@class='nav navbar-nav']/li[4]") WebElement SignupBtn;
	@FindBy (xpath="//form[@action='/signup']/input[2]") WebElement nme;
	@FindBy (xpath="//form[@action='/signup']/input[3]") WebElement eml;
	@FindBy (xpath="//form[@action='/signup']/button") WebElement Signup;
	@FindBy (id="id_gender2") WebElement MrsradioBtn;
	@FindBy (id="password") WebElement pwd;
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
	@FindBy(xpath="//button[@class='btn btn-default']") WebElement CreateAcct;
	@FindBy (xpath="//h2[@class='title text-center']/b") WebElement VerifyAcc;
	@FindBy (xpath="//a[@class='btn btn-primary']") WebElement ClickCont;
    @FindBy (xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a") WebElement AddtoCart;
    @FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u") WebElement viewcart;
    @FindBy (xpath="//a[@class='btn btn-default check_out']") WebElement ProceedtoCheckout;
    @FindBy(xpath="//ul[@class='nav navbar-nav']/li[5]/a") WebElement deleteAcc;
    @FindBy(xpath="//h2[@class='title text-center']/b")WebElement ConfirmDel;
    @FindBy(xpath="//div/a[@class='btn btn-primary']")WebElement ClickContinue;
    
    public void Signup()
    {
    	SignupBtn.click();
    }
    
    public void enterName(String nm)
	{
		nme.sendKeys(nm);
	}
	public void enterEmail(String em)
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
		 if(VerifyAcc.isDisplayed()) {
				System.out.println("Account created is visible:"+"\n"+VerifyAcc.getText());
			}
			else {
				System.out.println("account created is not visible");
			}
		 ClickCont.click();
		 
		}
	 public void Addtocart() throws InterruptedException
		{
			AddtoCart.click();
			Thread.sleep(2000);
			viewcart.click();
		}
				
			public void proceedtocheckout() 
			
			{
				ProceedtoCheckout.click();
				WebElement  addressDetails =driver.findElement(By.xpath("//section[@id='cart_items']/div/div[3]"));
				String s =addressDetails.getText();
				System.out.println(s);
				deleteAcc.click();
				 if(ConfirmDel.isDisplayed()) {
						System.out.println("Account deleted :"+"\n"+ConfirmDel.getText());
					}
					else {
						System.out.println("Account not deleted");
					}
				    ClickContinue.click();
				
				
			}
			public void CloseBrowser()
			{
				driver.close();
			}
 }
	 

