package com.example.kwicento_count;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class CounterScreen extends Activity {
	
	protected Counter currObj; 
	//represents the object that will be represented by this screen at this time 

	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actual_counting_screen);
		// Show the Up button in the action bar.
		setupActionBar();
		//Get the name of the counter, and set the name of the button to it
		currObj = new Counter();
		Button text = (Button) findViewById(R.id.button1);
		String name = currObj.getName();
		text.setText(name);
	}

	public void setCurrObj(Counter currObj) {
		this.currObj = currObj;
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.counter_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	//when the main button is pressed, will increment the count of the counter object
	// and update what is displayed on the screen
	public void increment(View view) {
		int num = currObj.getCount();
		num++;
		currObj.setCount(num);
		TextView text = (TextView) findViewById(R.id.counting);
		text.setText("Count: "+num);
	}

	//Updates the counter's count to 0 and changes the count 
	//displayed on screen
	public void reset(View view)
	{
		currObj.setCount(0);
		TextView text = (TextView) findViewById(R.id.counting);
		text.setText("Count: 0");
	}
	
	//Method first gets the array of counters from the home screen, and then 
	//calls the method in CounterListModel that deletes the current counter
	//from its array. then it returns to the list screen
	public void deleteCounter(View view)
	{
		CounterListModel mod = HomeScreen.getNewModel();
		mod.deleteCounter(currObj);
		finish();
	}
	public void editCounter(View view) {
		Intent intent = new Intent(this, EditingCounterScreen.class);
		startActivity(intent);	
	}
	
}
