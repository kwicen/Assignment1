package com.example.kwicento_count;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.content.Context;

public class Serialization implements Serializable{

	private static final long serialVersionUID = 1L;
	protected static final String SAVLOCATION = "file.sav";
	protected static Context fileContext;
	
	//takes in the model object and writes it to a file
	protected static void saving(CounterListModel mod)
	{
		try {
			FileOutputStream fos = fileContext.getApplicationContext().openFileOutput(SAVLOCATION, 
					Context.MODE_APPEND);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mod);
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
	
	// reads the model object from the file and then returns it 
	protected CounterListModel loading()
	{
		CounterListModel mod = null;
		try {
			FileInputStream fis = fileContext.getApplicationContext().openFileInput(SAVLOCATION);
			ObjectInputStream ois = new ObjectInputStream(fis);
			mod = (CounterListModel) ois.readObject();
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
		return mod;
	}
	
}
