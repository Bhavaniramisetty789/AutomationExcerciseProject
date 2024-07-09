package Masterclass;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import tc18and19.TC19Brands;
import tc18and19.WomenCatTC18;
import tc20.SearchproductTC20;
import tc21.Reviewproduct;
import tc22.AddtofromRecmPro;
import tc23.VerifyaddressinCheckout;
import tc24.DownloadInvoice;
import tc17.RemoveProducts;
import placeorder.LoginbeforecheckoutTc16;
import placeorder.Registerwhilecheckout;
import placeorder.Tc15RegisterBeforeCheckout;
import tc13.QuantityTestCase;
import tc12.AddProductsTestcase12;
import tc11.CartSubTC11;
import tc9.SearchProductTc9;
import tc10.HomePageSubcrp;
import tc8.Productspage;
import tc7.TestCasesPage;
import contactus.ContactUsTC6;
import tc5.TC5RegwithexistuserId;
import login.LoginwithCorrectEmail;
import login.LoginwithIncorrectEmail;
import login.Logout;
import tc1.CreateAcc;

public class MasterclassExecution 
{
	
	 WebDriver driver;
	 CreateAcc CA ;
	 LoginwithCorrectEmail LE;
	 LoginwithIncorrectEmail LI;
	 Logout LG;
	 TC5RegwithexistuserId TC ;
	 ContactUsTC6 CT;
	 TestCasesPage TP ;
	 Productspage PP;
	 SearchProductTc9 SP;
	 HomePageSubcrp HPS;
	 CartSubTC11 CS;
	 AddProductsTestcase12 ATC ;
	 QuantityTestCase QC ;
	 Registerwhilecheckout RC;
	 Tc15RegisterBeforeCheckout RB;
	 LoginbeforecheckoutTc16 LB;
	 RemoveProducts RP;
	 WomenCatTC18 WC ;
	 TC19Brands BC;
	 SearchproductTC20 sp;
	 Reviewproduct Rp ;
	 AddtofromRecmPro AR;
	 VerifyaddressinCheckout VA;
	 DownloadInvoice DI;
	 
	 @BeforeSuite
		public void setUp() {
	 
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CA = new CreateAcc(driver);
		LE = new LoginwithCorrectEmail(driver);
		LI = new LoginwithIncorrectEmail (driver);
		LG = new Logout(driver);
		TC = new TC5RegwithexistuserId(driver);
		CT = new ContactUsTC6(driver);
		TP =new TestCasesPage(driver);
	    PP= new Productspage (driver);
	    SP = new SearchProductTc9(driver);
	    HPS= new HomePageSubcrp(driver);
	    CS= new  CartSubTC11(driver);
	    ATC = new AddProductsTestcase12(driver);
	    QC =new  QuantityTestCase(driver);
	    RC = new  Registerwhilecheckout(driver);
	    RB = new Tc15RegisterBeforeCheckout(driver);
	    LB = new LoginbeforecheckoutTc16(driver);
	    RP = new RemoveProducts(driver);
	    WC = new WomenCatTC18(driver);
	    BC= new TC19Brands(driver);
	    sp= new SearchproductTC20(driver);
	    Rp = new Reviewproduct(driver);
	    AR = new AddtofromRecmPro(driver);
	    VA= new VerifyaddressinCheckout(driver);
	    DI = new DownloadInvoice(driver);
	 }	
	 
	 @Test(priority = 1)
		public void CreateAcc() throws InterruptedException {
		CA.LaunchUrl();
		CA.enterName("Bhavani");
		CA.enterEmail1("Bhavaniramisetty88@gmail.com");
	    CA.clickOnSignup();
		CA.SelectRadioBtn();
		CA.enterpassword("bhavani@123");
		CA.SelectDay("21");
		CA.SelectMonth("February");
		CA.SelectYear("1990");
		CA.selectCheckbox();
		CA.SelectreceiveLetter();
		CA.Enteraddress("Bhavani", "R", "Excelr", "Hyderabad", "jayanagar", "India", "Telengana", "Kukatpally", "500072", "8247752018");
        CA.ClickonContinue();
        CA.DeleteAccount();
	 }
	 @Test(priority = 2)
		public void LoginUserWithCorrectEmail() throws InterruptedException {
		LE.LaunchUrl();
		LE.enterEmail("bhavaniramisetty21@gmail.com");
		LE.enterPassword("bhavani@123");
		LE.clickOnLoginBtn();
		LE.clickOnLogout();
	 }
	 @Test(priority = 3)
		public void LoginwithInCorrectEmail() throws InterruptedException {
		 LI.url();
		 LI.loginUser();
	     LI.enterLoginDetails("likith@gmail.com", "Likitha");
         LI.clickLogin();
		 LI.closeBrowser();
        
	 }
	 @Test(priority = 4)
		public void Logout() throws InterruptedException {
	     LG.URL();
        LG.EnterEmail("bhavaniramisetty21@gmail.com");
        LG.Enterpassword("bhavani@123");
        LG.Login();
        LG.Logout();
	 }	
	 
	 
	 @Test(priority = 5)
		public void RegwithexistuserId() throws InterruptedException {
		TC.Launchurl();
		TC.reguser();
		TC.SignupLogin();
		TC.entername("bhavani");
		TC.enterEmail("bhavaniramisetty21@gmail.com");
		TC.signUp();
	 }
	
