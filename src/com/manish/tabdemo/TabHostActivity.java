package com.manish.tabdemo;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabHostActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_host);
	
		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Reusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, HomeActivity.class);
		spec = tabHost.newTabSpec("home")
				.setIndicator("HOME", res.getDrawable(R.drawable.ic_tab_home))
				.setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs

		intent = new Intent().setClass(this, AboutActivity.class);
		spec = tabHost.newTabSpec("about")
				.setIndicator("ABOUT", res.getDrawable(R.drawable.ic_tab_about))
				.setContent(intent);
		tabHost.addTab(spec);
		
		 
		intent = new Intent().setClass(this, ContactActivity.class);
		spec = tabHost
				.newTabSpec("contact")
				.setIndicator("CONTACT",
						res.getDrawable(R.drawable.ic_tab_contact))
				.setContent(intent);
		tabHost.addTab(spec);
		
		//set tab which one you want open first time 0 or 1 or 2
		tabHost.setCurrentTab(0);
		
		
	}
	
}