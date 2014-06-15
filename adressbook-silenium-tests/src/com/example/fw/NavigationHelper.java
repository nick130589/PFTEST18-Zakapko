package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	protected NavigationHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void mainPage() {
		if(! onMainPage()){
			click(By.linkText("home"));
		}
	   }

	private boolean onMainPage() {
		return driver.findElements(By.id("maintable")).size() >0;
	}

	public void groupsPage() {
		if(! onGroupsPage()){
			click(By.linkText("groups"));
		}
	 }
	
	private boolean onGroupsPage() {
		if(driver.getCurrentUrl().contains("/group.php")
			&& driver.findElements(By.name("new")).size() >0 ){
			return true;
		} else {
			return false;
		}
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
