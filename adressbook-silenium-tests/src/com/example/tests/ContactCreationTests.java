package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
 

   @Test
  public void testNonEmptyContactCreation() throws Exception {
	openMainPage();
    initContactCreation();
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
	fillContactForm(contactfill);
    submitContactCreation();
    returnToContactPage();
  }

  @Test
  public void testEmptyContactCreation() throws Exception {
	openMainPage();
    initContactCreation();
    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "2", "May", "", "Rob", "", ""));
    submitContactCreation();
    returnToContactPage();
  }

}
