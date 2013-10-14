package com.example.portfolioapp;

import android.location.Address;

public class Jimmi extends Person {
	
	public Jimmi()
	{
		super();
		
		// Person info:
		name		= "Jimmi Elofsson";
		description = "Webdesigner/Programmer";
		pictures.add("Jimmi1");
		
		// Project 1:
		Project p = new Project();
		p.description = "Portfolio app!";
		p.pictures.add("Picture_1");
		p.pictures.add("Picture_2");
		projects.add(p);
	}

}
