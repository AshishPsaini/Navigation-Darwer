package com.priyashi.abstarctnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AbstractNavigation {

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
		
		View v = getLayoutInflater().inflate(R.layout.activity_main, null);
		LinearLayout lay_screen = (LinearLayout) findViewById(R.id.content_frame);
		lay_screen.addView(v);
		
		leftnavigationList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				//Use this method to close naviagtion
				drawer.closeDrawer(Gravity.LEFT);
				
				//########   To open Navigation :-----------On Click Button call this method --------drawer.openDrawer(Gravity.LEFT);
				Toast.makeText(getApplicationContext(), aar_left[arg2] +" Go TO NEXT",Toast.LENGTH_LONG).show();
				Intent i=new Intent(MainActivity.this,MainActivity2.class);
				 startActivity(i);
			}
		});
		
		rightnavigationList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(getApplicationContext(), aar_right[arg2],Toast.LENGTH_LONG).show();
				drawer.closeDrawer(Gravity.RIGHT);
			}
		});
		
		
	}

	
}
