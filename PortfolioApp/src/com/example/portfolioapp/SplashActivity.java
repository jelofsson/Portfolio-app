package com.example.portfolioapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;




public class SplashActivity extends Activity implements android.view.View.OnClickListener {

	ImageButton gotoMainBtn;
	TextView xmlText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		gotoMainBtn = (ImageButton) findViewById(R.id.gotoMainBtn);
		xmlText = (TextView) findViewById(R.id.xmlText);
	
		String mess = getResources().getString(R.string.project1_desc1); // example how to read from XML
		xmlText.setText(mess); //set text on a label
	}
	@Override
	public void onClick(View v) {

		if(v==gotoMainBtn){
			System.out.println("gotoMainBtn pressed");  // print to console
			Intent myintent = new Intent(this, MainActivity.class); // Open the MainActivity view
			startActivity(myintent);
		}

	}

}

