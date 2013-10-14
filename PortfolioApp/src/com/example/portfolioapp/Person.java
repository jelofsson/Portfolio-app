package com.example.portfolioapp;

import java.util.ArrayList;
import java.util.Random;

public class Person {
	
	String 				name,description	= new String();
	ArrayList<String> 	pictures			= new ArrayList<String>();
	ArrayList<Project>	projects			= new ArrayList<Project>();
	
	public Person()
	{
		super();
	}
	
	public Project getProjectById(int id) 
	{ 
		return (projects.size()==0) ? 
			new Project() : (projects.size()>=id) ? projects.get(0) : projects.get(id); 
	}
	
	public Project getRandomProject()
	{
		Random r = new Random();
		return getProjectById( r.nextInt(projects.size()-1) );
	}
	
}
