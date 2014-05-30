package com.example.tests;

import org.testng.annotations.Test;

public class ContatcModificatioTests extends TestBase {
	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().editContact(1);
		ContactData contact = new ContactData();
		contact.lastname = "newname";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactModification();
		app.getContactHelper().returnToContactPage();
	}
}
