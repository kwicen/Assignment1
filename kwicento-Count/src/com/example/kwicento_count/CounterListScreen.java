package com.example.kwicento_count;


import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class CounterListScreen extends Activity {
	
	private ListView existingCounters;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter_list_screen);
		// Show the Up button in the action bar.
		setupActionBar();
		existingCounters = (ListView) findViewById(R.id.currCounterList);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		CounterListModel mod = HomeScreen.getNewModel();
		ArrayList<Counter> arr = mod.getCurrentCounters();
		ArrayList<String> stringCounts = new ArrayList<String>();
		
		//Create an array of strings containing the name and counts of the counters to display
		for (int i=0; i<arr.size();i++)
		{
			String newValue = (arr.get(i)).getName()+": "+(arr.get(i)).getCount();
			stringCounts.add(newValue);
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item, stringCounts);
		existingCounters.setAdapter(adapter);
		
		
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
		getMenuInflater().inflate(R.menu.counter_list_screen, menu);
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

}
