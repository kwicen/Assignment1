package com.example.kwicento_count;

import java.io.Serializable;
import java.util.ArrayList;

public class CounterListModel implements Serializable{

	private static final long serialVersionUID = 1L;
	protected ArrayList<Counter> currentCounters;
	
	public CounterListModel()
	{
		currentCounters = new ArrayList<Counter>();	
	}
	
	public ArrayList<Counter> getCurrentCounters() {
		return currentCounters;
	}
	public void setCurrentCounters(ArrayList<Counter> currentCounters) {
		this.currentCounters = currentCounters;
	}
			
	public void addNewCounter(Counter c)
	{
		currentCounters.add(c);
	}
	
	public void deleteCounter(Counter c)
	{
		currentCounters.remove(c);
	}
	
}
