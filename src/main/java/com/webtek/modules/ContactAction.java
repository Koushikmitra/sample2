package com.webtek.modules;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.webtek.helper.Log;
import com.webtek.pages.ContactusPage;
import com.webtek.pages.HomePage;
import com.webtek.test.SelTestCase;

public class ContactAction extends SelTestCase {

	public static void executed() throws Exception {
		
		try {
			HomePage.contact_us.click();
			Reporter.log("Clicking on Contact us link");
			Log.info("Clicking on Contact us link");
	} catch (Exception e) {
		Log.error("Contact Us not found");
	}
	
		try {
			Select dropDownSubjectHeading= new Select(ContactusPage.SubjectHeading);
			dropDownSubjectHeading.selectByValue("2");
			Reporter.log("Selecting value from Drop Down");
			Log.info("Selecting value from Drop Down");
		} catch (Exception e){
			Log.error("Subject Heading drop Down not found");
		}
		
		try{
			ContactusPage.EmailAdress.sendKeys("abcd@email.com");
			Reporter.log("Sending values to email");
			Log.info("Sending values to email");
		} catch (Exception e){
			Log.error("Email Field does not found");
		}
		
		try{
			ContactusPage.OrderId.sendKeys("#35790012");
			Reporter.log("Sending Order Id");
			Log.info("Sending Order Id");
		} catch (Exception e){
			Log.error("Order Id does not found");
		}
		
		try{
			ContactusPage.MessageSubmmit.sendKeys("Hi, This is Test Message");
			Reporter.log("Message area found");
			Log.info("Message area found");
		} catch (Exception e){
			Log.error("Message area not found");
		}
		
		try{
			ContactusPage.ContactSubmit.click();
			Reporter.log("Submit button found");
			Log.info("Submit button found");
		} catch (Exception e){
		Log.error("Submit Button not found");
		}
		
			
	}
	
	
	

}
