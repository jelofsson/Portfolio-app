package com.example.portfolioapp;

import android.location.Address;

public class Jimmi extends Person {
	
	public Jimmi()
	{
		super();
		
		// Person info:
		name		= "Jimmi Elofsson";
		description = "Webdesigner/Programmer";
		pictures.add("drawable/headpic_jimmi");
		
		// Project 1:
		Project p1 = new Project();
		p1.name = "Conpot.se";
		p1.description = "Conpot- Den bästa tidningen för entreprenörer inom anläggning, bygg och verkstad";
		p1.url = "http://www.conpot.se/";
		p1.pictures.add("drawable/conpot");
		p1.pictures.add("drawable/conpot2");
		projects.add(p1);
		// Project 2:
		Project p2 = new Project();
		p2.name = "Köpsiten";
		p2.description = "Köp & sälj-site!";
		p2.url = "http://apps.facebook.com/bloppis";
		p2.pictures.add("drawable/kopsiten1");
		p2.pictures.add("drawable/kopsiten2");
		p2.pictures.add("drawable/kopsiten3");
		projects.add(p2);
	}

}