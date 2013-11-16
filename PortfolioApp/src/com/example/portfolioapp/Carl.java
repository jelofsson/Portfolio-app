package com.example.portfolioapp;



public class Carl extends Person {
	
	public Carl()
	{
		super();
		
		// Person info:
		name		= "Carl Blockås";
		description = "Webdesigner/Programmer";
		pictures.add("drawable/headpic_carl");

		//About Carl
		Project p = new Project();
		p.name = "Carl Blockås";
		p.description = "Since childhood I've been interested in coding and design. But my orientation is in the coding." +
				" Putting design and coding together is something i think is essential to understand the workflow and processes of creating a neat product or service.";
		p.pictures.add("drawable/headpic_carl");
		projects.add(p);
		
		
		// Project 1:
		Project p2 = new Project();
		p2.name = "Text Effect";
		p2.description = "Text Effect was a project for SOS Barnbyar to make young adult donate more";
		p2.pictures.add("drawable/sosbarn");
		projects.add(p2);

		
		// Project 2:
		Project p3 = new Project();
		p3.name = "APK - Alkohol per Krona";
		p3.description = "APK - Alkohol per Krona is an app for calculation of the alcohol value you get at systembolaget";
		p3.pictures.add("drawable/apk");
		projects.add(p3);
	}

}