	 @Test(priority = 6)
		public void  ContactUsTC6 () throws InterruptedException {
		 CT.LaunchBrowser();
		 CT.VerifyHomepage();
		 CT.clickonContactUs();
		 CT.GetIn();
		 CT.entername("Bhavani");
		 CT.Email("bhavaniramisetty21@gmail.com");
		 CT.EnterSubject("Hi");
		 CT.EnterMessage("Hello");
		 CT.Uploadfile();
		 CT.closeBrowser();
	 }
	 @Test(priority = 7)
		public void TestCasesPage() throws InterruptedException {
        TP.url();
		TP.Testcases();
		TP.NavigateTcpage();
		TP.CloseBrowser();
	 }
	 @Test(priority = 8)
		public void Productspage() throws InterruptedException {
		PP.url();
		PP.Productspage();
	 }
	 @Test(priority = 9)
		public void SearchProductTc9() throws InterruptedException {
		SP.url();
		SP.Search();
	 }
	 @Test(priority = 10)
		public void HomePageSubcrp() throws InterruptedException {
		HPS.URL();
		HPS.VerifySub();
		HPS.Enteremail("Bhavaniramisetty21@gmail.com");
		
	 }
	 @Test(priority = 11)
		public void CartSubTC11() throws InterruptedException {
		 CS.URL();
		 CS.VerifySub();
		 CS.Enteremail("bhavaniramisetty21@gmail.com");
	 }	
	 @Test(priority = 12)
		public void AddProductsTestcase12() throws InterruptedException {
		ATC.url();
		ATC.AddtoCart();
	 }
	 @Test(priority = 13)
		public void QuantityTestCase() throws InterruptedException
	 
	 {
		 QC.url();
		 QC.ViewProduct();
		 QC.Productdetails();
		 QC.Quantity();
		 QC.QntCheck();
	 }
	 @Test(priority = 14)
		public void Registerwhilecheckout() throws InterruptedException {
		    RC.url();
		    RC.Addtocart();
		    RC.proceedtocheckout();
		    RC.ClickonRegister();
		    RC.enterName("Sam");
		    RC.enterEmail("samrami2033@gmail.com");
			RC.clickOnSignup();
			RC.SelectRadioBtn();
			RC.enterName("Sam");
			RC.enterpassword("Sam@123");
			RC.SelectDay("4");
			RC.SelectMonth("September");
			RC.SelectYear("2020");
			RC.selectCheckbox();
			RC.SelectreceiveLetter();
		    RC.Enteraddress("Bhavani", "R", "Excelr", "Hyderabad", "jayanagar", "India", "Telengana", "Kukatpally", "500072", "8247752018");
		    RC.ClickonContinue();
		    RC.clickcart1();
		    RC.Enterdes("Hello");
		    RC.Placeorder();
		    RC.Carddetails("Bhavani","1233789034560120", "343", "07","2026");
		    RC.ConfirmOrder();
		    RC.ClickonContinue();
		    RC.Closebrowser();
	 }
	 @Test(priority = 15)
		public void Tc15RegisterBeforeCheckout() throws InterruptedException {
		          RB.url();
			      RB.Addtocart();
			      RB.proceedtocheckout();
			      RB.enterName("Sam");
				  RB.enterEmail("samrami2033@gmail.com");
				  RB.clickOnSignup();
				  RB.SelectRadioBtn();
				  RB.enterName("Sam");
				  RB.enterpassword("Sam@123");
				  RB.SelectDay("4");
				  RB.SelectMonth("September");
				  RB.SelectYear("2020");
				  RB.selectCheckbox();
				  RB.SelectreceiveLetter();
			      RB.Enteraddress("Bhavani", "R", "Excelr", "Hyderabad", "jayanagar", "India", "Telengana", "Kukatpally", "500072", "8247752018");
			      RB.clickcart1();
			      RB.Enterdes("Hello");
			      RB.Placeorder();
			      RB.Carddetails("Bhavani","1233789034560120", "343", "07","2026");
			      RB.ConfirmOrder();
			      RB.Closebrowser();
	 }

