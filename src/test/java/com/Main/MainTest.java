package com.Main;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.BrowserConfiguration;
import allModual.ATM_Services_Page;
import allModual.AccountOverview;
import allModual.Admin_Page;
import allModual.All_Logo;
import allModual.Bill_pay;
import allModual.Check_All_Button;
import allModual.Find_Transactions;
import allModual.Footer_Link;
import allModual.Forgot_Login_Page;
import allModual.Letests_News_Page;
import allModual.Load;
import allModual.LoginPage;
import allModual.Logout;
import allModual.Online_Services_Page;
import allModual.OpenNewAccountPage;
import allModual.Request_Loan;
import allModual.Sign_Up_Page;
import allModual.Solutions_page;
import allModual.Transfer_funds;

public class MainTest {
	
	WebDriver driver=null;
	LoginPage lP =null;
    AccountOverview AC=null;
	Admin_Page ad=null;
	All_Logo logo=null;
	ATM_Services_Page AT=null;
	Bill_pay Bill=null;
	Check_All_Button AB=null;
	Find_Transactions fi=null;
	Footer_Link FO=null;
	Forgot_Login_Page FL=null;
	Letests_News_Page LN=null;
	Online_Services_Page OS=null;
	OpenNewAccountPage ONA=null;
	Request_Loan RL=null;
	Sign_Up_Page SU=null;
	Solutions_page SP=null;
	Transfer_funds TF=null;
	Logout LO=null;
	Load load=null;
	
	
	
	@BeforeTest
	public void loadBrowser() throws InterruptedException {
		driver=new BrowserConfiguration().ChromeBrowserSelection("Chrome", "https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
	}
	@BeforeTest
	public void beforeTest() {
		lP=new LoginPage();
		AC=new AccountOverview();
		
	}
	@Test(priority = 0)
	public void loginDetils() throws InterruptedException {
		lP.enterUsername(driver, "sahil12");
		lP.enterPassword(driver, "pass1");
		lP.clickLogin(driver);
	}
	
	
	@Test(priority = 1)
 public void overview() throws InterruptedException {
	    AC=new AccountOverview();
	    AC.overview(driver);
}
	
	@Test(priority = 2)
	public void fundTransfer() throws InterruptedException {
		TF=new Transfer_funds();
		TF.funds(driver);
	}
	
	@Test(priority = 3)
	public void billPay() throws InvalidFormatException, InterruptedException, IOException {
		Bill =new Bill_pay();
		Bill.bill_pay(driver);
		
		
	}
	@Test(priority = 4)
	public void find_transation() throws InterruptedException {
		fi=new Find_Transactions();
		fi.findbyidd(driver);
		Thread.sleep(2000);
		fi.findbyDate(driver);
		Thread.sleep(2000);
		fi.findbyDateRang(driver);
		Thread.sleep(2000);
		fi.amount(driver);
	}
	
	 @Test(priority = 5)
	public void loanRequest() throws InterruptedException, IOException {
		RL=new Request_Loan();
		RL.downpayment(driver);
		RL.valid(driver);
		RL.invalid(driver);
		
	}
	 
	 @Test(priority = 6)
	 public void allButtonCheck() throws InterruptedException {
		AB=new Check_All_Button();
		AB.check(driver);
	}
	 
	 @Test(priority = 7)
	 public void openNEWACCOUNTT() throws InterruptedException {
		ONA =new OpenNewAccountPage();
		ONA.newAcc(driver);
	}
	 
	 @Test(priority = 8)
	 public void logoutt() throws InterruptedException {
		LO=new Logout();
		LO.logginOut(driver);
	}
	 
	 @Test(priority = 9)
	 public void aTM_PAGE() throws InterruptedException {
		AT=new ATM_Services_Page();
		AT.atm(driver);
	}
	 
	 @Test(priority = 10)
	 public void oNLINE_SERVICE() throws InterruptedException {
		 OS=new Online_Services_Page();
		 OS.service(driver);
		
	}
	 
	 @Test(priority = 11)
	 public void fOOTER_PAGE() throws InterruptedException {
		FO=new Footer_Link();
		FO.footer(driver);
		}
	 
	 @Test(priority = 13)
	 public void news() throws InterruptedException {
		LN=new Letests_News_Page();
		LN.news(driver);
	}
	 
	
	
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		System.out.println("Bye Bye....");
		Thread.sleep(2000);
	}
	
}
