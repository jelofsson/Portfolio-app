package com.example.portfolioapp;

public class Kaan extends Person {
	
	public Kaan()
	{
		super();
		
		// Person info:
		name		= "Kaan Orgunmat";
		description = "Webdesigner/Programmer";
		pictures.add("drawable/headpic_kaan");		
		
		// Project 1:
		Project p1 = new Project();
		p1.name = "Kaan Orgunmat";
		p1.description = "A Hyper Island student with many ambitions over electronic world. Looking forward to broaden his mobile landscapes' horizon.";
		p1.pictures.add("drawable/headpic_kaan");
		projects.add(p1);
		
		// Project 2:	
		Project p2 = new Project();
		p2.name = "Brainheart";
		p2.description = "Brainheart is a Swedish online marketplace, " +
				"where donors can seek and purchase small tasks and services from providers. " +
				"In exchange for donations (starting at 50kr) to SOS Barnbyar, a donator will be " +
				"able to learn new skills.";
		p2.pictures.add("drawable/brainheart");
		projects.add(p2);
		
		// Project 3:	
		Project p3 = new Project();
		p3.name = "Memorandom";
		p3.description = "Memorandom is a mobile app that helps people to " +
				"help each other by asking and answering questions. On this platform people " +
				"can share their simple concerns and get answered or even get help with their " +
				"daily tasks. The goal of this app is simply to make the world better through a " +
				"culture of sharing and helpfulness.";
		p3.pictures.add("drawable/memorandom");
		projects.add(p3);
	}

}