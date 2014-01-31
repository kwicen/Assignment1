package com.example.kwicento_count;

import java.io.Serializable;
import java.util.ArrayList;

import android.view.View;
import android.widget.Button;

public class Counter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	protected Button countButton;
	protected int count;
	protected String name;
	protected ArrayList<Counts> countsList;
	
	public Counter()
	{
		countsList = null;
		count = 0;
	}
	
	public Button getCountButton() {
		return countButton;
	}
	
	public void setCountButton(Button countButton) {
		this.countButton = countButton;
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
	
	public void incrementCount(View v)
	{
		(this.count)++;
	}
	
}
