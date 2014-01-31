package com.example.kwicento_count;

import java.io.Serializable;
import java.util.ArrayList;

public class CounterListModel implements Serializable{

	private static final long serialVersionUID = 1L;
	protected ArrayList<Counter> currentCounters;
	
	public CounterListModel()
	{
		currentCounters = null;	
	}
	
	public ArrayList<Counter> getCurrentCounters() {
		return currentCounters;
	}
	public void setCurrentCounters(ArrayList<Counter> currentCounters) {
		this.currentCounters = currentCounters;
	}
			
	
}
