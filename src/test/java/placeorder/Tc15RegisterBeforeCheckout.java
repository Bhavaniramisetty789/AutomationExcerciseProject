package placeorder;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Tc15RegisterBeforeCheckout {

WebDriver driver;
	
	public Tc15RegisterBeforeCheckout(WebDriver idriver)
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
	
	@FindBy (xpath="//ul[@class='nav navbar-nav']/li[4]") WebElement SignupBtn;
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
	@FindBy(xpath="//button[@class='btn btn-default']") WebElement CreateAcct;
	@FindBy (xpath="//h2[@class='title text-center']/b") WebElement VerifyAcc;
    @FindBy (xpath="//a[@class='btn btn-default add-to-cart']") WebElement AddtoCart;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement Continueshop;
    @FindBy (xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a") WebElement AddtC;
    @FindBy (xpath="//ul[@class='nav navbar-nav']/li[3]") WebElement clickcart;
    @FindBy(id="cart_items") WebElement Verifycartpage;
    @FindBy (xpath="//a[@class='btn btn-default check_out']") WebElement ProceedtoCheckout;
    @FindBy (name="message") WebElement EnterDescp;
	@FindBy (linkText="Place Order") WebElement Placeorder;
	@FindBy(name="name_on_card") WebElement NameonCard;
	@FindBy(name="card_number") WebElement Cardnum;
	@FindBy (name="cvc") WebElement CVC;
	@FindBy (name="expiry_month") WebElement expirymnth;
	@FindBy(name="expiry_year") WebElement Expyear;
	@FindBy (xpath="//button[@class='form-control btn btn-primary submit-button']") WebElement confirmOrder;
	//@FindBy(xpath="//*[@id=\"form\"]/div/div/div/p") WebElement orderplacedmsg;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[5]/a") WebElement deleteAcc;
	//@FindBy(xpath="//*[@id=\"form\"]/div/div/div/p[1]") WebElement verifydeleteAccmsg;
	@FindBy (xpath="//div[@class='pull-right']/a")WebElement clickContinue;
	
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
 }
	 public void Addtocart() throws InterruptedException
		{
			AddtoCart.click();
			Thread.sleep(2000);
			Continueshop.click();
			Thread.sleep(2000);
			AddtC.click();
			clickcart.click();
			
			//To verify products added to cart
					if(Verifycartpage.isDisplayed()) {
						System.out.println("Products added to cart is visible:"+"\n"+Verifycartpage.getText());
					}
					else {
						System.out.println("Products not added to cart");
					}
				}
				
			public void proceedtocheckout() 
			
			{
				ProceedtoCheckout.click();
				
			}
			  
				 
				 //To Placeorder and Checkout
				 public void clickcart1() throws InterruptedException
				 {
					 clickcart.click();
					 ProceedtoCheckout.click();
					 Thread.sleep(3000);
					 JavascriptExecutor js=(JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,800)", "");
				 } 
					 
					 public void Enterdes(String des)
					 {
						 EnterDescp.sendKeys(des);
					 }
					
				      public void Placeorder()
					{
						Placeorder.click();
					}
					 
					
				 
				 //Enter the card details
				 public void Carddetails(String nm,String Card,String cv,String exp,String Expy) throws InterruptedException
				 {
					 NameonCard.sendKeys(nm);
					 Cardnum.sendKeys(Card);
					 CVC.sendKeys(cv);
					 expirymnth.sendKeys(exp);
					 Expyear.sendKeys(Expy);
					 Thread.sleep(4000);
			     }
				 
				 //Confirm Order
				 public void ConfirmOrder() throws InterruptedException
				 {
					 confirmOrder.click();
					 Thread.sleep(5000);
			     //To Continue
					        clickContinue.click();
					        Thread.sleep(4000);
				 }
					 public void Closebrowser()
					 {
						 driver.close();
					 }
					
	
}
