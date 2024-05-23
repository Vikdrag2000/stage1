package com.emc.entities;

public class Venue extends EMBase{
       

	public String description;
	public String city;
	public String country;
	public String state;
	public String pincode;
	public String street_Address;
	
	public Venue(int id,String city) {
		this.id=id;
		this.city=city;
	}

}
