package com.example.portfolioapp;

public class Kaan extends Person {
	
	public Kaan()
	{
		super();
		
		// Person info:
		name		= "Kaan Orgunmat";
		description = "Webdesigner/Programmer";
		
		// Project 1:
		Project p1 = new Project();
		p1.name = "";
		p1.description = "description";
		p1.pictures.add("drawable/picture");
		projects.add(p1);
		// Project 2:
		/*
		Project p2 = new Project();
		p2.name = "Köpsiten";
		p2.description = "Köp & sälj-site!";
		p2.pictures.add("drawable/kopsiten1");
		p2.pictures.add("drawable/kopsiten2");
		p2.pictures.add("drawable/kopsiten3");
		projects.add(p2);
		*/
	}

}