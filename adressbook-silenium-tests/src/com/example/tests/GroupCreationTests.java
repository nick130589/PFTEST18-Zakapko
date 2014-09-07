package com.example.tests;



import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import static com.example.tests.GroupDataGenerator.ganerateRandomGroups;
import static com.example.tests.GroupDataGenerator.loadGroupsFromCsvFile;
import static com.example.tests.GroupDataGenerator.loadGroupsFromXmlFile;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import com.example.utils.SortedListOf;



public class GroupCreationTests extends TestBase {
	
	@DataProvider
	public Iterator<Object[]> groupsFromFile() throws IOException {
	//	return wrapGroupsDataForProvider(loadGroupsFromCsvFile(new File("groups.txt"))).iterator();
		return wrapGroupsDataForProvider(loadGroupsFromXmlFile(new File("groups.xml"))).iterator();
	}
	


@Test(dataProvider = "groupsFromFile")
  public void testGroupCreationWithValidData(GroupData group) throws Exception {
	//app.navigateTo().mainPage();
    //app.navigateTo().groupsPage();
    
    //save old state
    SortedListOf<GroupData> oldList=app.getGroupHelper().getGroups();
    
    //actions
    app.getGroupHelper().createGroup(group);
   
    	
    //save new state
    SortedListOf<GroupData> newList=app.getGroupHelper().getGroups();
    
    //compare states
    assertThat(newList, equalTo(oldList.withAdded(group)));
    }

  
}
