package com.example.tests;


import static org.testng.Assert.assertEquals;

import java.util.Collections;

import java.util.List;




import static com.example.fw.ContactHelper.CREATION;

public class ContactCreationTests extends TestBase {
	

		@org.testng.annotations.Test(dataProvider = "randomValidContactGenerator")
  public void testContactCreationWithValidData(ContactData contact) throws Exception {
	app.navigateTo().mainPage();
    
    
    //save old state
    List<ContactData> oldList = app.getContactHelper().getContacts();
    
   	//actions
	app.navigateTo().initContactCreation();
	app.getContactHelper().fillContactForm(contact,CREATION);
    app.getContactHelper().submitContactCreation();
    app.navigateTo().returnToContactPage();
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    //compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }

}
