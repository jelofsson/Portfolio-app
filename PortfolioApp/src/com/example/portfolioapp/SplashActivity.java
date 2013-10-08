package com.example.portfolioapp;

<<<<<<< HEAD
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SplashActivity extends Activity implements android.view.View.OnClickListener {

	ImageButton gotoMainBtn;
=======
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SplashActivity extends Activity {
>>>>>>> f154a42b085ef8c7c2a12875f428cc5d69aa84b1

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
<<<<<<< HEAD
		gotoMainBtn = (ImageButton) findViewById(R.id.gotoMainBtn);

	}
	@Override
	public void onClick(View v) {

		if(v==gotoMainBtn){
			System.out.println("gotoMainBtn pressed");
			Intent myintent = new Intent(this, MainActivity.class);
			startActivity(myintent);
		}

	}
=======
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

>>>>>>> f154a42b085ef8c7c2a12875f428cc5d69aa84b1
}
