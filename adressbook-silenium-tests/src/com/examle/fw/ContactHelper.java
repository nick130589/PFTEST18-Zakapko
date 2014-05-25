package com.examle.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		//init add new contact
	    driver.findElement(By.linkText("add new")).click();
	}

	public void fillContactForm(ApplicationManager applicationManager, TestBase testBase, ContactData contactfill) {
		// fill contact form
		    driver.findElement(By.name("firstname")).clear();
		    driver.findElement(By.name("firstname")).sendKeys(contactfill.firstname);
		    driver.findElement(By.name("lastname")).clear();
		    driver.findElement(By.name("lastname")).sendKeys(contactfill.lastname);
		    driver.findElement(By.name("address")).clear();
		    driver.findElement(By.name("address")).sendKeys(contactfill.address);
		    driver.findElement(By.name("home")).clear();
		    driver.findElement(By.name("home")).sendKeys(contactfill.phonehome);
		    driver.findElement(By.name("mobile")).clear();
		    driver.findElement(By.name("mobile")).sendKeys(contactfill.phonemobile);
		    driver.findElement(By.name("work")).clear();
		    driver.findElement(By.name("work")).sendKeys(contactfill.phonework);
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(contactfill.email);
		    driver.findElement(By.name("email2")).clear();
		    driver.findElement(By.name("email2")).sendKeys(contactfill.email2);
		    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(contactfill.dayborn);
		    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(contactfill.monthborn);
		    driver.findElement(By.name("byear")).clear();
		    driver.findElement(By.name("byear")).sendKeys(contactfill.yearborn);
		    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactfill.namegroup);
		    driver.findElement(By.name("address2")).clear();
		    driver.findElement(By.name("address2")).sendKeys(contactfill.address2);
		    driver.findElement(By.name("phone2")).clear();
		    driver.findElement(By.name("phone2")).sendKeys(contactfill.phone2);
	}

	public void submitContactCreation() {
		//submit contact creation
		driver.findElement(By.name("submit")).click();
	}

	public void returnToContactPage() {
		//return to contact page
		manager.driver.findElement(By.linkText("home page")).click();
	}

}
