package com.example.kwicento_count;

import java.util.ArrayList;

import android.view.View;
import android.widget.Button;

public class Counter {
	
	protected Button countButton;
	protected int count;
	protected ArrayList <Counts> lst;
	
	
	public Button getCountButton() {
		return countButton;
	}
	
	public void setCountButton(Button countButton) {
		this.countButton = countButton;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public ArrayList<Counts> getLst() {
		return lst;
	}
	
	public void setLst(ArrayList<Counts> lst) {
		this.lst = lst;
	}
	
	public void incrementCount(View v)
	{
		(this.count)++;
	}
	
	public void reset(View v)
	{
		(this.count) = 0;
		ArrayList <Counts> lst = new ArrayList <Counts>();
	}
}
