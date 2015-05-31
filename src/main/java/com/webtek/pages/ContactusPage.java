package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ContactusPage {
	
private WebDriver driver;

//creating a constructor.

public ContactusPage (WebDriver driver){
 this.driver=driver;	
}
@FindBy(how=How.ID,using="id_contact")
public static WebElement SubjectHeading;

@FindBy(how=How.ID,using="email")
public static WebElement EmailAdress;

@FindBy(how=How.ID, using="id_order")
public static WebElement OrderId;

@FindBy(how=How.ID, using="fileUpload")
public static WebElement FiletobeUpload;

@FindBy(how=How.ID, using="message")
public static WebElement MessageSubmmit;

@FindBy(how=How.ID, using="submitMessage")
public static WebElement ContactSubmit;

}
