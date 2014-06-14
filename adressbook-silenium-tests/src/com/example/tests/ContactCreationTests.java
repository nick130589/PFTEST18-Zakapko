package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
 

   @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    
    
    //save old state
    List<ContactData> oldList = app.getContactHelper().getContacts();
    
    ContactData contact = new ContactData();
	contact.firstname ="bbbB";
	contact.lastname = "aaaa";
	contact.address = "Adress";
	contact.phonehome = "101";
	contact.phonemobile = "102";
	contact.phonework = "103";
	contact.email = "name@df.com";
	contact.email2 = "-";
	contact.dayborn = "4";
	contact.monthborn = "April";
	contact.yearborn = "1987";
	contact.namegroup = "Test";
	contact.address2 = "address2";
	contact.phone2 = "104";
	//actions
	app.getContactHelper().initContactCreation();
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    //compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }

  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	
	//save old state
    List<ContactData> oldList = app.getContactHelper().getContacts();
	
    //actions
    ContactData contact = new ContactData("", "", "", "", "", "", "", "", "2", "May", "", "Rob", "", "");
    app.getContactHelper().initContactCreation();
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    //compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }

}
