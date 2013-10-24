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

		// Profile:
		Project p = new Project();
		p.name = "Jimmi Elofsson";
		p.description = "My name is Jimmi Elofsson and I’m an Hyper Island – Mobile Design & Development -14 student currently located in south part of Sweden. My biggest interests are back-end programming, UX-design, future technology, mobile and meeting unicorns!" +
						"I’m currently looking for a internship in The States or Australia (preferably San Fransisco) for the autumn/winter of 2015. If you know any company or people who I can talk to, please contact me!";
		p.url = "http://www.jelofsson.se/";
		p.pictures.add("drawable/headpic_jimmi");
		projects.add(p);
		// SOS-Barnbyar
		Project sos = new Project();
		sos.name = "SOS-Checkout";
		sos.description = "A suggestion for SOS-barnbyar to help them get more money from the younger generation, " +
						  "It's work in the way that the buyer on a e-commerce can have the ability to send some kronors to the " +
						  "SOS-barnbyar when they are ordering items from the web.";
		sos.pictures.add("drawable/soscheckout");
		sos.pictures.add("drawable/soscheckout1");
		projects.add(sos);
		// KIDS APP
		Project kid = new Project();
		kid.name = "Kids app";
		kid.description = "Application that the Pink Dolphins @ Hyper Island made, to help children keep their creativity!";
		kid.pictures.add("drawable/kidsapp");
		kid.pictures.add("drawable/kidsapp2");
		projects.add(kid);
		
		Project p1 = new Project();
		p1.name = "Conpot.se";
		p1.description = "A website for a newspaper located in Kristianstad Sweden, I made the design and setup the backend.";
		p1.url = "http://www.conpot.se/";
		p1.pictures.add("drawable/conpot");
		p1.pictures.add("drawable/conpot2");
		projects.add(p1);
		 /*
		// Project 2:
		Project p2 = new Project();
		p2.name = "Köpsiten";
		p2.description = "Köp & sälj-site!";
		p2.url = "http://apps.facebook.com/bloppis";
		p2.pictures.add("drawable/kopsiten1");
		p2.pictures.add("drawable/kopsiten2");
		p2.pictures.add("drawable/kopsiten3");
		projects.add(p2);
		*/
	}

}