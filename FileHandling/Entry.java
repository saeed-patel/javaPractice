package com.dbda.assignment.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.dbda.assignment.ConsoleInput;

public class Entry {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\dbda.STUDENTSDC\\Desktop\\Saeed_Sanket\\assignment1";
		
		System.out.println("Enter the data to store in file: \n");
		
		String data = ConsoleInput.getString(); 
		
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(fileName, true);
			
			fileOutputStream.write(data.getBytes());
			
			System.out.println("File Saved!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}