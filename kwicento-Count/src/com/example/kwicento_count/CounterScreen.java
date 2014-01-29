package com.example.kwicento_count;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class CounterScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.counter_screen, menu);
		return true;
	}
	
	public void createCounter(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CreatingNewButton.class);
		startActivity(intent);
	}

}
