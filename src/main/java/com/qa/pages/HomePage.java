package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePge {
	@FindBy(xpath="//span[@class='user-display']")
	WebElement username;
	
	@FindBy(xpath="//a[contains(text(),'Free account')]")
	WebElement freeaccount;

	@FindBy(xpath="//i[@class='trash alternate outline icon']")
	WebElement deleteIcon;
	
	public boolean username(){
		return username.isDisplayed();
	}
}
