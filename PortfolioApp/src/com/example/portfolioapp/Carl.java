package com.example.portfolioapp;

import android.location.Address;

public class Carl extends Person {
	
	public Carl()
	{
		super();
		
		// Person info:
		name		= "Carl Blockås";
		description = "Webdesigner/Programmer";
		pictures.add("Carl1");
		
		// Project 1:
		Project p = new Project();
		p.name = "Text Effect";
		p.description = "Text Effect was a project for SOS Barnbyar to make young adult donate more";
		p.pictures.add("drawable/sosbarn1");
		p.pictures.add("drawable/sosbarn2");
		projects.add(p);

		
		// Project 2:
		Project p2 = new Project();
		p2.name = "APK";
		p2.description = "APK - Alkohol per Krona is an app for calculation of the alcohol value you get at systembolaget";
		p2.pictures.add("drawable/apk1");
		p2.pictures.add("drawable/apk2");
		projects.add(p2);
	}

}