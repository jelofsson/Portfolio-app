package com.example.portfolioapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProjectActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project);
		
		/**
		 * Things TODO:
		 * ==========================
		 * Check the animation effect
		 * Check for slider (images/videos)
		 * Check for project slider
		 * Button download/information
		 */
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.project, menu);
		return true;
	}

}
