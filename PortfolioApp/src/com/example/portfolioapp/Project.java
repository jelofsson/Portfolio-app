package com.example.portfolioapp;

import java.util.ArrayList;

import android.app.Activity;

public class Project {

	ArrayList<String> 	pictures	= new ArrayList<String>();
	ArrayList<String> 	videos		= new ArrayList<String>();
	String				description = new String();

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

	public void loadById(int id)
	{
		pictures.clear();
		videos.clear();
		description = new String();
		// Todo... Load from XML file..

		if(id==0){
			description = activity.getResources().getString(R.string.project0_desc);
			pictures.add(R.drawable.continue_button); //TODO, fix this shit :(
			pictures.add();
		}else if(id==1){
			description = activity.getResources().getString(R.string.project1_desc);
		}
		else if(id==2){
			description = activity.getResources().getString(R.string.project3_desc);

		}
		else if(id==3){
			description = activity.getResources().getString(R.string.project4_desc);

		}	
	}

}
