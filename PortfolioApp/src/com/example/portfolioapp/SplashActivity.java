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
		new CountDownTimer(2000, 1000) {
			@Override
			public void onTick(long arg0) {
				// TODO Auto-generated method stub
				// Nothing needs to be done here.
			}			
			public void onFinish() {
				gotoMainBtn.setVisibility(View.VISIBLE); //temporary hide the continue button
				//Intent myintent = new Intent(SplashActivity.this, MainActivity.class); // Open the MainActivity view
				//startActivity(myintent);		         
			}
		}.start();


	}
	/*
	 * Letting oncClick still being here. Might come good later.
	 * 
	 * 
	 */
	
	@Override
	public void onClick(View v) {
		if(v==gotoMainBtn){
			System.out.println("gotoMainBtn pressed");  // print to console
			
			for(int i= 0; i <= 600; i++){
				int myX = i;
				ImageView iv = (ImageView)findViewById(R.id.splash);
				RelativeLayout.LayoutParams absParams = 
				    (RelativeLayout.LayoutParams)iv.getLayoutParams();
				absParams.bottomMargin = myX;
				iv.setLayoutParams(absParams);
				
			}

			new CountDownTimer(2000, 1000) {
				@Override
				public void onTick(long arg0) {
					// TODO Auto-generated method stub
					// Nothing needs to be done here.
				}			
				public void onFinish() {
					Intent myintent = new Intent(SplashActivity.this, MainActivity.class); // Open the MainActivity view
					startActivity(myintent);	         
				}
			}.start();			
			
			
			

		}

	}

}

