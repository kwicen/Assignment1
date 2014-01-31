package com.example.kwicento_count;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import android.content.Context;

public class Serialization implements Serializable{

	private static final long serialVersionUID = 1L;
	protected static final String SAVLOCATION = "file.sav";
	protected static Context fileContext;
	
	//takes in the ArrayList storing the counters and writes it to a file
	protected static void saving(ArrayList<Counter> countLst)
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
	
	// reads the counter ArrayList from the file and then returns it 
	@SuppressWarnings("unchecked")
	protected ArrayList<Counter> loading()
	{
		ArrayList<Counter> countLst = null;
		try {
			FileInputStream fis = fileContext.getApplicationContext().openFileInput(SAVLOCATION);
			ObjectInputStream ois = new ObjectInputStream(fis);
			countLst = (ArrayList<Counter>) ois.readObject();
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countLst;
	}
	
}
