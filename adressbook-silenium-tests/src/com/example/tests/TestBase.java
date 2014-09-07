package com.example.tests;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;
import com.example.tests.ContactData;
import com.steadystate.css.dom.Property;

import static com.example.tests.GroupDataGenerator.ganerateRandomGroups;

public class TestBase {
	protected static ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		String configFile = System.getProperty("configFile","application.properties");
		Properties properties = new Properties();
		properties.load(new FileReader(new File(configFile)));
		app = new ApplicationManager(properties);
	    
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	    
	  }
	//@DataProvider
	//public Iterator<Object[]> randomValidGroupsGenerator() {
		/*List<Object[]> list = new ArrayList<Object[]>();
		for(int i=0;i<5;i++){
			GroupData group = new GroupData()
			.withName(generateRandomString())
			.withHeader(generateRandomString())
			.withFooter(generateRandomString());
			list.add(new Object[] {group});
		}*/
	//	return wrapGroupsDataForProvider(ganerateRandomGroups(5)).iterator();
	//}
	
	
	public static List<Object[]> wrapGroupsDataForProvider(List<GroupData> groups) {
		List<Object[]> list = new ArrayList<Object[]>();
		for (GroupData group : groups) {
			list.add(new Object[]{group});
		}
		return list;
	}

	@DataProvider
	public Iterator<Object[]> randomValidContactGenerator(){
		List<Object[]> list = new ArrayList<Object[]>();
		
		for (int i=0; i < 5; i++){
			ContactData address = new ContactData();
		
			address.firstname = generateRandomContactString() ;
			address.lastname = generateRandomContactString();
			    address.address = "Adress";
			    address.phonehome = "101";
			    address.phonemobile = "102";
			    address.phonework = "103";
				address.email = "name@df.com";
				address.email2 = "-";
				address.dayborn = "4";
				address.namegroup = "April";
				address.yearborn = "1987";
				//address.groups = "[none]";
				address.address2 = " ";
				address.phone2 = "-";
				list.add(new Object[]{address});
		}
		return list.iterator();
	}
		
	/*public String generateRandomString() {
		Random rnd = new Random();
		if(rnd.nextInt(3)==0){
			return "";
		} else {
			return "test"+rnd.nextInt();
		}
	}*/
	
	public String generateRandomContactString(){
		Random rnd = new Random();
		if(rnd.nextInt(3) == 0){
			return "";
		} 
		else{
			return "test_"+rnd.nextInt();
		}
	}
}
