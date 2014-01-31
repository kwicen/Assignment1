package com.example.kwicento_count;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import android.content.Context;

public class Serialization implements Serializable{

	private static final long serialVersionUID = 1L;
	protected static final String SAVLOCATION = "file.sav";
	protected Context fileContext;
	
	//takes in the ArrayList storing the counters and writes it to a file
	protected void saving(ArrayList<Counter> countLst)
	{
		try {
			FileOutputStream fos = fileContext.getApplicationContext().openFileOutput(SAVLOCATION, 
					Context.MODE_APPEND);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(countLst);
			oos.flush();
            oos.close();
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
