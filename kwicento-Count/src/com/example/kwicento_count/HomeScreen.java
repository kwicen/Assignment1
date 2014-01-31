package com.example.kwicento_count;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomeScreen extends Activity {
	
	protected ArrayList <Counter> counterList;
	protected static CounterListModel newModel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter_screen);
		//ArrayList <Counter> counterList = new ArrayList <Counter>();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.counter_screen, menu);
		
		newModel = new CounterListModel();
		ArrayList<Counter> currentList =  newModel.getCurrentCounters();
		//Serialization.saving(currentList);
		return true;
	}
	

	public void createCounter(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CreatingNewCounter.class);
		startActivity(intent);
	}
	
	public void gotoCounterList(View view) {
	    // Do something in response to button
		Intent navi = new Intent(this, CounterListScreen.class);
		startActivity(navi);
	}
	
	public static CounterListModel getNewModel() {
		return newModel;
	}

	public void setNewModel(CounterListModel newModel) {
		this.newModel = newModel;
	}

}
