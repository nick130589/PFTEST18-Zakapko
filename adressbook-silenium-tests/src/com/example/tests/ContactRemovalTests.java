package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {

		@Test
	public void deleteSomeGroup() {
		app.getNavigationHelper().openMainPage();
		
		//save old state
		   List<ContactData> oldList = app.getContactHelper().getContacts();
		    
		   Random rnd = new Random(); 
		   int index = rnd.nextInt(oldList.size() - 1);
		   
		    //action
		app.getContactHelper().deleteContact(index);
		app.getNavigationHelper().returnToContactPage();
		
		//save new state
		 List<ContactData> newList = app.getContactHelper().getContacts();
	   
	   //compare states
		 	 
		 oldList.remove(index);
		 Collections.sort(oldList);
		 assertEquals(newList, oldList);
	}
		
		
}
