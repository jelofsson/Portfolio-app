package com.example.portfolioapp;

import java.util.ArrayList;

public class Person {
	
	String 				name		= new String();
	ArrayList<Project>	projects	= new ArrayList<Project>();
	
	public Person()
	{
		super();
	}
	
	public Project getProjectById(int id) { return (projects.size()==0) ? new Project() : (projects.size()>=id) ? projects.get(0) : projects.get(id); }
	
	public void loadByName(String n)
	{
		name = n;
		projects.clear();
		// Todo.. load the users projects into ArrayList projects!
	}
	
}
