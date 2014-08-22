package com.priyashi.abstarctnavigation;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AbstractNavigation extends Activity{
	public ListView leftnavigationList;
	public ListView rightnavigationList;
	DrawerLayout drawer;
	 String [] aar_left={"First item","Second item","Third item","Fourth item","Fifth item"};
	 String [] aar_right={"Six item","item 7","item 8"," item 9","End "};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abstract_navigation);
		drawer=(DrawerLayout) findViewById(R.id.drawer_layout);
		leftnavigationList=(ListView) findViewById(R.id.left_drawer);
		rightnavigationList=(ListView) findViewById(R.id.right_drawer);
		 leftnavigationList.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, aar_left));
		 rightnavigationList.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, aar_right));
		
		 
		 //#########################################################################
		 // Note click event child class me implement kr skte hai  nd yha par bhi as per developer requirment
		 //*********************************************************************************************************
	    }

}
