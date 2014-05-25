package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
 

   @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    ContactData contactfill = new ContactData();
	contactfill.firstname ="Nikolaj";
	contactfill.lastname = "Zakapko";
	contactfill.address = "Adress";
	contactfill.phonehome = "101";
	contactfill.phonemobile = "102";
	contactfill.phonework = "103";
	contactfill.email = "name@df.com";
	contactfill.email2 = "-";
	contactfill.dayborn = "4";
	contactfill.monthborn = "April";
	contactfill.yearborn = "1987";
	contactfill.namegroup = "Test";
	contactfill.address2 = "address2";
	contactfill.phone2 = "104";
	app.getContactHelper().fillContactForm(app, this, contactfill);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(app, this, new ContactData("", "", "", "", "", "", "", "", "2", "May", "", "Rob", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

}
