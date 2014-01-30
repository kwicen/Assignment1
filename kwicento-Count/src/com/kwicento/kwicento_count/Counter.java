package com.kwicento.kwicento_count;

import java.util.ArrayList;

import android.view.View;
import android.widget.Button;

public class Counter {
	
	protected Button countButton;
	protected int runningCount;
	protected ArrayList <Counts> lst;
	protected String name;
	
	
	public Button getCountButton() {
		return countButton;
	}
	
	public void setCountButton(Button countButton) {
		this.countButton = countButton;
	}
	
	public int getCount() {
		return runningCount;
	}
	
	public void setCount(int count) {
		this.runningCount = count;
	}
	
	public ArrayList<Counts> getLst() {
		return lst;
	}
	
	public void setLst(ArrayList<Counts> lst) {
		this.lst = lst;
	}
	
	public void incrementCount(View v)
	{
		(this.runningCount)++;
	}
	
	public void reset(View v)
	{
		(this.runningCount) = 0;
		ArrayList <Counts> lst = new ArrayList <Counts>();
	}
}
