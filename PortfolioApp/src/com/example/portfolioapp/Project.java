package com.example.portfolioapp;

import java.util.ArrayList;

import android.app.Activity;

public class Project {

	ArrayList<String> 	pictures	= new ArrayList<String>();
	ArrayList<String> 	videos		= new ArrayList<String>();
	String				description,name = new String();

	Activity activity = new Activity();
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

}