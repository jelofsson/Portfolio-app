package com.example.portfolioapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	ArrayList<Person> persons = new ArrayList<Person>();
	FieldAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Setup the layout activity 
		setContentView(R.layout.activity_main);

		/*
		TODO HERE: Load a list of the persons 
		that we want to show from in the list:
		*/
		Jimmi j = new Jimmi();
		persons.add(j);
		

		// Create dynamic view-list items:
		adapter = new FieldAdapter(this, R.id.listView, persons); /* We are sending the persons ArrayList to our custom adapter */
		ListView listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
	} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
