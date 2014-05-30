package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
 

   @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData();
	contact.firstname ="Nikolaj";
	contact.lastname = "Zakapko";
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
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "2", "May", "", "Rob", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

}
