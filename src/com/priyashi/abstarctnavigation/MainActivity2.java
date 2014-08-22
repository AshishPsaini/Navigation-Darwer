package com.priyashi.abstarctnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity2 extends AbstractNavigation {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		//#####################################################################################??
		//USE WILL ADD CHILD LAYPOUT IN PARENT LAYOUT NO NEED TO CALL 	setContentView(R.layout.activity_main); METHOD
		
		
		//custom Title if requird 
		View header_child = getLayoutInflater().inflate(R.layout.title, null);
		LinearLayout lay_title = (LinearLayout) findViewById(R.id.title);
		lay_title.addView(header_child);

		//Main layout of child screen
		
		View v = getLayoutInflater().inflate(R.layout.activity_main2, null);
		LinearLayout lay_screen = (LinearLayout) findViewById(R.id.content_frame);
		lay_screen.addView(v);
		
		leftnavigationList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				drawer.closeDrawer(Gravity.LEFT);
				Toast.makeText(getApplicationContext(), aar_left[arg2] +" Go To BACK",Toast.LENGTH_LONG).show();
				finish();
				
			}
		});
		
		rightnavigationList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(getApplicationContext(), aar_left[arg2],Toast.LENGTH_LONG).show();
				drawer.closeDrawer(Gravity.RIGHT);
			}
		});
		
		
	}

	
}