		@Test(priority = 16)
		
		public void LoginbeforecheckoutTc16() throws InterruptedException {
		           LB.url();
		           LB.ClickonSignup();
		           LB.enteremail("bhavaniramisetty21@gmail.com");
		           LB.enterpassword("bhavani@123");
		           LB.Login();
		           LB.Addtocart();
		           LB.proceedtocheckout();
		           LB.EnterDescp("hello");
		           LB.Placeorder();
		           LB.Carddetails("Bhavani","1233789034560120", "343", "07","2026");
		           LB.ConfirmOrder();
		           LB.Closebrowser();
		}
		@Test(priority = 17)
		public void RemoveProducts() throws InterruptedException {
		RP.url();
		RP.Addtocart();
		}
		
		  @Test(priority = 18)
		  public void WomenCatTC18 () throws InterruptedException {
		      WC.url();
		      WC.viewCategory();
		      WC.subCategory();
		}
		  @Test(priority = 19)
			public void TC19Brands() throws InterruptedException {
		  
		       BC.url();
		       BC.Brands();
		  }
		  @Test(priority = 20)
			public void SearchProductTC20() throws InterruptedException {
		
		     sp.url();
		     sp.product();
		     sp.enterproductname("Tops");
		     sp.search();
		     sp.Enter("bhavaniramisetty21@gmail.com","bhavani@123");
		     sp.Login();
		  }
		  @Test(priority = 21)
			public void ReviewProduct() throws InterruptedException {
		           Rp.url();
	               Rp.products();
		           Rp.Review("bhavani", "bhavaniramisetty21@gmail.com", "So good");
		           Rp.Submit();
		  }
		  @Test(priority = 22)
			public void AddtofromRecmPro() throws InterruptedException {
			
		        AR.url();
	         	AR.Addtocart();
		  }
		  @Test(priority = 23)
			public void VerifyaddressinCheckout() throws InterruptedException {
		  
		      VA.url();
		      VA.Signup();;
		      VA.enterName("Sam");
			  VA.enterEmail("samrami2062@gmail.com");
			  VA.clickOnSignup();
			  VA.SelectRadioBtn();
			  VA.enterpassword("Sam@123");
			  VA.SelectDay("4");
			  VA.SelectMonth("September");
			  VA.SelectYear("2020");
			  VA.selectCheckbox();
			  VA.SelectreceiveLetter();
		      VA.Enteraddress("Bhavani", "R", "Excelr", "Hyderabad", "jayanagar", "India", "Telengana", "Kukatpally", "500072", "8247752018");
		      VA.Addtocart();
		      VA.proceedtocheckout();
		      VA.CloseBrowser();
		  }
		  @Test(priority = 24)
			public void DownloadInvoice() throws InterruptedException {
	
		   DI.url();
		   DI.AddProduct();
		   DI.signUp();
		   DI.enterName("Sam");
		   DI.enterEmail("samrami2068@gmail.com");
		   DI.clickOnSignup();
		   DI.SelectRadioBtn();
		   DI.enterpassword("Sam@123");
		   DI.SelectDay("4");
		   DI.SelectMonth("September");
		   DI.SelectYear("2020");
		   DI.selectCheckbox();
		   DI.SelectreceiveLetter();
		   DI.Enteraddress("Bhavani", "R", "Excelr", "Hyderabad", "jayanagar", "India", "Telengana", "Kukatpally", "500072", "8247752018");
		   DI.Cart();
		   DI.EnterDes("Hello");
		   DI.Carddetails("Bhavani", "367836273692", "676", "09", "2026");
		   DI.Confirmorder();
		   DI.fileDownload();
		   DI.Continue();
		   DI.CloseBrowser();
		  }
		   
	}   

				
	  

	
		


