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
		p.name = "Conpot.se";
		p.description = "Conpot- Den bästa tidningen för entreprenörer inom anläggning, bygg och verkstad";
		p.pictures.add("drawable/conpot");
		p.pictures.add("drawable/conpot2");
		projects.add(p);
	}

}