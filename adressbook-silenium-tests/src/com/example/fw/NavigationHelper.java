package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	protected NavigationHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void openMainPage() {
	    driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void gotoGroupsPage() {
	  click(By.linkText("groups"));
	}
	
	public void initContactCreation() {
		//init add new contact
	    click(By.linkText("add new"));
	}
	
	public void returnToContactPage() {
		//return to contact page
		click(By.linkText("home page"));
	}

}
