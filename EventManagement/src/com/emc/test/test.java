package com.emc.test;

import com.emc.entities.*;

public class test {

	public static void main(String[] args) {
     
		Event ev = new Event();
		ev.description="All are welcome";
	//	System.out.println(ev);
		System.out.println(ev.description);
		
		Venue vn = new Venue(4,"Delhi");
		System.out.println("\nID: "+vn.id+"  Name: "+vn.city);
	}
}
