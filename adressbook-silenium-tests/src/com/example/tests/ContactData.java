package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String phonehome;
	public String phonemobile;
	public String phonework;
	public String email;
	public String email2;
	public String dayborn;
	public String monthborn;
	public String yearborn;
	public String namegroup;
	public String address2;
	public String phone2;

	public ContactData() {
	}
	
	public ContactData(String firstname, String lastname, String address,
			String phonehome, String phonemobile, String phonework,
			String email, String email2, String dayborn, String monthborn,
			String yearborn, String namegroup, String address2, String phone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phonehome = phonehome;
		this.phonemobile = phonemobile;
		this.phonework = phonework;
		this.email = email;
		this.email2 = email2;
		this.dayborn = dayborn;
		this.monthborn = monthborn;
		this.yearborn = yearborn;
		this.namegroup = namegroup;
		this.address2 = address2;
		this.phone2 = phone2;
	}
}