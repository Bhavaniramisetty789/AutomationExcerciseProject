package tc24;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DownloadInvoice {
WebDriver driver;
	
	
	public DownloadInvoice(WebDriver idriver)
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
	@FindBy (xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a") WebElement AddtC;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u") WebElement viewcart;
    @FindBy (xpath="//a[@class='btn btn-default check_out']") WebElement ProceedtoCheckout;
    @FindBy(xpath="//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u") WebElement Register;
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
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[10]/a") WebElement VerifyText;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[3]") WebElement ClickCart;
	@FindBy (xpath="//a[@class='btn btn-default check_out']") WebElement ProceedtoCheckout1;
    // @FindBy(id="cart_items") WebElement Verifycartpage;
	@FindBy (name="message") WebElement EnterDescp;
	@FindBy (linkText="Place Order") WebElement Placeorder;
	@FindBy(name="name_on_card") WebElement NameonCard;
	@FindBy(name="card_number") WebElement Cardnum;
	@FindBy (name="cvc") WebElement CVC;
	@FindBy (name="expiry_month") WebElement expirymnth;
	@FindBy(name="expiry_year") WebElement Expyear;
	@FindBy (xpath="//button[@class='form-control btn btn-primary submit-button']") WebElement confirmOrder;
	@FindBy(xpath="//div//div//h2[@class='title text-center']") WebElement OrderplacedText;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/a") WebElement DownloadInvoice;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a") WebElement Continuebtn;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[5]/a") WebElement deleteAcc;
    @FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")WebElement ConfirmDel;
    @FindBy(xpath="//div/a[@class='btn btn-primary']")WebElement ClickContinue;
    
    
    public void AddProduct()
    {
    	AddtC.click();
    	viewcart.click();
    	ProceedtoCheckout.click();
    	Register.click();
    }
    public void signUp()
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
		 
		 
		}
	 public void Cart()
	 {
		 ClickCart.click();
		 ProceedtoCheckout1.click();
	 }
	 public void EnterDes(String des)
	 {
		 EnterDescp.sendKeys(des);
		 Placeorder.click();
	 }
	 public void Carddetails(String nm,String Card,String cv,String exp,String Expy) throws InterruptedException
	 {
		 NameonCard.sendKeys(nm);
		 Cardnum.sendKeys(Card);
		 CVC.sendKeys(cv);
		 expirymnth.sendKeys(exp);
		 Expyear.sendKeys(Expy);
		 Thread.sleep(4000);
     }
	 public void Confirmorder()
	 {
		 confirmOrder.click();
		 if(OrderplacedText.isDisplayed()) {
				System.out.println("order placed succesfully is visible:"+"\n"+OrderplacedText.getText());
			}
			else {
				System.out.println("order placed succesfully is not visible");
			}
		}
	 
	 public void fileDownload() 
	 {
		 
		         DownloadInvoice.click();
		    
		  }
	 public boolean isFileDownloaded(String filename) throws IOException
	 {
	         String downloadPath = System.getProperty("users");
	         File file = new File(downloadPath + "/Downloads/"+ filename);
	         boolean flag = (file.exists()) ? true : false ;
	         return flag;
	        
	 }
	 public void Continue() throws InterruptedException
	 {
		 //Continuebtn.click();
		 deleteAcc.click();
		 Thread.sleep(2000);
		 if(ConfirmDel.isDisplayed()) {
				System.out.println("Account deleted Sucessfully:"+"\n"+ConfirmDel.getText());
			}
			else {
				System.out.println("Account not deleted");
			}
		 
		}
	 public void CloseBrowser()
	 {
		 driver.close();
	 }
}
	 


	 
	 

