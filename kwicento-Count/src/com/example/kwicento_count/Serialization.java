package com.example.kwicento_count;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import android.content.Context;

public class Serialization {

	protected static final String SAVLOCATION = "file.sav";
	protected Context fileContext;
	
	protected void saving(ArrayList<Counter> countLst)
	{
		try {
			FileOutputStream fos = fileContext.getApplicationContext().openFileOutput(SAVLOCATION, 
					Context.MODE_APPEND);
			fos.write
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
