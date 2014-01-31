package com.example.kwicento_count;

import java.io.Serializable;
import java.util.ArrayList;


public class Counter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	protected int count;
	protected String name;
	protected ArrayList<Counts> countsList;
	
	public Counter()
	{
		countsList = null;
		count = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
