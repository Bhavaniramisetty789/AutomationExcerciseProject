package placeorder;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginbeforecheckoutTc16 {
WebDriver driver;
	
	public LoginbeforecheckoutTc16(WebDriver idriver)
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
	@FindBy (xpath="//div//form[@action=\"/login\"]/input[2]") WebElement Email;
	@FindBy (xpath="//div//form[@action=\"/login\"]/input[3]") WebElement Pass;
	@FindBy (xpath="//button[@type='submit']") WebElement Login;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[10]/a") WebElement Verifyacc;
	@FindBy (xpath="//a[@class='btn btn-default add-to-cart']") WebElement AddtoCart;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement Continueshop;
    @FindBy (xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a") WebElement AddtC;
    @FindBy (xpath="//ul[@class='nav navbar-nav']/li[3]") WebElement clickcart;
   // @FindBy(id="cart_items") WebElement Verifycartpage;
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
	
	//To Login
	public void ClickonSignup()
	{
		SignupBtn.click();
	}
	public void enteremail(String eml)
	{
		Email.sendKeys(eml);
	}
	public void enterpassword(String pwd)
	{
		Pass.sendKeys(pwd);
	}
	public void Login()
	{
		Login.click();
	}
	//verify Account
	
	public void Verifyacc()
	
	{
		Verifyacc.getText();
	}

	public void Addtocart() throws InterruptedException
	{
		AddtoCart.click();
		Thread.sleep(2000);
		Continueshop.click();
		Thread.sleep(2000);
		AddtC.click();
		clickcart.click();
		
}
			
		public void proceedtocheckout() 
		
		{
			ProceedtoCheckout.click();
			
		}
		
			 public void EnterDescp(String des)
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
		 


