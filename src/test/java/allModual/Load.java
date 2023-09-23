package allModual;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.HttpResponse;


import Browser.BrowserConfiguration;

public class Load {
	
//	public WebDriver driver;
//	@BeforeTest
//		public void loadBrowser() throws InterruptedException {
//			driver=new BrowserConfiguration().ChromeBrowserSelection("Chrome", "https://parabank.parasoft.com/parabank/index.htm");
//			Thread.sleep(2000);
//		}
//		
//		@Test(invocationCount = 10, threadPoolSize = 5) // 10 users with 5 concurrent threads
//	    public void performLoadTest() throws InterruptedException {
//	        driver.get("https://parabank.parasoft.com/parabank/index.htm");
//	        Thread.sleep(2000);
//	    }
//		@AfterTest
//		public void tearDown() {
//			//driver.close();
//			driver.quit();
//		}
		
		@Test(invocationCount = 100, threadPoolSize = 10)// 1cr in 5 second (thread pool to run the test method via multiple threads.)
	    public void sendRequest() throws Exception {
	        HttpClient httpClient = HttpClients.createDefault();
	        HttpGet request = new HttpGet("https://parabank.parasoft.com/parabank/index.htm"); 
	        HttpResponse response = httpClient.execute(request);
	        int statusCode = response.getStatusLine().getStatusCode();

	        
	        if (statusCode == 200) {
	            // Successful response, continue with validation
	            // You might want to validate response content, headers, etc.
	        	System.out.println("Request is Successful");
	        } else {
	            // Handle the case where the response was not successful
	            // You can log an error, throw an exception, or take appropriate action
	        	System.out.println("Request is Not Successful");
	}
		
	        
		}
		
}

