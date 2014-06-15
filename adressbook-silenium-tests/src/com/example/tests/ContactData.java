package com.example.tests;

public class ContactData implements Comparable<ContactData> {
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

	


	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", phonehome=" + phonehome
				+ ", phonemobile=" + phonemobile + ", phonework=" + phonework
				+ ", email=" + email + ", email2=" + email2 + ", dayborn="
				+ dayborn + ", monthborn=" + monthborn + ", yearborn="
				+ yearborn + ", namegroup=" + namegroup + ", address2="
				+ address2 + ", phone2=" + phone2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		//result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}


	@Override
	public int compareTo(ContactData other) {
		
		//return  this.lastname.toLowerCase().compareTo(other.lastname.toLowerCase());
		int lastnameresult = this.lastname.toLowerCase().compareTo(other.lastname.toLowerCase());
		if (lastnameresult != 0) {
		return lastnameresult;
		} else {
		return this.firstname.toLowerCase().compareTo(other.firstname.toLowerCase());
		}		
	}

	
	
}