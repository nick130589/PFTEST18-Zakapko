package com.examle.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;



public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		//init add new contact
	    click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		// fill contact form
			type(By.name("firstname"), contact.firstname);
		    type(By.name("lastname"), contact.lastname);
		    type(By.name("address"), contact.address);
		    type(By.name("home"), contact.phonehome);
		    type(By.name("mobile"), contact.phonemobile);
		    type(By.name("work"), contact.phonework);
		    type(By.name("email"), contact.email);
		    type(By.name("email2"), contact.email2);
		    selectByText(By.name("bday"), contact.dayborn);
		    selectByText(By.name("bmonth"), contact.monthborn);
		    type(By.name("byear"), contact.yearborn);
		    //selectByText(By.name("new_group"), contact.namegroup);
		    type(By.name("address2"), contact.address2);
		    type(By.name("phone2"), contact.phone2);
	}

	

	public void submitContactCreation() {
		//submit contact creation
		click(By.name("submit"));
	}

	public void returnToContactPage() {
		//return to contact page
		click(By.linkText("home page"));
	}
	
	
	public void editContact(int index) {
		//click(By.name("selected[]"));
		selectContactByIndex(index);
		click(By.xpath("//img[@alt='Edit']"));
	}
	
	private void selectContactByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" +index+ "]"));
	}

	public void submitContactDelete() {
		click(By.xpath("//input[@name='update'][@value='Delete']"));
		
	}

	public void submitContactModification() {
		//submit contact update
		click(By.name("update"));
		
	}

}
