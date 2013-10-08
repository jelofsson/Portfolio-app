package com.example.portfolioapp;

import java.util.ArrayList;

public class Project {
	
	ArrayList<String> 	pictures	= new ArrayList<String>();
	ArrayList<String> 	videos		= new ArrayList<String>();
	String				description = new String();
	
	public Project()
	{
		super();
	}
	
	public String 	getPicture(int position) 	{ return pictures.get(position); }
	public void 	removePicture(int position) { pictures.remove(position); }
	public String 	getVideo(int position) 		{ return videos.get(position); }
	public void 	removeVideo(int position) 	{ videos.remove(position); }
	public String	getDescription()			{ return description; }
	
	public ArrayList<String> getPictures() { return pictures; }
	public ArrayList<String> getVideos() { return videos; }
	
	public void loadProjectById(int id)
	{
		// Todo...
	}

}