package tc20;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchproductTC20 {
WebDriver driver;
	
	public SearchproductTC20(WebDriver idriver)
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
	@FindBy(xpath="//li/a[@href='/products']") WebElement produtBttn;
	@FindBy(xpath="//input[@id='search_product']") WebElement pro_Nm;
	@FindBy(xpath="//button[@id='submit_search']") WebElement search_Bttn;
	@FindBy(xpath="//div[@class='col-sm-4']/following::div[@class='productinfo text-center']/a[@data-product-id='1']") WebElement Add;
	@FindBy(xpath="//button[@data-dismiss='modal']") WebElement continue_Bttn;
	@FindBy(xpath="//a[@href='/view_cart']") WebElement Cart;
	@FindBy (xpath="//ul[@class='nav navbar-nav']/li[4]") WebElement SignupBtn;
	@FindBy (xpath="//div//form[@action=\"/login\"]/input[2]") WebElement Email;
	@FindBy (xpath="//div//form[@action=\"/login\"]/input[3]") WebElement Pass;
	@FindBy (xpath="//button[@type='submit']") WebElement Login;
	@FindBy(xpath="//a[@href='/view_cart']") WebElement Cart1;
	
	public void product()
	{
		produtBttn.click();
		
	}
	public void enterproductname(String name)
	{
		produtBttn.sendKeys(name);
	}
	public void search()
	{
		search_Bttn.click();
		Add.click();
		continue_Bttn.click();
		Cart.click();
		SignupBtn.click();
	}
	public void Enter(String eml, String pass)
	{
		Email.sendKeys(eml);
		Pass.sendKeys(pass);
	}
	public void Login()
	{
		Login.click();
		Cart1.click();
	}
}
