package com.example.portfolioapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;




public class SplashActivity extends Activity implements android.view.View.OnClickListener {

	ImageButton gotoMainBtn;
	TextView xmlText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		gotoMainBtn = (ImageButton) findViewById(R.id.gotoMainBtn);
		gotoMainBtn.setVisibility(View.GONE); //temporary hide the continue button
		
		/*
		 * Timer for opening the MainActivity after 2000milliseconds.
		 * CountDownTimer(time, interval)
		 */
		new CountDownTimer(1000, 1000) {
			@Override
			public void onTick(long arg0) {
				// TODO Auto-generated method stub
				// Nothing needs to be done here.
			}			
			public void onFinish() {
				//gotoMainBtn.setVisibility(View.VISIBLE); //temporary hide the continue button
				//Intent myintent = new Intent(SplashActivity.this, MainActivity.class); // Open the MainActivity view
				//startActivity(myintent);
				
				Intent myintent = new Intent(SplashActivity.this, MainActivity.class); // Open the MainActivity view
				startActivity(myintent);	
			
			}
		}.start();


	}
	
	@Override
	public void onClick(View v) {
		if(v==gotoMainBtn){
			System.out.println("gotoMainBtn pressed");  // print to console

			Intent myintent = new Intent(SplashActivity.this, MainActivity.class); // Open the MainActivity view
			startActivity(myintent);
		}

	}

}

