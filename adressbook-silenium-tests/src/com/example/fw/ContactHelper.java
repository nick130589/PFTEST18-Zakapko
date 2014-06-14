package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		//submit check contact
		click(By.xpath("//input[@name='selected[]'][" +(index+1)+ "]"));
	}

	public void submitContactDelete() {
		//submit contact Delete
		click(By.xpath("//input[@name='update'][@value='Delete']"));
		
	}

	public void submitContactModification() {
		//submit contact update
		click(By.name("update"));
		
	}

	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkboxe : checkboxes) {
			ContactData contact = new ContactData();
			String title= checkboxe.getAttribute("title");
			contact.firstname =title.substring("Select (".length(), title.indexOf(" ", "Select (".length()));
			contact.lastname =title.substring("Select (".length()+contact.firstname.length()+1,title.length()-" ".length());
			contacts.add(contact);
		}
		return contacts;
	}

}
